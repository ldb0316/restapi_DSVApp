package com.bbzz.datastandardsvalid.home.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="db_class")
public class DbClassEntity {


	/** class_name */
	@Column(length=255)
	private String className; 
	

	/** class_type */
	@Column(length=6)
	private String classType; 
	

	/** collation */
	@Column(length=32)
	private String collation; 
	

	/** comment */
	@Column(length=2048)
	private String comment; 
	

	/** is_reuse_oid_class */
	@Column(length=3)
	private String isReuseOidClass; 
	

	/** is_system_class */
	@Column(length=3)
	private String isSystemClass; 
	

	/** owner_name */
	@Column(length=255)
	private String ownerName; 
	

	/** partitioned */
	@Column(length=3)
	private String partitioned; 
	

	/** tde_algorithm */
	@Column(length=32)
	private String tdeAlgorithm; 
	
}