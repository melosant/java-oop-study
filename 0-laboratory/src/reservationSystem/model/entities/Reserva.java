package reservationSystem.model.entities;

import reservationSystem.model.enums.StatusReserva;
import reservationSystem.model.exception.ReservaCanceladaException;

public class Reserva {
    private Recurso recurso;
    private Integer horas;
    private StatusReserva status;

    public Reserva() {
    }

    public Reserva(Recurso recurso, Integer horas) {
        this.recurso = recurso;
        this.horas = horas;
        this.status = StatusReserva.PENDENTE;
    }

    public void confirmar() {
        this.status = StatusReserva.CONFIRMADA;
    }

    public void cancelar() throws ReservaCanceladaException {
        if (status == StatusReserva.CANCELADA) {
            throw new ReservaCanceladaException();
        }
        this.status = StatusReserva.CANCELADA;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public StatusReserva getStatus() {
        return status;
    }
}
