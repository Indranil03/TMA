package com.tma.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mother")
public class Mother implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="mother_id")
	private Integer motherId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="locality_lat")
	private BigDecimal latitude;
	
	@Column(name="locality_long")
	private BigDecimal longitude;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="alternate_mobile")
	private String alternate_mobile;
	
	@Column(name="ratings")
	private BigDecimal ratings;
	
	@Column(name="datecreated")
	private Date dateCreated;
	
	@Column(name="dateupdated")
	private Date dateUpdated;
	
	public Mother() {
		
	}

	public Integer getMotherId() {
		return motherId;
	}

	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternate_mobile() {
		return alternate_mobile;
	}

	public void setAlternate_mobile(String alternate_mobile) {
		this.alternate_mobile = alternate_mobile;
	}

	public BigDecimal getRatings() {
		return ratings;
	}

	public void setRatings(BigDecimal ratings) {
		this.ratings = ratings;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	
	
}
