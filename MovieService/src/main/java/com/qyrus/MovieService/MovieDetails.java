package com.qyrus.MovieService;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class MovieDetails {
	public static ArrayList<MovieDetails> tostring;
	private int screenNo;
	private String movieName;
	private String theatreName;
	private int price;
	
	public MovieDetails(int screenNo,String movieName, String theatreName,int price) {
		super();
		this.screenNo=screenNo;
		this.movieName=movieName;
		this.theatreName=theatreName;
		this.price=price;
		
	}
	public MovieDetails () {
		
	}
	public int getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheatreName() {
		return  theatreName;
	}

	public void setTheatreName(String theatreName) {
		this. theatreName = theatreName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MovieDetails [screenNo=" + screenNo + ", movieName=" + movieName + ", theatreName=" + theatreName
				+ ", price=" + price + "]";
	}
	public static Object stream () {
		return null;
	}
	
	}
	
