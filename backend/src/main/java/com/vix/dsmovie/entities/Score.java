package com.vix.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score
{
	// ATRIBUTOS
	
	private Double value;
	
	// ASSOCIAÇÕES
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	// CONSTRUTORES
	
	public Score() {}
	
	// MÉTODO PARA ASSOCIAR UM FILME COM UM SCORE
	
	public void setMovie(Movie movie)
	{
		id.setMovie(movie);
	}
	
	// MÉTODO PARA ASSOCIAR UM USUÁRIO COM UM SCORE
	
	public void setUser(User user)
	{
		id.setUser(user);
	}
	
	// GETTERS E SETTERS

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}
	
	
}
