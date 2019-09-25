package model;

public class NodoDosEnlazado {
	private NodoDosEnlazado anterior;
	private NodoDosEnlazado siguiente; 
	private Personaje personaje;
	public NodoDosEnlazado( Personaje personaje) {
		
		this.anterior = null;
		this.siguiente = null;
		this.personaje = personaje;
	}
	public NodoDosEnlazado getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDosEnlazado anterior) {
		this.anterior = anterior;
	}
	public NodoDosEnlazado getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDosEnlazado siguiente) {
		this.siguiente = siguiente;
	}
	public Personaje getPersonaje() {
		return personaje;
	}
	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	} 
	
	

}
