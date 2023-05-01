package com.Spring.SampleAssignmentproject;

import java.util.List;

import com.Spring.SampleAssignmentproject.model.Etityclass;

public interface serverclass {
	public Integer saveEmployee(Etityclass employee);

	public List<Etityclass> getAllEmployees();
	public Etityclass getEmployeeById(Integer sno);
	public void deleteEmployee(Integer sno);
}
