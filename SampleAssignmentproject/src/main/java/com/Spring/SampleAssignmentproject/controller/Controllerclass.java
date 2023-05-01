package com.Spring.SampleAssignmentproject.controller;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Spring.SampleAssignmentproject.serverclass;
import com.Spring.SampleAssignmentproject.model.Etityclass;

import jakarta.validation.Valid;

@RestController
public class Controllerclass {
	@Autowired
	private serverclass service;
	@PostMapping("/saveEmployee")
public ResponseEntity<String> saveEmployee(@Valid @RequestBody Etityclass employee){
	
	 Integer id=service.saveEmployee(employee);
	return new ResponseEntity<String>("Employee Saved  "+id,HttpStatus.OK);
}
@GetMapping("/getEmployee")
public ResponseEntity<List<Etityclass>> getAllEmployees(){
	List<Etityclass> List=service.getAllEmployees();

			return new ResponseEntity<List<Etityclass>>(List,HttpStatus.OK);
}

@GetMapping("/getEmployeeById/{id}")
public ResponseEntity<Etityclass> getEmployeeById(@PathVariable("id")Integer id){
	Etityclass emp=service.getEmployeeById(id);
	return new ResponseEntity<Etityclass>(emp,HttpStatus.OK);
}

@PutMapping("/updateemployee/{id}")
public ResponseEntity<String> updateEmployee(@PathVariable("id") Integer id, @RequestBody Etityclass employee){
   Etityclass empdb=service.getEmployeeById(id);
   Date date=new Date();
  if(employee.Name!=null) {empdb.Name=(employee.Name);}
  if(employee.Email!=null) {empdb.Email=(employee.Email);}
  if(employee.Salary!=null) {empdb.Salary=(employee.Salary);}
   empdb.UpdatedDatetime=date;
  service.saveEmployee(empdb);
		
return new ResponseEntity<String>(employee.Name+" Employee Updated", HttpStatus.OK);
}
	@DeleteMapping("/DeleteEmployee/{id}")
public ResponseEntity<String> deleteEmployee(@PathVariable("id")Integer id){
service.deleteEmployee(id);
return new ResponseEntity<String>("Student deleted", HttpStatus.OK);
	}
	
}
