package learnerService;


import learnerBean.LoginBean;
import learnerDao.AdminLoginDao;

public class AdminLoginService {
 AdminLoginDao ad= new AdminLoginDao();
	
 
 public boolean validation(LoginBean beanfromuser) {
	 
	 
	 
	 boolean auth=false;
		LoginBean beanfromdb=ad.adminLogin(beanfromuser.getUsername());
		System.out.println(beanfromdb.getUsername()+beanfromdb.getPassword());
		System.out.println(beanfromuser.getUsername()+beanfromuser.getPassword());
		
		if(beanfromdb.getUsername().equals(beanfromdb.getUsername()) && 
				beanfromdb.getPassword().equals(beanfromuser.getPassword())) {
			System.out.println("login success");
			auth=true;
			return auth;
		}
		else
		{System.out.println("login failed");
			return auth;
		}
		
	}
	
}
