package com.flight.project.service;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.Exception.BookingExcp;
import com.flight.project.Repository.BookingRepos;
import com.flight.project.dto.Booking;

@Service
public class BookingServiceImpl implements BookingService{
	//dependency injection
	@Autowired
	private BookingRepos bookrepo;
    
	//constructor injection
	public BookingServiceImpl(BookingRepos bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}
     //addbooking method
	@Override
	public Booking saveBooking(Booking book) {
		return bookrepo.save(book);
	}
    //find a single booking
	@Override
	public Booking viewBooking(BigInteger id) {
		return bookrepo.findById(id).orElseThrow(()->
		new BookingExcp("Booking","Id",id));
	}
    
	//find all booking
	@Override
	public List<Booking> viewAllBooking() {
		return bookrepo.findAll();
	}
    
	//update booking
	@Override
	public Booking updateBooking(Booking booking, BigInteger id) {
		Booking bookObj =bookrepo.findById(id).orElseThrow(()-> new BookingExcp("Booking","Id",id));
		bookObj.setBookingdate(booking.getBookingdate());
		bookObj.setTicketcost(booking.getTicketcost());
		bookObj.setNoofpassenger(booking.getNoofpassenger());
		bookrepo.save(bookObj);
		return bookObj;
	}
     
	//delete booking
	@Override
	public void deleteBooking(BigInteger id) {
		bookrepo.findById(id).orElseThrow(()-> new BookingExcp("Booking","Id",id));
		bookrepo.deleteById(id);
		
	}
	
	
	
}
