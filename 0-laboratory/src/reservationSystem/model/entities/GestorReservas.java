package reservationSystem.model.entities;

import reservationSystem.model.enums.StatusReserva;
import reservationSystem.model.exception.HorasInvalidasException;
import reservationSystem.model.exception.RecursoIndisponivelException;
import reservationSystem.model.exception.ReservaCanceladaException;
import reservationSystem.model.exception.ReservaException;

import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public GestorReservas() {
    }

    public Reserva criarReserva(Recurso recurso, int horas) throws ReservaException {
        if (horas <= 0) {
            throw new HorasInvalidasException();
        }

        if (recurso.disponivel == false) {
            throw new RecursoIndisponivelException();
        }

        Reserva reserva = new Reserva(recurso, horas);
        reservas.add(reserva);
        recurso.setDisponivel(false);

        return reserva;
    }

    public void cancelarReserva(Reserva reserva) throws ReservaCanceladaException {
        reserva.cancelar();
        reserva.getRecurso().setDisponivel(true);
    }

    public List<Reserva> listarPorStatus(StatusReserva statusReserva) {
        return new ArrayList<>(reservas.stream()
                .filter(r -> r.getStatus() == statusReserva)
                .toList());
    }
}
