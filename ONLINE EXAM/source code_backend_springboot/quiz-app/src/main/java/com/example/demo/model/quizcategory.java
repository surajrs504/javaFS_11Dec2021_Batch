package com.example.demo.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class quizcategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long categoryid;
	
	private String categorytitle;
	
	private String categorydescription;
	
	@OneToMany(mappedBy = "categoryquizes" , cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<quizinfo> categoryquizes=new LinkedHashSet<>();


	public quizcategory() {
		super();
		
	}


	


	public quizcategory(Long categoryid, String categorytitle, String categorydescription) {
		super();
		this.categoryid = categoryid;
		this.categorytitle = categorytitle;
		this.categorydescription = categorydescription;
	}





	public Long getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}


	public String getCategorytitle() {
		return categorytitle;
	}


	public void setCategorytitle(String categorytitle) {
		this.categorytitle = categorytitle;
	}


	public String getCategorydescription() {
		return categorydescription;
	}


	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}


	public Set<quizinfo> getCategoryquizes() {
		return categoryquizes;
	}


	public void setCategoryquizes(Set<quizinfo> categoryquizes) {
		this.categoryquizes = categoryquizes;
	}


	@Override
	public String toString() {
		return "quizcategory [categoryid=" + categoryid + ", categorytitle=" + categorytitle + ", categorydescription="
				+ categorydescription + ", categoryquizes=" + categoryquizes + "]";
	}



}
