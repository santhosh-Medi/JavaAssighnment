package com.Spring.SampleAssignmentproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Spring.SampleAssignmentproject.model.Etityclass;
import com.Spring.SampleAssignmentproject.repository.Repository;
@Service
public class Employeeserviceclass implements serverclass{
@Autowired
private Repository resp;
	@Override
	public Integer saveEmployee(@RequestBody Etityclass employee) {
		System.out.println("pritnt   "+employee);
		// TODO Auto-generated method stub
		 return resp.save(employee).sno;
	}
	@Override
	public List<Etityclass> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Etityclass>)resp.findAll();
	}
	@Override
	public Etityclass getEmployeeById(Integer sno) {
		// TODO Auto-generated method stub
		return resp.findById(sno).get();
	}
	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		resp.deleteById(id);
		
	}

}
