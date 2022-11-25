package logic;

import org.jfugue.player.Player;

public class Notas {
	Player p = new Player();
	
	public void notaDo() {
		p.play("C");
	}
	
	public void notaRe() {
		p.play("D");
	}
	public void notaMi() {
		p.play("E");
	}
	public void notaFa() {
		p.play("F");
	}
	public void notaSol() {
		p.play("G");
	}
	public void notaLa() {
		p.play("A");
	}
	public void notaSi() {
		p.play("B");
	}
	
	
}
