package ex01.model.services;

import ex01.model.entities.Contract;
import ex01.model.entities.Installment;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double amountInstallment = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double interest = amountInstallment + paymentService.interest(amountInstallment, i);
            double amount = interest + paymentService.paymentFee(interest);
            Installment installment = new Installment(contract.getDate().plusMonths(i), amount);
            contract.addInstallment(installment);
        }
    }
}
