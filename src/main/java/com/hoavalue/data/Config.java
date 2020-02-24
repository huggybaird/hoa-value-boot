

package com.hoavalue.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // This tells Hibernate to make a table out of this class 
@Table(name="hoa_config")
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="name") //, nullable = false, columnDefinition = "int default -1000") 
    private String name;

	private String value; 
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}



}

 