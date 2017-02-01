package ar.com.bs.medicus.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import ar.com.bs.medicus.dto.TurnoDTO;
import ar.com.bs.medicus.services.TurnoService;
import ar.com.bs.medicus.services.impl.TurnoServiceImpl;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TurnoAction extends ActionSupport implements ModelDriven<TurnoDTO>, SessionAware{
	/**
	 * 
	 */

	private TurnoService turnoService;
	
	private Map<String, Object> session;
	
	public TurnoAction (){
	
		
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public TurnoDTO getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public String list(){
		session.put("results", turnoService.getAll());
		return SUCCESS;
	}
	public void setService(TurnoServiceImpl service){
		this.turnoService= service;
		
		
	}
	
}
