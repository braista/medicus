package ar.com.bs.medicus.pojo;


public class Prestador{
	  private int Idprestador;
      private String nombreyapellido;
      private String filial;
      private String especialidad;
      private String domicilio;
      private String localidad;
      private String telefono;
      
      
	public Prestador(int Idprestador,String nombreyapellido, String filial, String especialidad, String domicilio, String telefono, String localidad) {
		 this.Idprestador=Idprestador; 
		 this.nombreyapellido=nombreyapellido;
		 this.filial=filial;
		 this.especialidad=especialidad;
		 this.domicilio=domicilio;
		 this.telefono=telefono;
		 this.localidad=localidad;
		// TODO Auto-generated constructor stub
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
