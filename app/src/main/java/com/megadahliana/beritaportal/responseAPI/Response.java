package com.megadahliana.beritaportal.responseAPI;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

public class Response{

	@SerializedName("berita")
	private List<BeritaItem> berita;

	@SerializedName("status")
	private boolean status;

	public void setBerita(List<BeritaItem> berita){
		this.berita = berita;
	}

	public List<BeritaItem> getBerita(){
		return berita;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}