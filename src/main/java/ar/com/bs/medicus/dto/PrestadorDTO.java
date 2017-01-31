package ar.com.bs.medicus.dto;

import java.io.Serializable;

public class PrestadorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idprestador;
    private String nombreyapellido; //se podria poner en dos variables separadas, pero en la base de datos que nos dieron esta asi
	private String filial;
	private String especialidad;
	private String domicilio;
	private String localidad;
	private String telefono;
    
    
    
    public PrestadorDTO() {
		// TODO Auto-generated constructor stub
	}
    
    public PrestadorDTO(int idprestador, String nombreyapellido, String filial, String especialidad, String domicilio, String localidad, String telefono){
       this.idprestador= idprestador;
       this.nombreyapellido= nombreyapellido;
       this.filial= filial;
       this.especialidad= especialidad;
       this.domicilio= domicilio;
       this.localidad= localidad;
       this.telefono= telefono;
       
    	
    }

	public int getIdprestador() {
		return idprestador;
	}

	public void setIdprestador(int idprestador) {
		this.idprestador = idprestador;
	}

	public String getNombreyapellido() {
		return nombreyapellido;
	}

	public void setNombreyapellido(String nombreyapellido) {
		this.nombreyapellido = nombreyapellido;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
