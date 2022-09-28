package com.flight.project.Controller;

import java.math.BigInteger;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flight.project.dto.Booking;
import com.flight.project.service.BookingService;

@RestController
@RequestMapping("/flight/bookings")
public class BookingController {
	private BookingService bookser;

	public BookingController(BookingService bookser) {
		super();
		this.bookser = bookser;
	}
	
	@PostMapping
	public ResponseEntity<Booking> saveBooking(@RequestBody Booking book){
		return new ResponseEntity<Booking>
		(bookser.saveBooking(book),HttpStatus.CREATED);
	
	}
	
	//view single booking
	@GetMapping("{id}")
    public ResponseEntity<Booking>viewBooking(@PathVariable("id")BigInteger bookingId){
         return new ResponseEntity<Booking>(bookser.viewBooking(bookingId),
                 HttpStatus.OK);
    }
	//view all booking
	@GetMapping
    public List<Booking> getAllBooking(){
        return bookser.viewAllBooking();
    }
	
	//update booking details
	 @PutMapping("{id}")
	    public ResponseEntity<Booking> updateBooking(@PathVariable("id") BigInteger id,
	            @RequestBody Booking booking ){
	        return new ResponseEntity<Booking>
	        (bookser.updateBooking(booking,id),HttpStatus.OK);
	    }
	 
	 //delete booking from
	 @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteBooking(@PathVariable("id") BigInteger id){
		 bookser.deleteBooking(id);
	        return new ResponseEntity<String>("Booking deleted successfully.!", HttpStatus.OK);
	        
	    }
}
