package ar.com.bs.medicus.dto;

import java.io.Serializable;

public class PlanMedicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idplan;
	private String descripcion;
	
	public PlanMedicoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public PlanMedicoDTO(int idplan, String descripcion) {
		super();
		this.idplan = idplan;
		this.descripcion = descripcion;
	}

	public int getIdplan() {
		return idplan;
	}

	public void setIdplan(int idplan) {
		this.idplan = idplan;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
