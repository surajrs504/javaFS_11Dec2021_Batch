package learnerService;

import java.util.ArrayList;
import java.util.List;

import learnerBean.ClassBean;
import learnerBean.ClassReportBean;
import learnerBean.StudentBean;
import learnerDao.ClassListDao;
import learnerDao.StudentListDao;

public class ClassReportService {

	 public List<ClassBean> classdetails(int cno) {
		 ArrayList<ClassReportBean> alldetails=new ArrayList<ClassReportBean>();
		
		 ClassListDao cl= new ClassListDao();
		
		
		 return cl.classreportlist(cno);
		 
	 }
	 public List<StudentBean> StudentClassDetails(int cno){
		 StudentListDao sl=new StudentListDao();
		return sl.studentclasslist(cno);
	 }
	
	
}
