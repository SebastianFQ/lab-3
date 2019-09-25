package model;

public class Personaje {
	private String nombre;
	private String personalidad;
	private String fechaCreacion;
	private double poder;
	private NodoSencillo jutsitos; 
	
	public Personaje(String nombre, String personalidad, String fechaCreacion) {
		this.nombre = nombre;
		this.personalidad = personalidad;
		this.fechaCreacion = fechaCreacion;
		this.poder = 1;
		this.jutsitos = null; 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPersonalidad() {
		return personalidad;
	}
	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public double getPoder() {
		return poder;
	}
	public void setPoder(double poder) {
		this.poder = poder;
	}
	public NodoSencillo getJutsitos() {
		return jutsitos;
	}
	public void setJutsitos(NodoSencillo jutsitos) {
		this.jutsitos = jutsitos;
	}
	public void agregarJutsu (Jutsu jutsu){
		if(jutsitos == null){
			jutsitos = new NodoSencillo(jutsu);
		}else{
			NodoSencillo actual = jutsitos;
			while(actual.getSiguiente()!= null){
				actual = actual.getSiguiente(); 	
			}
			actual.setSiguiente(new NodoSencillo(jutsu));
		}
	}
	public void eliminarJutsu (Jutsu justu){
		if(jutsitos != null){
			NodoSencillo actual = jutsitos; 
			while(actual.getSiguiente()!= null){
				
				
			}
			
		}
	}
	
	
	 
	

}
