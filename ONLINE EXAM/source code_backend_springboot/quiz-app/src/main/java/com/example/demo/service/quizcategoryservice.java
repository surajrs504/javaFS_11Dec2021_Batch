package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.quizcategory;
import com.example.demo.repo.quizcategoryrepo;

@Component
public class quizcategoryservice {

	@Autowired
	private quizcategoryrepo qcr;
	
	public quizcategory addcategory(quizcategory qc) {
		return this.qcr.save(qc);
	}
	
	public List<quizcategory> findall() {
		return this.qcr.findAll();
	}
	
	public void delete(quizcategory qc) {
		Long qid=qc.getCategoryid();
		 this.qcr.deleteById(qid);
	}
	
	public Optional<quizcategory> findbyid(Long qc) {
	//	Long quid = qc.getId();
		return this.qcr.findById(qc);
	}
	
}
