package com.flight.project.dto;

import java.math.BigInteger;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;	

@Entity
//@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger bookingId;
	@Column(name="date")
	private  String bookingdate;
	@Column(name="cost")
	private double ticketcost;
	@Column(name="passenger")
	private int noofpassenger;
	public Booking(BigInteger bookingId, String bookingdate, double ticketcost, int noofpassenger) {
		this.bookingId = bookingId;
		this.bookingdate = bookingdate;
		this.ticketcost = ticketcost;
		this.noofpassenger = noofpassenger;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigInteger getBookingId() {
		return bookingId;
	}
	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public double getTicketcost() {
		return ticketcost;
	}
	public void setTicketcost(double ticketcost) {
		this.ticketcost = ticketcost;
	}
	public int getNoofpassenger() {
		return noofpassenger;
	}
	public void setNoofpassenger(int noofpassenger) {
		this.noofpassenger = noofpassenger;
	}
	
	
	
	
}
