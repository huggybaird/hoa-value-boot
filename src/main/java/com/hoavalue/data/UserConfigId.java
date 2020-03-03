package com.hoavalue.data;
 

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;


public class UserConfigId implements Serializable {
	 
	@Id
    @Column(name = "userId")
	private int userId;
    
    @Id
    @Column(name = "name")
	private String name;
    
    // default constructor
    public UserConfigId() { 
    } 
    public UserConfigId(int userId, String name) {
        this.userId = userId;
        this.name = name;
    } 

	
    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	  public boolean equals(Object o) {
	      if (this == o) return true;
	      if (o == null || getClass() != o.getClass()) return false;
	      UserConfigId taskId1 = (UserConfigId) o;
	      if (userId != taskId1.userId) return false;
	      return name == taskId1.name;
	  }

	  @Override
	  public int hashCode() {
	      return Objects.hash(userId, name);
	  }
}