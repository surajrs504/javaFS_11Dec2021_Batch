package flyawayService;

import flyawayDao.loginDao;
import flyawaybean.adminbean;
import flyawaybean.loginBean;

public class adminLogin {
loginDao l= new loginDao();

public boolean loginservice(loginBean beanfromuser) {
	boolean auth=false;
	loginBean beanfromdb=l.loginmeth(beanfromuser.getusername());
	System.out.println(beanfromdb.getusername()+beanfromdb.getpassword());
	System.out.println(beanfromuser.getusername()+beanfromuser.getpassword());
	
	if(beanfromdb.getusername().equals(beanfromdb.getusername()) && 
			beanfromdb.getpassword().equals(beanfromuser.getpassword())) {
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
