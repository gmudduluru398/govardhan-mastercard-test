/**
 * 
 */
package com.mastercard.roadconnectivity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Govardhan Mudduluru
 *
 */

@Entity
public class OriginDestinationMapper {

	
	/**
	 * 
	 */
	public OriginDestinationMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Long originId;
	
	@Column(nullable = false)
	private Long destinationId;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the originId
	 */
	public Long getOriginId() {
		return originId;
	}

	/**
	 * @param originId the originId to set
	 */
	public void setOriginId(Long originId) {
		this.originId = originId;
	}

	/**
	 * @return the destinationId
	 */
	public Long getDestinationId() {
		return destinationId;
	}

	/**
	 * @param destinationId the destinationId to set
	 */
	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (destinationId ^ (destinationId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (originId ^ (originId >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OriginDestinationMapper other = (OriginDestinationMapper) obj;
		if (destinationId != other.destinationId)
			return false;
		if (id != other.id)
			return false;
		if (originId != other.originId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OriginDestinationMapper [id=" + id + ", originId=" + originId + ", destinationId=" + destinationId
				+ "]";
	}
	
	
	
	

}
