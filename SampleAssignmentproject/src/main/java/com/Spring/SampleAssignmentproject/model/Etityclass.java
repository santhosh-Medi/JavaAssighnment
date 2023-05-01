package com.Spring.SampleAssignmentproject.model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Etityclass {
//	Date date=new Date();
//			date.setHours(date.getHours() + 5);
//	        date.setMinutes(date.getMinutes() + 30);
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer sno;
	public Integer Salary;
	public String Name;
	public String Email;
	public Date CreatedDatetime=new Date();
	public Date UpdatedDatetime; 
}
