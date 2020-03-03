package com.hoavalue.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 

 
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserConfigRepository extends CrudRepository<UserConfig, UserConfigId> {
	 /* 
	    Spring Data JPA will automatically parse this method name 
	    and create a query from it
	 */
	List<UserConfig> findByUserId(int userId);

	//List<UserConfig> findByUserId(int userId);
}