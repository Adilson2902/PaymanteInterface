package entities.services;

public interface ContractPayment {
    public double payment(double amount);
    public double duepayment(double amount,int months);
    
}
