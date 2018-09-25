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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "mother_menu")
public class MotherMenu implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer menuId;
	
	@Transient
	private Integer motherId;
	
	@ManyToOne
    @JoinColumn(name = "mother_id")
	private Mother mother;
	
	@Column(name="datecreated")
	private Date dateCreated;
	
	@Column(name="dateupdated")
	private Date dateUpdated;
	
	@Column(name="menu_item")
	private String menuItem;
	
	@Column(name="menu_item_description")
	private String menuItemDescription;
	
	@Column(name="price")
	private String price;
	
	@Column(name="sufficient_for")
	private String sufficientFor;
	
	@Column(name="status")
	private String status;
	
	@Column(name="no_of_orders_received")
	private String noOfOrdersReceived;
	
	@Column(name="locality_lat")
	private BigDecimal latitude;
	
	@Column(name="locality_long")
	private BigDecimal longitude;
	
	@Column(name="no_of_likes")
	private Integer noOfLikes;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="image_1")
	private String image1;
	
	@Column(name="image_2")
	private String image2;
	
	@Column(name="image_3")
	private String image3;
	
	public MotherMenu() {
		
	}

	public Integer getMenu_Id() {
		return menuId;
	}

	public void setMenu_Id(Integer menu_Id) {
		this.menuId = menu_Id;
	}

	public Integer getMotherid_ref() {
		return motherId;
	}

	public void setMotherid_ref(Integer motherid_ref) {
		this.motherId = motherid_ref;
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

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getMenuItemDescription() {
		return menuItemDescription;
	}

	public void setMenuItemDescription(String menuItemDescription) {
		this.menuItemDescription = menuItemDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSufficientFor() {
		return sufficientFor;
	}

	public void setSufficientFor(String sufficientFor) {
		this.sufficientFor = sufficientFor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNoOfOrdersReceived() {
		return noOfOrdersReceived;
	}

	public void setNoOfOrdersReceived(String noOfOrdersReceived) {
		this.noOfOrdersReceived = noOfOrdersReceived;
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

	public Integer getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(Integer noOfLikes) {
		this.noOfLikes = noOfLikes;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}
	
}
