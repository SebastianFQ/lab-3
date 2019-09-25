package model;

public class Jutsu {
	private String nombreNinjutsu;
	private String factorInfluyente;
	public Jutsu(String nombreNinjutsu, String factorInfluyente) {
		
		this.nombreNinjutsu = nombreNinjutsu;
		this.factorInfluyente = factorInfluyente;
	}
	public String getNombreNinjutsu() {
		return nombreNinjutsu;
	}
	public void setNombreNinjutsu(String nombreNinjutsu) {
		this.nombreNinjutsu = nombreNinjutsu;
	}
	public String getFactorInfluyente() {
		return factorInfluyente;
	}
	public void setFactorInfluyente(String factorInfluyente) {
		this.factorInfluyente = factorInfluyente;
	}
	

}
