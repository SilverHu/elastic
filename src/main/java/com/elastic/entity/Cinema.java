package com.elastic.entity;

import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

/**
 * 影院类型
 * 
 * @author chuanyinhu
 *
 */
@Document(indexName = "ciname", type = "ciname")
public class Cinema {

	@Id
	@Field(type = FieldType.Long)
	private Long cinemaId; // 影院id
	@Field(type = FieldType.String)
	private String cinemaName; // 影院名称
	@Field(type = FieldType.String)
	private String address; // 影院地址
	@GeoPointField
	private GeoPoint point; // 影院坐标

	/**
	 * 影院id
	 * 
	 * @return
	 */
	public Long getCinemaId() {
		return cinemaId;
	}

	/**
	 * 影院id
	 * 
	 * @param cinemaId
	 */
	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}

	/**
	 * 影院名称
	 * 
	 * @return
	 */
	public String getCinemaName() {
		return cinemaName;
	}

	/**
	 * 影院名称
	 * 
	 * @param cinemaName
	 */
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	/**
	 * 影院地址
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 影院地址
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 影院坐标
	 * 
	 * @return
	 */
	public GeoPoint getPoint() {
		return point;
	}

	/**
	 * 影院坐标
	 * 
	 * @param point
	 */
	public void setPoint(GeoPoint point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "cinemaId = " + this.cinemaId + "\t cinemaName = " + this.cinemaName + this.cinemaId + "\t address = "
				+ this.address + this.cinemaId + "\t point[lon,lat] = [" + this.point.getLon() + ","
				+ this.point.getLat() + "]";
	}
}
