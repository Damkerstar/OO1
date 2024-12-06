package ar.edu.unlp.info.oo1.ejer7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida = false;
	private List<Farola> enlace = new ArrayList<Farola>();
	
	public void turnOn() {
		if(encendida == false) {
			encendida = true;
		}
		metodo(true);
	}
	
	public void turnOff() {
		if(encendida == true) {
			encendida = false;
		}
		metodo(false);
	}
	
	private void metodo(boolean b) {
		if(enlace != null) {
			encenderFaroles(b);
		}
	}
	
	public void encenderFaroles(boolean b) {
		for(Farola f: enlace) {
			System.out.println(b);
			if(b) {
				f.turnOn();
			}
			else {
				f.turnOff();
			}
		}
	}
	
	public void pairWithNeighbor(Farola f) {
		this.enlace.add(f);
		f.anadirFarola(this);
	}
	
	public void anadirFarola(Farola f) {
		enlace.add(f);
	}
	
	public boolean isOn() {
		return encendida;
	}
	
	public boolean isOff() {
		return !encendida;
	}
	
	public List<Farola> getNeighbors(){
		return new ArrayList<Farola>(enlace);
	}

}
