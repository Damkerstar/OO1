package ar.edu.unlp.objetos.uno.ejer13;

import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta invox;
	
	public void recibir(Email email) {
		this.invox.addEmail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).findFirst().orElse(null);
	}

	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamaño()).sum();
	}
}
