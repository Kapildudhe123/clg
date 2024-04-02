package in.com.college.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Parent class of all Dto in application. It contains generic attributes.
 * 
 * @author Kapil Dudhe
 *
 */

public abstract class BaseDTO implements Serializable, Comparable<BaseDTO>, DropdownList {
 
	 
	private static final long serialVersionUID = 1L;

	protected Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public int compareTo(BaseDTO next) {
		return getValue().compareTo(next.getValue());
	}
}
