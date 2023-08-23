package juego;
public class Raiden extends Luchador{
	private int vida;
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	private void teletransportacion() {
		System.out.println("Raiden se esta teletransportando");
	}
	@Override
	public void atacar() {
		if(vida>0) {
			teletransportacion();
		}
		else {
			System.out.println("No tiene vidas para atacar");
		}
	}
}
