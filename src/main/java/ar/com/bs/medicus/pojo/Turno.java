package ar.com.bs.medicus.pojo;

import java.util.Date;

public class Turno{

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
	
	public Turno() {
		// TODO Auto-generated constructor stub
	}

	public Turno(int idturno, int nroTurno, Paciente paciente, Date llegada, Date inicio, Prestador prestador,
			Practica practica, PlanMedico plan, float importe, String observaciones) {
		this.idturno = idturno;
		this.nroTurno = nroTurno;
		this.paciente = paciente;
		this.llegada = llegada;
		this.inicio = inicio;
		this.prestador = prestador;
		this.practica = practica;
		this.importe = importe;
		this.plan = plan;
		this.observaciones = observaciones;
	}

	public PlanMedico getPlan() {
		return plan;
	}

	public void setPlan(PlanMedico plan) {
		this.plan = plan;
	}

	public int getIdturno() {
		return idturno;
	}

	public void setIdturno(int idturno) {
		this.idturno = idturno;
	}

	public int getNroTurno() {
		return nroTurno;
	}

	public void setNroTurno(int nroTurno) {
		this.nroTurno = nroTurno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	public Practica getPractica() {
		return practica;
	}

	public void setPractica(Practica practica) {
		this.practica = practica;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
