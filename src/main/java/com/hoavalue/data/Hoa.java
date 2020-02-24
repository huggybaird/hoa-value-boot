package com.hoavalue.data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hoa_details database table.
 * 
 */
@Entity
@Table(name="hoa_details")
@NamedQuery(name="HoaDetail.findAll", query="SELECT h FROM Hoa h")
public class Hoa implements Serializable {
	private static final long serialVersionUID = 1L;

	// org.hibernate.tool.schema.spi.SchemaManagementException: Schema-validation: missing column [hoa_id] in table [hoa_details]
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hoaId")
	private long hoaId;

	private int userId;
	
	private String address1;

	private String address2;

	private String city;

	@Column(name="floorCount")
	private int floorCount;

	@Column(name="hoaWebsiteUrl")
	private String hoaWebsiteUrl;

	private String name;

	@Column(name="propertyType")
	private String propertyType;

	@Column(name="propertyTypeDesc")
	private String propertyTypeDesc;

	@Column(name="sqFtPerUnit")
	private double sqFtPerUnit;

	private String state;

	@Column(name="unitCount")
	private int unitCount;

	@Column(name="yearBuilt")
	private int yearBuilt;

	private String zip;

	public Hoa() {
	}

	public long getId() {
		return this.hoaId;
	}

	public void setId(long id) {
		this.hoaId = id;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}
	
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFloorCount() {
		return this.floorCount;
	}

	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}

	public String getHoaWebsiteUrl() {
		return this.hoaWebsiteUrl;
	}

	public void setHoaWebsiteUrl(String hoaWebsiteUrl) {
		this.hoaWebsiteUrl = hoaWebsiteUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyTypeDesc() {
		return this.propertyTypeDesc;
	}

	public void setPropertyTypeDesc(String propertyTypeDesc) {
		this.propertyTypeDesc = propertyTypeDesc;
	}

	public double getSqFtPerUnit() {
		return this.sqFtPerUnit;
	}

	public void setSqFtPerUnit(double sqFtPerUnit) {
		this.sqFtPerUnit = sqFtPerUnit;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getUnitCount() {
		return this.unitCount;
	}

	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
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