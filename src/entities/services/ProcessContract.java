package entities.services;

import java.util.Calendar;
import java.util.Date;

import entities.model.Contract;
import entities.model.Installment;

public class ProcessContract {
    private ContractPayment contrato;
    
    public ProcessContract(ContractPayment contrato) {
    	this.contrato= contrato;
    }
    
    public void contrato(Contract contracto, int month) {
    	double saldo = contracto.getValue()/month;
    	
    	for (int i = 1; i <= month; i++) {
			Date Mes = addMonths(contracto.getData(), i);
			
			double updatecontract = saldo + contrato.duepayment(saldo, i);
			double lastsaldo = updatecontract+ this.contrato.payment(updatecontract);
			
			contracto.adicionar(new Installment(Mes, lastsaldo));
		}
    	
    }
    
    
    private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
    
}
