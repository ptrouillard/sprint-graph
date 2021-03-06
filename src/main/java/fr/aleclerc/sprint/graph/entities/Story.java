package fr.aleclerc.sprint.graph.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import fr.aleclerc.sprint.graph.config.InstantDeserializer;
import fr.aleclerc.sprint.graph.config.InstantSerializer;


@Entity
public class Story {
	@Id 
	private String id;
	@Column
	private Float complexity;
	@Column
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant addDate;
	@Column
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant closeDate;
	
	public Story(){

	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getComplexity() {
		return complexity;
	}
	public void setComplexity(Float complexity) {
		this.complexity = complexity;
	}
	public Instant getAddDate() {
		return addDate;
	}
	public void setAddDate(Instant addDate) {
		this.addDate = addDate;
	}
	public Instant getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Instant closeDate) {
		this.closeDate = closeDate;
	}
	@Override
	public String toString() {
		return "Story [id=" + id + ", complexity=" + complexity + ", addDate=" + addDate + ", closeDate=" + closeDate
				+ "]";
	}

	
}
