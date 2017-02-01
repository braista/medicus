package ar.com.bs.medicus.action;

import java.util.ArrayList;

import ar.com.bs.medicus.dto.PacienteDTO;
import ar.com.bs.medicus.services.impl.PacienteServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class PacienteAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PacienteServiceImpl service;
	
	public String list(){
		ArrayList<PacienteDTO> list;
		return SUCCESS;
	}
}
