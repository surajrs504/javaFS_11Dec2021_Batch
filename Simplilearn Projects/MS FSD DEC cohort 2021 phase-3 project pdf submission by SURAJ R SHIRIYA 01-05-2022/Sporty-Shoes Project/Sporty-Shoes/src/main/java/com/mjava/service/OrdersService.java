package com.mjava.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.dao.OrdersDao;
import com.mjava.model.OrderedShoeModel;
import com.mjava.model.ShoesDataModel;

@Service
public class OrdersService {
	@Autowired
	private OrdersDao orderDao;
	
	 public void insertBookingInfoService(int shoeid, String name, int category,
			 double price, String imglink, int quantity, double totalprice,Date date )
	 {
		 OrderedShoeModel  orderedShoeModel =new  OrderedShoeModel(shoeid, category, quantity, price, quantity, date, name, imglink, totalprice);
		 orderDao.save(orderedShoeModel);
	 }
	 
	 public  List<OrderedShoeModel> getCompleteTransactionsDataService() {
		 List<OrderedShoeModel> completeOrdersData= (List) orderDao.findAll();
	     return completeOrdersData;
	    }
 
	 public List<OrderedShoeModel> getRequiredCompleteTransactionsDataService(int categoryId,Date date)
	 {
		 List<OrderedShoeModel> orderedShoeList= (List)orderDao.findByCategoryAndDate(categoryId, date);
		 return orderedShoeList;
	 
	 }

}
