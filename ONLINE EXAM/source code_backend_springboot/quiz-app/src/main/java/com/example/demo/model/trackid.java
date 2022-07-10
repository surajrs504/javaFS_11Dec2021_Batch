package com.example.demo.model;

public class trackid {
	private int id;

	public trackid() {
		super();
	}

	public trackid(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "trackid [id=" + id + "]";
	}

}
