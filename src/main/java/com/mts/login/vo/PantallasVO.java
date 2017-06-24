package com.mts.login.vo;

public class PantallasVO {
	
	
	private String pantallaId;
	private String pantalla;
	private String menu;
	private String dsUrl;
	
	
	
	public  PantallasVO(){};
	
	public  PantallasVO(String pantallaId,
			String pantalla,String menu,String dsUrl){
		
		this.pantallaId = pantallaId;
		this.pantalla = pantalla;
		this.menu = menu;
		this.dsUrl = dsUrl;
		
	}

	public String getPantallaId() {
		return pantallaId;
	}

	public void setPantallaId(String pantallaId) {
		this.pantallaId = pantallaId;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getDsUrl() {
		return dsUrl;
	}

	public void setDsUrl(String dsUrl) {
		this.dsUrl = dsUrl;
	}
	
	
	
	
	
	
	

}
