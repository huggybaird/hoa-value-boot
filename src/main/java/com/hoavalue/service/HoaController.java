package com.hoavalue.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hoavalue.data.HoaRepository;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.hoavalue.data.Hoa;
import com.hoavalue.data.HoaUserNotFoundException;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080", "http://hoavalue.com" })
@RestController
@RequestMapping(path="/api/hoa") // This means URL's start with /demo (after Application path)
@Tag(name = "Homeowner Association (HOA)", description = "Operations to add, update, get, and delete details about a HOA")

public class HoaController {
	@Autowired // This means to get the bean called userRepository// Which is auto-generated by Spring, we will use it to handle the data
	private HoaRepository hoaRepository;

	//@ApiOperation(value = "Add a new Homeowner Association (HOA)") 
	   
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	public @ResponseBody String addNewUser (@RequestParam String name
//			, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//
//		Hoa n = new Hoa();
//		n.setName(name);
//		//n.setEmail(email);
//		hoaRepository.save(n);
//		return "Saved";
//	}
	
	/*
{
  "address1": "123 Main St",
  "address2": "Apt 201",
  "city": "Lakewood",
  "floorCount": 10,
  "hoaWebsiteUrl": "www.MyHoaWebsite.com",
  "name": "My Hoa Name",
  "propertyType": "Condo",
  "propertyTypeDesc": "",
  "sqFtPerUnit": 900,
  "state": "OH",
  "unitCount": 220,
  "yearBuilt": 1970,
  "zip": "44107",
  "id": 0
}
*/

//	@Operation(summary = "Add a new Homeowner Association (HOA)", description = "Returns a single hoa", tags = { "Homeowner Association (HOA)" })
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	public @ResponseBody Hoa addNewHoa ( 
//			@RequestBody Hoa myHoa) { 
//		return hoaRepository.save(myHoa);
//		//return "Saved";
//	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Hoa> getAllUsers() {
		// This returns a JSON or XML with the users
		return hoaRepository.findAll();
	}
	
	 // Single item 
	  @GetMapping("/{id}")
	  Hoa one(@PathVariable Long id) {
	    return hoaRepository.findById(id)
	      .orElseThrow(() -> new HoaUserNotFoundException(id));
	  }
	  
	  @Operation(summary = "Updates (or Creates) a  Homeowner Association (HOA)", description = "If the hoaId is found, it updates an existing hoa. \n"
	  		+ "If the hoaId is not found, it creates a new HOA and returns the generated ID in the response. Returns a single hoa", tags = { "Homeowner Association (HOA)" })
	  @PutMapping("/update/{id}")
	  Hoa updateHoa(@RequestBody Hoa newHoa, @PathVariable Long id) {

	    return hoaRepository.findById(id)
	      .map(hoa -> {
	        //hoa.setName(newHoa.getName());
	        //hoa.setEmail(newHoa.getEmail());
	        return hoaRepository.save(newHoa);
	      })
	      .orElseGet(() -> {
	    	  newHoa.setId(id);
	        return hoaRepository.save(newHoa); //hoaRepository.save(newHoa);
	      });
	  }

	  @DeleteMapping("/delete/{id}")
	  void deleteHoaUser(@PathVariable Long id) {
		  hoaRepository.deleteById(id);
	  }
	  
	 

}