package flyawayService;

import java.util.List;

import flyawayDao.adminfunctions;
import flyawaybean.adminbean;
import flyawaybean.loginBean;

public class adminopservice {
	adminfunctions l=new adminfunctions();
public boolean changepass(String password) {
	
	boolean auth=l.changePwd(password);
	if(auth) {
		System.out.println("scucess");
		return auth;
	}
	else {
		System.out.println("failed");
		return auth;
	}

}

public List<adminbean> listSD() {
	return l.listOfSourceAndDestination();
	
}

public List<adminbean> listAirlines(){
	return l.listOfAirlines();
}

public List<adminbean>  airlineSchedule(){
	return l.airlineSchedule();
}
}