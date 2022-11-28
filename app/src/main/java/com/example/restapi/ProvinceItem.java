package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

public class ProvinceItem{
	private ArrayList<ProvinsiItem> provinsi;

	public void setProvinsi(ArrayList<ProvinsiItem> provinsi){
		this.provinsi = provinsi;
	}

	public ArrayList<ProvinsiItem> getProvinsi(){
		return provinsi;
	}
}