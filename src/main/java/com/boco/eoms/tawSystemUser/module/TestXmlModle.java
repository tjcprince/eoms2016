package com.boco.eoms.tawSystemUser.module;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestXmlModle {
	
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
