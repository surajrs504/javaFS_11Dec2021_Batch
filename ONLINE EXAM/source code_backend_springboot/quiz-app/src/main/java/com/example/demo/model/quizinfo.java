package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class quizinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quizinfoid;
	private String quiztitle;
	private String  quizdescription;
	private String  quizmaxmarks;
	private String  quiznumofquestions;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private quizcategory categoryquizes;
	
	@OneToMany(mappedBy = "qi" , cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<quizquestion> qq=new HashSet<>();
	
	
	public quizinfo() {
		super();
	}


	


	public quizinfo(Long quizinfoid, String quiztitle, String quizdescription, String quizmaxmarks,
			String quiznumofquestions, quizcategory categoryquizes) {
		super();
		this.quizinfoid = quizinfoid;
		this.quiztitle = quiztitle;
		this.quizdescription = quizdescription;
		this.quizmaxmarks = quizmaxmarks;
		this.quiznumofquestions = quiznumofquestions;
		this.categoryquizes = categoryquizes;
	}





	public Long getQuizinfoid() {
		return quizinfoid;
	}


	public void setQuizinfoid(Long quizinfoid) {
		this.quizinfoid = quizinfoid;
	}


	public String getQuiztitle() {
		return quiztitle;
	}


	public void setQuiztitle(String quiztitle) {
		this.quiztitle = quiztitle;
	}


	public String getQuizdescription() {
		return quizdescription;
	}


	public void setQuizdescription(String quizdescription) {
		this.quizdescription = quizdescription;
	}


	public String getQuizmaxmarks() {
		return quizmaxmarks;
	}


	public void setQuizmaxmarks(String quizmaxmarks) {
		this.quizmaxmarks = quizmaxmarks;
	}


	public String getQuiznumofquestions() {
		return quiznumofquestions;
	}


	public void setQuiznumofquestions(String quiznumofquestions) {
		this.quiznumofquestions = quiznumofquestions;
	}


	public quizcategory getCategoryquizes() {
		return categoryquizes;
	}


	public void setCategoryquizes(quizcategory categoryquizes) {
		this.categoryquizes = categoryquizes;
	}


	public Set<quizquestion> getQq() {
		return qq;
	}


	public void setQq(Set<quizquestion> qq) {
		this.qq = qq;
	}


	@Override
	public String toString() {
		return "quizinfo [quizinfoid=" + quizinfoid + ", quiztitle=" + quiztitle + ", quizdescription="
				+ quizdescription + ", quizmaxmarks=" + quizmaxmarks + ", quiznumofquestions=" + quiznumofquestions
				+ ", categoryquizes=" + categoryquizes + ", qq=" + qq + "]";
	}
	
	

}
