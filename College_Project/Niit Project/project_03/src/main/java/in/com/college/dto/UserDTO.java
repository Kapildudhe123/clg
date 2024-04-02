package in.com.college.dto;


import java.sql.Timestamp;
import java.util.Date;
/**
 * 
 * user JavaDto encapsulates user attributes
 * 
 * 
 * @author Kapil Dudhe
 *
 */

public class UserDTO extends BaseDTO {
	 
	/*
	 * public static final String ACTIVE = "Active"; public static final String
	 * INACTIVE = "Inactive";
	 */
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String confirmPassword;
	private Date dob;
	private String mobileNo;
	/* private int unSuccessfullLogin; */
	private String gender;
	private long roleId;

	/*
	 * private Timestamp lastLogin; private String registeredIP; private String
	 * loginIP;
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/*
	 * public int getUnSuccessfullLogin() { return unSuccessfullLogin; }
	 * 
	 * public void setUnSuccessfullLogin(int unSuccessfullLogin) {
	 * this.unSuccessfullLogin = unSuccessfullLogin; }
	 */

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	
	



	public String getKey() {

		return id + "";
	}

	public String getValue() {

		return firstName + "" + lastName;
	}

}
