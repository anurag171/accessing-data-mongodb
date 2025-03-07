package com.anurag.spring.mongodb.staging;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@TypeAlias(value = "THStaging_")
@Document(collection = "thstagingdata")
@CompoundIndex(def = "{'country': 1, 'date': 1}")
public class THStagingData extends CountryStagingData {
	
	/*
	 * private String country;
	 * 
	 * public String getCountry() { return country; }
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 */
}
