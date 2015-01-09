package com.manifest.hibernatelab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="employee")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name="id", nullable=false)
	private int id;
	
	@Column(name="full_name", nullable=false)
	private String name;
    
    @Column(name="job", nullable=false)
    private String title;
	
	public int getId() {
		return id;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
