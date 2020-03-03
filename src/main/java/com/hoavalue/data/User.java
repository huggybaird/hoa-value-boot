package com.hoavalue.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class 
@Table(name="hoa_user")
public class User {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId") //, nullable = false, columnDefinition = "int default -1000") 
    private long userId;

    private String name;

    private String email;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}