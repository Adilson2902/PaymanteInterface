package entities.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     Date dueDate; 
     Double saldo;
     
     public Installment() {
    	 
     }

	public Installment(Date dueDate, Double saldo) {
		this.dueDate = dueDate;
		this.saldo = saldo;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + saldo ;
	}
     
     
     
}
