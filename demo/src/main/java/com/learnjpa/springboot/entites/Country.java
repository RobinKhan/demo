package com.learnjpa.springboot.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country")
public class Country {

	
	  	@Id
	    @Column(name ="country_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name ="country_name")
	    private String countryName;
	    
	    @JsonIgnore
	    @OneToMany
	    @JoinColumn(name="country_id")
	    private Set<City> city;
	    

		public Country() {
			super();
		}

		public Country(int id, String countryName) {
			super();
			this.id = id;
			this.countryName = countryName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public Set<City> getCity() {
			return city;
		}

		public void setCity(Set<City> city) {
			this.city = city;
		}
	    
	    

}
