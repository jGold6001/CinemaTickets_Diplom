package org.itstep.dao.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "CINEMA_ID")
	private Cinema cinema;
	
	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	private Movie movie;
	
	public Seance() {
		// TODO Auto-generated constructor stub
	}

	public Seance(Date date, Time startTime, String tipeD) {
		this.date = date;
		this.startTime = startTime;
		this.tipeD = tipeD;
	}
	
	
}
