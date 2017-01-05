package org.jhidalgo3.lb.models;

/**
 * 
 * @author jhidalgo3 
 *
 */
public class Ping {
	private String instance;
	
	private String version;
	
	public Ping (String instance, String version){
		this.instance = instance;
		this.version= version;
	}
	
	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
