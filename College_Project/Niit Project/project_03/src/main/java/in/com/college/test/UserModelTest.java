package in.com.college.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.com.college.dto.UserDTO;
import in.com.college.exception.ApplicationException;
import in.com.college.model.UserModelHibImp;


public class UserModelTest {
	public static UserModelHibImp model = new UserModelHibImp();
	// public static UserModelInt model = new UserModelJDBCImpl();

	public static void main(String[] args) throws Exception {
		addTest();
		// updateTest();
		// deleteTest();
		// findByPKTest();
		// findByLoginTest();
		// listTest();
		// searchTest();
	}

	/*
	 * private static void findByLoginTest() throws ApplicationException {
	 * 
	 * UserDTO dto = model.findByLogin("Mayankshi@gmail.com");
	 * System.out.println(dto.getId() + "\t" + dto.getFirstName() + "\t" +
	 * dto.getLastName() + "\t" + dto.getLogin() + "\t" + dto.getPassword() + "\t" +
	 * dto.getDob() + "\t" + dto.getMobileNo() + "\t" + dto.getRoleId() + "\t" +
	 * dto.getUnSuccessfullLogin() + "\t" + dto.getGender() + "\t");
	
	} */

	public static void searchTest() throws ApplicationException {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		dto.setId(2L);
		// dto.setFirstName("Mayankshi");
		// dto.setLastName("agrawal");
		// dto.setLogin("login");
		// dto.setPassword("123");
		// dto.setMobileNO("989");
		// dto.setRoleId(1);
		// dto.setUnSuccessfullLogin(1);

		// dto.setGender("male");

		ArrayList<UserDTO> a = (ArrayList<UserDTO>) model.search(dto, 0, 0);

		for (UserDTO udto1 : a) {
			System.out.println(udto1.getId() + "\t" + udto1.getFirstName() + "\t" + udto1.getLastName() + "\t"
					+ udto1.getLogin() + "\t" + udto1.getPassword() + "\t" + udto1.getDob() + "\t" + udto1.getMobileNo()
					+ "\t" + udto1.getRoleId());
		}
	}

	public static void listTest() throws ApplicationException {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		List list = new ArrayList();
		list = model.list(1, 10);
		if (list.size() < 0) {
			System.out.println("list fail");
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			dto = (UserDTO) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getRoleId());


			System.out.println(dto.getGender());
			
			System.out.println(dto.getMobileNo());
			/*
			 * System.out.println(dto.getCreatedBy());
			 * System.out.println(dto.getModifiedBy());
			 * System.out.println(dto.getCreatedDatetime());
			 * System.out.println(dto.getModifiedDatetime());
			 */
		}
	}

	/*
	 * public static void findByPKTest() throws ApplicationException { // TODO
	 * Auto-generated method stub UserDTO dto = model.findByPK(3L);
	 * System.out.println(dto.getId() + "\t" + dto.getFirstName() + "\t" +
	 * dto.getLastName() + "\t" + dto.getLogin() + "\t" + dto.getPassword() + "\t" +
	 * dto.getDob() + "\t" + dto.getMobileNo() + "\t" + dto.getRoleId() + "\t" +
	 * dto.getUnSuccessfullLogin() + "\t" + dto.getGender() + "\t" +
	 * dto.getLastLogin() + "\t" + "\t" + dto.getLastLogin() + "\t" +
	 * dto.getRegisteredIP()); }
	 */

	public static void addTest() throws Exception {
		// TODO Auto-generated method stub
		// System.out.println("heellloooooo");
		UserDTO dto = new UserDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		dto.setFirstName("Sourabh");
		dto.setLastName("Rajput");
		dto.setDob(sdf.parse("20-04-1999"));
		dto.setConfirmPassword("Sourabh@1234");
		dto.setPassword("Sourabh@1234");
		dto.setLogin("rajputsourabh737@gmail.com");
		dto.setGender("male");
	

		System.out.println("add");
		long pk = model.add(dto);
		System.out.println(pk + "data successfully insert");
	}

	public static void deleteTest() throws ApplicationException {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		dto.setId(1L);
		model.delete(dto);
		System.out.println("delete data successfully");
	}

	public static void updateTest() throws Exception {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		dto.setId(1L);
		dto.setFirstName("Mayank");

		dto.setLastName("agrawalll");
		dto.setDob(sdf.parse("31-12-1995"));
		dto.setConfirmPassword("1234");
		dto.setPassword("1234");
		dto.setLogin("Mayank@gmail.com");
		dto.setGender("males");
	
		/*
		 * dto.setCreatedBy("admins"); dto.setModifiedBy("admins");
		 */
		dto.setRoleId(1);
		dto.setMobileNo("9406653787");
		
	
		model.update(dto);
		System.out.println("data update successfully");
	}

}
