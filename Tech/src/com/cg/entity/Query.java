package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")
public class Query {
	@Id
	@Column(name = "query_id")
	@NotNull(message = "enter query Id")
	private int query_id;
	
	@Column(name = "technology")
	@NotEmpty(message = "Enter Technology")
	private String technology;
	
	@Column(name = "query_raised_by")
	@NotEmpty(message = "Enter Question raised by")
	private String query_raised_by;
	
	@Column(name = "query")
	@NotEmpty(message = "Enter Question")
	private String query;

	@Column(name = "solutions")
	private String solutions;

	@Column(name = "solution_given_by")
	private String solution_given_by;

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQuery_raised_by() {
		return query_raised_by;
	}

	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolution_given_by() {
		return solution_given_by;
	}

	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}

	@Override
	public String toString() {
		return "Queryy [query_id=" + query_id + ", technology=" + technology
				+ ", query_raised_by=" + query_raised_by + ", query=" + query
				+ ", solutions=" + solutions + ", solution_given_by="
				+ solution_given_by + "]";
	}

	public Query(int query_id, String technology, String query_raised_by,
			String query, String solutions, String solution_given_by) {
		super();
		this.query_id = query_id;
		this.technology = technology;
		this.query_raised_by = query_raised_by;
		this.query = query;
		this.solutions = solutions;
		this.solution_given_by = solution_given_by;
	}

	public Query() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
