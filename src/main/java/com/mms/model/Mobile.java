package com.mms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Check;
import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "mobile")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mobile {
	@Id
	private Long ime;
	
	@Column
	@NotNull
	private String model;
	
	@Column
	@NotNull
	private String maker;
	
	@Column
	private String color;
	
	@Column
	@Range(max=150000)
	private Double price;
	
	@Column
	private Integer processor;
	
	@Column
	private Integer camera;
	

}
