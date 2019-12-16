package entities.services;

public class Paypal implements ContractPayment {
  private static final double FEE_PERCENTAGE= 0.02;
  private static final double Month_PERCENTAGE= 0.01;

  
  @Override
public double payment(double amount) {
	
	return amount * FEE_PERCENTAGE;
}
@Override
public double duepayment(double amount, int months) {
	// TODO Auto-generated method stub
	return amount * Month_PERCENTAGE * months;
}
  
  
}
