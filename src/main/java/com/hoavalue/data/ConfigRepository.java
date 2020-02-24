package com.hoavalue.data;

import org.springframework.data.repository.CrudRepository;

 
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ConfigRepository extends CrudRepository<Config, String> {

}