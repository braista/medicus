package ar.com.bs.medicus.pojo;


public class Practica{
        private float codigo;
		private String practica; 
		
		
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


	public Practica(float codigo, String practica) {
		 this.codigo= codigo;
		 this.practica= practica;
		// TODO Auto-generated constructor stub
		
	}

}
