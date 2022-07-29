package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class DesafioBarOo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill b = new Bill();
		
		System.out.print("Sexo: ");
		b.gender = sc.next().charAt(0);
		while(b.gender != 'F' && b.gender != 'M') {
			System.out.print("Valor inválido! Favor digitar 'F' ou 'M': ");
			b.gender = sc.next().charAt(0);			
		}
		System.out.print("Quantidade de cervejas: ");
		b.beer = sc.nextInt();		
		System.out.print("Quantidade de refrigerantes: ");
		b.softDrink = sc.nextInt();		
		System.out.print("Quantidade de espetinhos: ");
		b .barbercue = sc.nextInt();		
		System.out.println();
		System.out.println(b);		
		sc.close();
	}
}
