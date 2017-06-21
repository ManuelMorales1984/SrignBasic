package com.mts.domain;

public class CommonRequest {
	
	private String id;
	private String key;
	private String val;
	
	
	public CommonRequest(){};
	
	
	public CommonRequest(String id,
			String key,String val){
		this.id= id;
		this.key = key;
		this.val = val;
		
	};
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
	
	
	
	

}
