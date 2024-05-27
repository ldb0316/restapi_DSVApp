package com.bbzz.datastandardsvalid.home.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DbClassDTO {


	/** class_name */
	private String className; 
	

	/** class_type */
	private String classType; 
	

	/** collation */
	private String collation; 
	

	/** comment */
	private String comment; 
	

	/** is_reuse_oid_class */
	private String isReuseOidClass; 
	

	/** is_system_class */
	private String isSystemClass; 
	

	/** owner_name */
	private String ownerName; 
	

	/** partitioned */
	private String partitioned; 
	

	/** tde_algorithm */
	private String tdeAlgorithm; 
	
}