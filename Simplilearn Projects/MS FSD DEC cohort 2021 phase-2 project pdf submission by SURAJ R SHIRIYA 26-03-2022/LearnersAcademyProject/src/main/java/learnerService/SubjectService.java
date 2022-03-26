package learnerService;

import java.util.List;

import learnerBean.StudentBean;
import learnerBean.SubjectBean;
import learnerDao.SubjectDao;

public class SubjectService {
	SubjectDao sl= new SubjectDao();
	 
	public List<SubjectBean> listSubjects(){
	 return sl.subjectList();
 }
	public boolean DeleteSubject(int sno) {
		return sl.deleteSubject(sno);
	}
	public boolean AddSubject(SubjectBean bean) {
		return sl.addSubject(bean);
	}
}
