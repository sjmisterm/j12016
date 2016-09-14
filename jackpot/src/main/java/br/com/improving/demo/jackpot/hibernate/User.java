package br.com.improving.demo.jackpot.hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class User implements Serializable {
	@Id
	private Integer id;
	
	@ManyToOne
	@ForeignKey(name = "company_fk")
	@JoinColumn(name = "company_id")
	private Company company;
}

