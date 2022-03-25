package flyawayService;

import java.util.List;

import flyawayDao.SearchFlight;
import flyawaybean.searchBean;

public class SearchService {
	
	SearchFlight sf=new SearchFlight();

	
	public List<searchBean> searchdetails(searchBean beanfromuser){
		
		return sf.search(beanfromuser);
		
		}
	
	public List<searchBean> alldetails( searchBean beanfromform){
	
		return sf.allFlightDetails(beanfromform);
		
	}
}