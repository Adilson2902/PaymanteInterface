package entities.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
   int number;
   Date data;
   Double value;
   List <Installment> installment = new ArrayList<>();
   
   public List<Installment> getInstallment() {
	return installment;
}


public void setInstallment(List<Installment> installment) {
	this.installment = installment;
}


public Contract() {
	   
   }


public Contract(int number, Date data, Double value) {
	this.number = number;
	this.data = data;
	this.value = value;
}


public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}


public Date getData() {
	return data;
}


public void setData(Date data) {
	this.data = data;
}


public Double getValue() {
	return value;
}


public void setValue(Double value) {
	this.value = value;
}
   
public void adicionar(Installment installment) {
	this.installment.add(installment);
}

public void remove(Installment installment) {
	this.installment.remove(installment);
}
   



}
