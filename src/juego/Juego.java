package juego;

public class Juego {

	public static void main(String[] args) {
		Raiden raiden1 = new Raiden();
		raiden1.setVida(6);
		System.out.println("Vidas de Raiden: " + raiden1.getVida());
		raiden1.atacar();
	}
}
