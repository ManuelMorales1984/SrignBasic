package com.mts.login.vo;

public class RolesVO {
	
	private String rolId;
	private String dsRol;
	
	public  RolesVO(){};
	
	
	public  RolesVO( String rolId, String dsRol){
		this.rolId =rolId;
		this.dsRol = dsRol;
	};
	
	
	
	public String getRolId() {
		return rolId;
	}
	public void setRolId(String rolId) {
		this.rolId = rolId;
	}
	public String getDsRol() {
		return dsRol;
	}
	public void setDsRol(String dsRol) {
		this.dsRol = dsRol;
	}
	
	
	
	
	

}
