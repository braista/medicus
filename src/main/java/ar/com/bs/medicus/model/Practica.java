package ar.com.bs.medicus.model;

import java.io.Serializable;

public class Practica implements Serializable {
	private static final long serialVersionUID = 1L;
    private float codigo;
    private String practica;
    
    
	public Practica() {
		// TODO Auto-generated constructor stub
	}
  /*
   * Inicializacion de variables 
   */
	public Practica( float codigo, String practica) {
		this.codigo= codigo;
		this.practica= practica;
		
	}

	public float getCodigo() {
		return codigo;
	}


	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}


	public String getPractica() {
		return practica;
	}


	public void setPractica(String practica) {
		this.practica = practica;
	}
	

}
