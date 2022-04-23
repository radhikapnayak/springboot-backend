package com.springboot.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private String Salary;
    
    @Column(name = "designation")
    private String designation;

    public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSalary() {
		return Salary;
	}
	
	public String getdesignation() {
		return designation;
	}
	
	
	 public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }


	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setSalary(String Salary) {
	        this.Salary = Salary;
	    }

	    public void setdesignation(String designation) {
	        this.designation = designation;
	    }
	    
	    @Override
	    public String toString() {
	    	return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary + ", designation=" + designation + '}';
	    }
}
