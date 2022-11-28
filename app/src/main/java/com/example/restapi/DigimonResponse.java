package com.example.restapi;

import java.util.List;

public class DigimonResponse{
	private List<DigimonResponseItem> digimonResponse;

	public void setDigimonResponse(List<DigimonResponseItem> digimonResponse){
		this.digimonResponse = digimonResponse;
	}

	public List<DigimonResponseItem> getDigimonResponse(){
		return digimonResponse;
	}
}