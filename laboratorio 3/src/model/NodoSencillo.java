package model;

public class NodoSencillo {
	private NodoSencillo siguiente;
	private Jutsu jutsu;
	public NodoSencillo( Jutsu jutsu) {
		
		this.siguiente = null;
		this.jutsu = jutsu;
	}
	public NodoSencillo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoSencillo siguiente) {
		this.siguiente = siguiente;
	}
	public Jutsu getJutsu() {
		return jutsu;
	}
	public void setJutsu(Jutsu jutsu) {
		this.jutsu = jutsu;
	} 

}
