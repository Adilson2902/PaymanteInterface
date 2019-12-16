package progam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.model.Contract;
import entities.model.Installment;
import entities.services.ContractPayment;
import entities.services.Paypal;
import entities.services.ProcessContract;


public class Programa {

	public static void main(String[] args) {
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contract date:");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Date:");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract Value:");
		double contract = sc.nextDouble();
		System.out.print("Number of installment:");
	     Contract c1 = new 	Contract(number, date, contract);
		
		int numberinstallment = sc.nextInt();
		
		ProcessContract p1 = new ProcessContract(new Paypal());
		
		p1.contrato(c1, numberinstallment);
		
		for(Installment x : c1.getInstallment()) {
			System.out.println(x);
		}
		
		sc.close();
	}catch(ParseException e) {
		e.getMessage();
	}

}
}