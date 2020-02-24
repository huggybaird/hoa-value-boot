package com.hoavalue.data;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 


/**
 * The persistent class for the hoa_property_redfin database table.
 * 
 */
@Entity
//@EnableAutoConfiguration
@Table(name="hoa_property_redfin")
@JsonPropertyOrder({ "saleType", "recentSaleDate", "propertyType", "address1", "city", "state", "zip", "listedForSalePrice", "beds", "baths", "location", "sqFt", "lotSizeSqFt", "yearBuilt", "listedDaysOnMarket", "dollarsPerSqFt", "hoaFeeMonth", "listedForSaleStatus", "nextOpenHouseStartDate", "nextOpenHouseEndTime", "redfinUrl", "listedForSaleSource", "listedMLSNumber", "favorite", "interested", "latitude", "longitude" })
//@NamedQuery(name="HoaPropertyRedfin.findAll", query="SELECT h FROM HoaPropertyRedfin h")
public class PropertyRedfin { //implements Serializable {
	//private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="property_key")
	//@GeneratedValue(strategy=GenerationType.AUTO) //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long propertyKey;

	//@Lob
	private String address1;

	private double baths;

	private int beds;

	//@Lob
	private String city;

	private double dollarsPerSqFt;

	//@Lob
	private String favorite;

	private double hoaFeeMonth;

	//@Lob
	private String interested;

	private double latitude;

	private int listedDaysOnMarket;

	private int listedForSalePrice;

	//@Lob
	private String listedForSaleSource;

	//@Lob
	private String listedForSaleStatus;

	//@Lob
	private String listedMLSNumber;

	//@Lob
	private String location;

	private double longitude;

	//@Lob
	private String lotSizeSqFt;

	//@Lob
	private String nextOpenHouseEndTime;

	//@Lob
	private String nextOpenHouseStartDate;

	//@Lob
	private String propertyType;

	//@Lob
	private String recentSaleDate;

	//@Lob
	private String redfinUrl;

	//@Lob
	private String saleType;

	private int sqFt;

	//@Lob
	private String state;

	private int yearBuilt;

	//@Lob
	private String zip;

	public PropertyRedfin() {
	}

	public long getPropertyKey() {
		return this.propertyKey;
	}

	public void setPropertyKey(long propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public double getBaths() {
		return this.baths;
	}

	public void setBaths(double baths) {
		this.baths = baths;
	}

	public int getBeds() {
		return this.beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getDollarsPerSqFt() {
		return this.dollarsPerSqFt;
	}

	public void setDollarsPerSqFt(double dollarsPerSqFt) {
		this.dollarsPerSqFt = dollarsPerSqFt;
	}

	public String getFavorite() {
		return this.favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public double getHoaFeeMonth() {
		return this.hoaFeeMonth;
	}

	public void setHoaFeeMonth(double hoaFeeMonth) {
		this.hoaFeeMonth = hoaFeeMonth;
	}

	public String getInterested() {
		return this.interested;
	}

	public void setInterested(String interested) {
		this.interested = interested;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public int getListedDaysOnMarket() {
		return this.listedDaysOnMarket;
	}

	public void setListedDaysOnMarket(int listedDaysOnMarket) {
		this.listedDaysOnMarket = listedDaysOnMarket;
	}

	public int getListedForSalePrice() {
		return this.listedForSalePrice;
	}

	public void setListedForSalePrice(int listedForSalePrice) {
		this.listedForSalePrice = listedForSalePrice;
	}

	public String getListedForSaleSource() {
		return this.listedForSaleSource;
	}

	public void setListedForSaleSource(String listedForSaleSource) {
		this.listedForSaleSource = listedForSaleSource;
	}

	public String getListedForSaleStatus() {
		return this.listedForSaleStatus;
	}

	public void setListedForSaleStatus(String listedForSaleStatus) {
		this.listedForSaleStatus = listedForSaleStatus;
	}

	public String getListedMLSNumber() {
		return this.listedMLSNumber;
	}

	public void setListedMLSNumber(String listedMLSNumber) {
		this.listedMLSNumber = listedMLSNumber;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getLotSizeSqFt() {
		return this.lotSizeSqFt;
	}

	public void setLotSizeSqFt(String lotSizeSqFt) {
		this.lotSizeSqFt = lotSizeSqFt;
	}

	public String getNextOpenHouseEndTime() {
		return this.nextOpenHouseEndTime;
	}

	public void setNextOpenHouseEndTime(String nextOpenHouseEndTime) {
		this.nextOpenHouseEndTime = nextOpenHouseEndTime;
	}

	public String getNextOpenHouseStartDate() {
		return this.nextOpenHouseStartDate;
	}

	public void setNextOpenHouseStartDate(String nextOpenHouseStartDate) {
		this.nextOpenHouseStartDate = nextOpenHouseStartDate;
	}

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRecentSaleDate() {
		return this.recentSaleDate;
	}

	public void setRecentSaleDate(String recentSaleDate) {
		this.recentSaleDate = recentSaleDate;
	}

	public String getRedfinUrl() {
		return this.redfinUrl;
	}

	public void setRedfinUrl(String redfinUrl) {
		this.redfinUrl = redfinUrl;
	}

	public String getSaleType() {
		return this.saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public int getSqFt() {
		return this.sqFt;
	}

	public void setSqFt(int sqFt) {
		this.sqFt = sqFt;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getYearBuilt() {
		return this.yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}