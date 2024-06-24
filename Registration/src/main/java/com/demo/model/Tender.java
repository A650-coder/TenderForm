package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tender")
public class Tender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30)
	private String type;
	@Column(length = 30)

	private String fullName;
	@Column(length = 30)

	private String address;
	@Column(length = 30)

	private String city;
	@Column(length = 30)

	private String district;

	@Column(length = 30)
	private String state;
	@Column(length = 30)

	private String pincode;

	@Column(length = 30)
	private String mobileNumber;

	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private boolean licenseNumber;
	@Column(length = 30)
	private boolean gstNumber;

	@Column(length = 30)
	private String goodsType;

	@Column(length = 30)
	private int goodsDemand;

	@Column(length = 30)
	private double saleRatePerQuantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(boolean licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public boolean isGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(boolean gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public int getGoodsDemand() {
		return goodsDemand;
	}

	public void setGoodsDemand(int goodsDemand) {
		this.goodsDemand = goodsDemand;
	}

	public double getSaleRatePerQuantity() {
		return saleRatePerQuantity;
	}

	public void setSaleRatePerQuantity(double saleRatePerQuantity) {
		this.saleRatePerQuantity = saleRatePerQuantity;
	}

	@Override
	public String toString() {
		return "Tender [id=" + id + ", type=" + type + ", fullName=" + fullName + ", address=" + address + ", city="
				+ city + ", district=" + district + ", state=" + state + ", pincode=" + pincode + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", licenseNumber=" + licenseNumber + ", gstNumber=" + gstNumber
				+ ", goodsType=" + goodsType + ", goodsDemand=" + goodsDemand + ", saleRatePerQuantity="
				+ saleRatePerQuantity + "]";
	}
	
	

}
