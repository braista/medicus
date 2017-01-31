package ar.com.bs.medicus.dto;

import java.io.Serializable;

public class PracticaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
    private float codigo;
    private String practica;
    
	public PracticaDTO() {
		// TODO Auto-generated constructor stub
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
