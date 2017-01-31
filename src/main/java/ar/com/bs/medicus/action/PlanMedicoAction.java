package ar.com.bs.medicus.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import ar.com.bs.medicus.model.PlanMedicoModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PlanMedicoAction extends ActionSupport implements ModelDriven<PlanMedicoModel>, SessionAware{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESSLIST = "list";
	
	private Map<String, Object> session;
	private PlanMedicoModel model;
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PlanMedicoModel getModel() {
		return model;
	}

	public static String getSuccesslist() {
		return SUCCESSLIST;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setModel(PlanMedicoModel model) {
		this.model = model;
	}
	public String list(){
		model.setOperation("Listar");
		return SUCCESS;
	}
}
