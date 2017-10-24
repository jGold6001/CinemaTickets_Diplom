package org.itstep.dao.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HALLS")
public class Hall implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private int id;
	
	@Column(name="NAME", length=60, nullable = false)
	private String name;
	
	@Column(name="CINEMA_ID", length=6, nullable = false)
	private long cinema;

	public Hall() {
		// TODO Auto-generated constructor stub
	}
	
	public Hall(String name, int cinema) {
		this.name = name;
		this.cinema = cinema;
	}
}
