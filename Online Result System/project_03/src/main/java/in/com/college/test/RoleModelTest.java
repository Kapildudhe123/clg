package in.com.college.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.management.relation.Role;
import javax.swing.event.RowSorterListener;

import in.com.college.dto.RoleDTO;
import in.com.college.exception.ApplicationException;
import in.com.college.exception.DuplicateRecordException;
import in.com.college.model.RoleModelHibImp;


public abstract class RoleModelTest {
public static RoleModelHibImp model=new RoleModelHibImp();
//public static RoleModelInt model=new RoleModelJDBCImpl;
public static void main(String[] args) throws Exception {
	  addTest();
	//deleteTest();
	//updateTest();
	//findByPkTest();
	//findByNameTest(); 
	//searchTest();
	//listTest();
}
public static void listTest() throws ApplicationException {
	// TODO Auto-generated method stub
	List list=model.list(0, 0);
	Iterator it=list.iterator();
	while(it.hasNext()){
		RoleDTO dto=(RoleDTO) it.next();
		System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
	}
	
}
public static void searchTest() throws ApplicationException {
	// TODO Auto-generated method stub
	RoleDTO dto1=new RoleDTO();
	dto1.setId(1L);
	dto1.setName("admin");
	List<RoleDTO> a=(List<RoleDTO>) model.search(dto1, 0, 0);
	for(RoleDTO dto: a){
		System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
	}
}
public static void findByNameTest() throws ApplicationException {
	// TODO Auto-generated method stub
	RoleDTO dto=model.findByName("admin");
	System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
}
public static void updateTest() throws ApplicationException, DuplicateRecordException {
	// TODO Auto-generated method stub
	RoleDTO dto=new RoleDTO();
	dto.setId(1L);
	dto.setName("admin");
	dto.setDescription("Administrator");
	
	model.update(dto);
}
public static void findByPkTest() throws ApplicationException {
	// TODO Auto-generated method stub
	RoleDTO dto=model.findByPK(2);
	System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
}
public static void deleteTest() throws ApplicationException {
	// TODO Auto-generated method stub
	RoleDTO dto=new RoleDTO();
	dto.setId(2L);
	model.delete(dto);
}
public static void addTest() throws Exception{
	// TODO Auto-generated method stub
	RoleDTO dto=new RoleDTO();
	dto.setName("Student");
	dto.setDescription("Student panel");
	
	System.out.println("ROle Add");
	model.add(dto);
}
}
