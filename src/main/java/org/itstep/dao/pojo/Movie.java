package org.itstep.dao.pojo;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "MOVIES")
public class Movie implements Serializable {

	private static final long serialVersionUID = 8734580570097125532L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private long id;
	
	@Column(name="NAME", length=60, nullable = false)
	private String name;
	
	@Column(name= "GENRE", length=90)
	private String genre;
	
	@Column(name="DESCRIPTION", columnDefinition = "TEXT", length=512)
	private String description;
	
	@Column(name="YEAR_ISSUE", length = 5)
	private int yearIssue;
	
	@Column(name="DURATION", length = 4)
	private int duration;
	
	@Column(name="AGE_CATEGORY", length = 4)
	private String ageCategory;
	
	@Column(name="COUNTRY", length = 50)
	private String country;
	
	@Column(name="DIRECTOR", length = 50)
	private String director;
	
	@Column(name="ACTORS", length = 128)
	private String actors;
	
	@Column(name="TRAILER_URL", length = 128)
	private String trailerUrl;
	
	@Column(name = "RANK_SALES")
	private int rankSales;
	
	@Column(name = "DATE_ISSUE")
	private Date dateIssue;
	
	@Column(name = "DATE_FINISH")
	private Date dateFinish;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String genre, String description, int yearIssue, int duration, String ageCategory,
			String country, String director, String actors, String trailerUrl, Date dateIssue, Date dateFinish, int rankSales) {
		this.name = name;
		this.genre = genre;
		this.description = description;
		this.yearIssue = yearIssue;
		this.duration = duration;
		this.ageCategory = ageCategory;
		this.country = country;
		this.director = director;
		this.actors = actors;
		this.trailerUrl = trailerUrl;
		this.dateIssue = dateIssue;
		this.dateFinish = dateFinish;
		this.rankSales = rankSales;
	}
}
