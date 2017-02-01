package ar.com.bs.medicus.pojo;


public class Practica{
	    private int IDpractica;
        private float codigo;
		private String practica; 
		
		
	public int getIDpractica() {
			return IDpractica;
		}


		public void setIDpractica(int iDpractica) {
			IDpractica = iDpractica;
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


	public Practica(float codigo, String practica, int IDpractica) {
		 this.codigo= codigo;
		 this.practica= practica;
		 this.IDpractica= IDpractica;
		// TODO Auto-generated constructor stub
		
	}

}
