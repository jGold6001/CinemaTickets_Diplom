package org.itstep.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLACES")
public class Place implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NUMBER", unique= true, length=4, nullable = false)
	private int number;
	
	@Column(name = "ROW", unique= true, length=4, nullable = false)
	private int row;
	
	@Column(name="PRICE", columnDefinition = "decimal")
	private BigDecimal price;
	
	@Column(name="TYPE", length=10)
	private String type;
	
	@Column(name="HALL_ID", length=6, nullable = false)
	private int hall;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}

	public Place(int number, int row, BigDecimal price, String type, int hall) {
		this.number = number;
		this.row = row;
		this.price = price;
		this.type = type;
		this.hall = hall;
	}
}
