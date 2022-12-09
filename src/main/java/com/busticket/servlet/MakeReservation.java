package com.busticket.servlet;

public class MakeReservation {
	
	private String Name;
	private int Mobile_no;
	private String Destination;
	private int Seat_no;
	private int No_of_passenger;
	
	public MakeReservation(String Name, int Mobile_no, String Destination, int Seat_no,
			int No_of_passenger) {
		super();
		
		this.Name = Name;
		this.Mobile_no = Mobile_no;
		this.Destination = Destination;
		this.Seat_no = Seat_no;
		this.No_of_passenger = No_of_passenger;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	public Integer getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(Integer mobile_no) {
		Mobile_no = mobile_no;
	}

	

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String Destination) {
		this.Destination = Destination;
	}

	public int getSeat_no() {
		return Seat_no;
	}

	public void setSeat_no(int Seat_no) {
		this.Seat_no = Seat_no;
	}

	public int getNo_of_passenger() {
		return No_of_passenger;
	}

	public void setNo_of_passenger(int No_of_passenger) {
		this.No_of_passenger = No_of_passenger;
	}
	
}
