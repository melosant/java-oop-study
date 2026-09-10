package ex05.model.services;

public class BrasilInterestService implements InterestService {
    private double interestService;

    public BrasilInterestService(double interestService) {
        this.interestService = interestService;
    }

    @Override
    public double getInterestRate() {
        return this.interestService;
    }
}
