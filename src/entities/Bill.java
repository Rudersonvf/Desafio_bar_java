package entities;

public class Bill {
	
	public final double MIN_FEEDING = 30.0;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if(feeding() > MIN_FEEDING) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double feeding() {
		return beer + barbecue + softDrink;
	}
	
	public double ticket() {
		if(gender == 'M') {
			return 10.0;
		}
		else {
			return 8.0;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
	
	public String toString() {
		if(feeding() > MIN_FEEDING) {
			return String.format("RELATÓRIO: %n")
					+ String.format("Consumo = R$ %.2f%n", feeding())
					+ String.format("Isento de Couvert %n")
					+ String.format("Ingresso = R$ %.2f%n%n", ticket())
					+ String.format("Valor a pagar = R$ %.2f%n", total());
		}
		else {
			return String.format("RELATÓRIO: %n")
					+ String.format("Consumo = R$ %.2f%n", feeding())
					+ String.format("Couvert = R$ %.2f%n", cover())
					+ String.format("Ingresso = R$ %.2f%n%n", ticket())
					+ String.format("Valor a pagar = R$ %.2f%n", total());
		}
	}
}
