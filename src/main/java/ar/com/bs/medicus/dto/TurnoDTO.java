package ar.com.bs.medicus.dto;

import java.io.Serializable;
import java.util.Date;

import ar.com.bs.medicus.model.Paciente;
import ar.com.bs.medicus.model.PlanMedico;
import ar.com.bs.medicus.model.Practica;
import ar.com.bs.medicus.model.Prestador;

public class TurnoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6800262613138110067L;
	

	private int idturno;
	private int nroTurno;
	private Paciente paciente;
	private PlanMedico plan;
	private Date llegada;
	private Date inicio;
	private Prestador prestador;
	private Practica practica;
	private float importe;
	private String observaciones;
	/**
	 * @return the idturno
	 */
	public int getIdturno() {
		return idturno;
	}
	/**
	 * @param idturno the idturno to set
	 */
	public void setIdturno(int idturno) {
		this.idturno = idturno;
	}
	/**
	 * @return the nroTurno
	 */
	public int getNroTurno() {
		return nroTurno;
	}
	/**
	 * @param nroTurno the nroTurno to set
	 */
	public void setNroTurno(int nroTurno) {
		this.nroTurno = nroTurno;
	}
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}
	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	/**
	 * @return the plan
	 */
	public PlanMedico getPlan() {
		return plan;
	}
	/**
	 * @param plan the plan to set
	 */
	public void setPlan(PlanMedico plan) {
		this.plan = plan;
	}
	/**
	 * @return the llegada
	 */
	public Date getLlegada() {
		return llegada;
	}
	/**
	 * @param llegada the llegada to set
	 */
	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}
	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}
	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	/**
	 * @return the prestador
	 */
	public Prestador getPrestador() {
		return prestador;
	}
	/**
	 * @param prestador the prestador to set
	 */
	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	/**
	 * @return the practica
	 */
	public Practica getPractica() {
		return practica;
	}
	/**
	 * @param practica the practica to set
	 */
	public void setPractica(Practica practica) {
		this.practica = practica;
	}
	/**
	 * @return the importe
	 */
	public float getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(float importe) {
		this.importe = importe;
	}
	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}	
	
}
