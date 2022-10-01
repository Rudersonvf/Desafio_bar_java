package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = scan.next().charAt(0);
		while(bill.gender != 'F' && bill.gender != 'M') {
			System.out.print("Valor inválido, digite F ou M: ");
			bill.gender = scan.next().charAt(0);
		}
		System.out.print("Quantidade de cervejas: ");
		bill.beer = scan.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = scan.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = scan.nextInt();
		
		System.out.println();
		System.out.println(bill);
		
		scan.close();
	}

}
