/**
 * 
 */
package com.mastercard.roadconnectivity.model;

/**
 * @author Govardhan Mudduluru
 *
 */
public class OriginDestinationMapperDto {
	

	/**
	 * 
	 */
	public OriginDestinationMapperDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	private Long id;

	private Long originId;
	
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
		result = prime * result + ((destinationId == null) ? 0 : destinationId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((originId == null) ? 0 : originId.hashCode());
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
		OriginDestinationMapperDto other = (OriginDestinationMapperDto) obj;
		if (destinationId == null) {
			if (other.destinationId != null)
				return false;
		} else if (!destinationId.equals(other.destinationId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (originId == null) {
			if (other.originId != null)
				return false;
		} else if (!originId.equals(other.originId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OriginDestinationMapperDto [id=" + id + ", originId=" + originId + ", destinationId=" + destinationId
				+ "]";
	}
	
	
	
	
	

}
