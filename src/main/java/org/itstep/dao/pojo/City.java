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
@Table(name = "CITIES")
public class City implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private long id;
	
	@Column(name="NAME", length=60, nullable = false)
	private String name;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(String name) {
		this.name = name;
	}
}
