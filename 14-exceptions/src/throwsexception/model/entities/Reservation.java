package throwsexception.model.entities;

import throwsexception.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /*
    por ser uma exceção herdada de Exception, ou eu a trato no método,
    ou a propago (o que era o correto nessa situação).

    construtores podem ter tratamento de exceções (lógica de validação).
    */
    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long durationDays() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    /*
    por ser uma exceção herdada de Exception, ou eu a trato no método,
    ou a propago (o que era o correto nessa situação).

    caso caia no tratamento, a exceção é lançada e o programa dispara a mensagem.
    */
    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
            throw new DomainException("Reservation dates for update must be future");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room: " + roomNumber);
        sb.append(", check-in: " + checkIn.format(formatter));
        sb.append(", check-out: " + checkOut.format(formatter));
        sb.append(", " + durationDays());
        sb.append(" nights.");

        return sb.toString();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
}
