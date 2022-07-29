package util;

public class PriceTable {

	public static final double BEER = 5.0;
	public static final double SOFTDRINK = 3.0;
	public static final double BARBERCUE = 7.0;
	public static final double COUVERT = 4.0;
	public static final double MEN = 10.0;
	public static final double WOMEM = 8.0;

	public static double totalBeer(int beer) {
		return beer * BEER;
	}

	public static double totalSoftdrink(int softDrink) {
		return softDrink * SOFTDRINK;
	}

	public static double totalBarbercue(int barbercue) {
		return barbercue * BARBERCUE;
	}

	public static double totalTicket(char gender) {
		return (gender == 'M') ? MEN : WOMEM;
	}	

}
