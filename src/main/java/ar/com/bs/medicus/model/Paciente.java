package ar.com.bs.medicus.model;

import java.io.Serializable;
import java.util.Date;

public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idpaciente;
	private String apellido;
	private String nombre;
	private String tipoDocumento;
	private String nroDocumento;
	private String direccion;
	private String telefono;
	private String email;
	private Date fechaNacimiento;
	private String sexo;
	private String estadoCivil;
	private int familiares;
	private PlanMedico plan;
	private int nroAfiliado;
	private boolean eliminado;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(int idpaciente, String apellido, String nombre, String tipoDocumento, String nroDocumento,
			String direccion, String telefono, String email, Date fechaNacimiento, String sexo, String estadoCivil,
			int familiares, PlanMedico plan, int nroAfiliado, boolean eliminado) {
		this.idpaciente = idpaciente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.familiares = familiares;
		this.plan = plan;
		this.nroAfiliado = nroAfiliado;
		this.eliminado = eliminado;
	}

	public int getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getFamiliares() {
		return familiares;
	}

	public void setFamiliares(int familiares) {
		this.familiares = familiares;
	}

	public PlanMedico getPlan() {
		return plan;
	}

	public void setPlan(PlanMedico plan) {
		this.plan = plan;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

}
