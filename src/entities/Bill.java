package entities;

import util.PriceTable;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbercue;
	public int softDrink;
	
	public double cover() {
		return (feeding() > 30.0) ? 0.0 : PriceTable.COUVERT;
	}
	
	public double feeding() {
		return PriceTable.totalBeer(beer) 
				+ PriceTable.totalBarbercue(barbercue) 
				+ PriceTable.totalSoftdrink(softDrink);				
	}
	
	public double ticket() {
		return PriceTable.totalTicket(gender);
	}
	
	public double total() {		
		return cover() + feeding() + ticket();		
	}

	public String freeOrPay() {		
		return (cover() == 0.0)
				? "Isento de Couvert\n"
				: "Couvert = R$ " 
				+ String.format("%.2f\n", cover());		
	}
	
	public String toString() {
		return "RELATÓRIO:\n"
				+ "Consumo = R$ "
				+ String.format("%.2f\n", feeding())
				+ freeOrPay()
				+ "Ingresso = R$ "
				+ String.format("%.2f\n\n", ticket())
				+ "Valor a pagar = R$ "
				+ String.format("%.2f\n", total());
	}
}
