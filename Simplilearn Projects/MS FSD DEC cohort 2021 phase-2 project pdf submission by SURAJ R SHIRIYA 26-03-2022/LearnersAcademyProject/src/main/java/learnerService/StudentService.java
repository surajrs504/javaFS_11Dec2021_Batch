package learnerService;

import java.util.List;

import learnerBean.StudentBean;
import learnerDao.StudentListDao;

public class StudentService {
	StudentListDao sl= new StudentListDao();
 
	public List<StudentBean> liststudent(){
	 return sl.studentlist();
 }
	public boolean deleteStudent(int rno) {
		return sl.deleteStudent(rno);
	}
	public boolean AddStudent(StudentBean bean) {
		return sl.addStudent(bean);
	}
}
