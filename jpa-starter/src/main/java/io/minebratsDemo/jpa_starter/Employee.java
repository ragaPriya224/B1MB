package io.minebratsDemo.jpa_starter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DATA_MB")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	
	
	@Column(name = "emp_name")
	private String name;

	private Integer age;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Column(unique = true, length =  12, updatable = false)
	private String ssn; //unique values only. 

	@Enumerated(EnumType.STRING)
	private EmployeeType type;

	@Transient
	private String xyz;

	public String getXyz() {
		return xyz;
	}
	public void setXyz(String xyz) {
		this.xyz = xyz;
	}
	public EmployeeType getType() {
		return type;
	}
	public void setType(EmployeeType type) {
		this.type = type;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
