package ar.com.bs.medicus.model;

import ar.com.bs.medicus.dto.PlanMedicoDTO;

public class PlanMedicoModel {
	
	private int id;
	private PlanMedicoDTO plan;
	private boolean readOnly = false;	
	private String operation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PlanMedicoDTO getPlan() {
		return plan;
	}
	public void setPlan(PlanMedicoDTO plan) {
		this.plan = plan;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
		
}
