package concept.model.services;

import concept.model.entities.CarRental;
import concept.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    // a classe rentalService tem um atributo de uma taxService (algum upcasting)
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental cr) {
        double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        double hours = minutes / 60;
        double days = hours / 24;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(days);
        }

        double tax = taxService.tax(basicPayment);

        cr.setInvoice(new Invoice(basicPayment, tax));
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }
}
