package org.itstep.dao.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

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
@Table(name = "SEANCES")
public class Seance implements Serializable {

	private static final long serialVersionUID = 7569496672176968780L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private long id;
	
	@Column(name = "DATE", nullable = false)
	private Date date;
	
	@Column(name = "START_TIME", nullable = false)
	private Time startTime;
	
	@Column(name = "TIPE_D", length=4)
	private String tipeD;
	
	@Column(name = "HALL_ID", length=10, nullable = false)
	private int hall;
	
	@Column(name = "MOVIE_ID", length=10, nullable = false)
	private long movie;
	
	public Seance() {
		// TODO Auto-generated constructor stub
	}

	public Seance(Date date, Time startTime, String tipeD, int hall, long movie) {
		this.date = date;
		this.startTime = startTime;
		this.tipeD = tipeD;
		this.hall = hall;
		this.movie = movie;
	}
	
	
}
