package ar.com.bs.medicus.pojo;


public class PlanMedico {
	
	private int idplan;
	private String descripcion;
	
	public PlanMedico() {
		// TODO Auto-generated constructor stub
	}
	
	public PlanMedico(int idplan, String descripcion) {
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
