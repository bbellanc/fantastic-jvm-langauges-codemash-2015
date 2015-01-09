package com.manifest.hibernatelab;

import com.manifest.hibernatelab.dao.EmployerDao;
import com.manifest.hibernatelab.model.Employer;

public class HibernateExample {

	private EmployerDao employerDao;

	public void setEmployerDao(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	public void addEmployers() {
		Employer employer1 = new Employer();
		employer1.setName("Bob Jones");
		employer1.setTitle("middle manager");
		employerDao.save(employer1);
	}

	public void addEmployees() {
		// TODO Auto-generated method stub
		
	}


	public void moveEmployeesToNewDepartment() {
		// TODO Auto-generated method stub
		
	}

}
