package com.example.kodlama.io.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cover_letter")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name="candidates_id")
	@JsonIgnore
    private Candidates candidates;
	
	
	public CoverLetter(String content,int candidatesId) {
		super();
		this.content=content;
		this.candidates.setId(candidatesId);
	}
	
	
	
}
