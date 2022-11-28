package com.example.restapi;

import java.util.List;

public class Response{
	private List<ProvinsiItem> provinsi;

	public void setProvinsi(List<ProvinsiItem> provinsi){
		this.provinsi = provinsi;
	}

	public List<ProvinsiItem> getProvinsi(){
		return provinsi;
	}
}