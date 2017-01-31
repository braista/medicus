package ar.com.bs.medicus.dto;

import java.io.Serializable;
import java.util.Date;

public class TurnoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idturno;
	private int nroTurno;
	private PacienteDTO paciente;
	private PlanMedicoDTO plan;
	private Date llegada;
	private Date inicio;
	private PrestadorDTO prestador;
	private PracticaDTO practica;
	private float importe;
	private String observaciones;	
	
	public TurnoDTO() {
		// TODO Auto-generated constructor stub
	}

	public TurnoDTO(int idturno, int nroTurno, PacienteDTO paciente, Date llegada, Date inicio, PrestadorDTO prestador,
			PracticaDTO practica, PlanMedicoDTO plan, float importe, String observaciones) {
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

	public PlanMedicoDTO getPlan() {
		return plan;
	}

	public void setPlan(PlanMedicoDTO plan) {
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

	public PacienteDTO getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteDTO paciente) {
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

	public PrestadorDTO getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorDTO prestador) {
		this.prestador = prestador;
	}

	public PracticaDTO getPractica() {
		return practica;
	}

	public void setPractica(PracticaDTO practica) {
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
