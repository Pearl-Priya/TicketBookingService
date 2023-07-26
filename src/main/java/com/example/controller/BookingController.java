package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookingDto;
import com.example.entity.Booking;
import com.example.service.BookingService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/bookings")
@AllArgsConstructor
public class BookingController {

	private BookingService bookingService;
	
	//Build save booking Rest API
	@PostMapping
	public ResponseEntity<BookingDto> saveBooking(@RequestBody BookingDto bookingDto)
	{
		BookingDto savedbookings=bookingService.saveBooking(bookingDto);
		return new ResponseEntity<>(savedbookings,HttpStatus.CREATED);
	}
	
	
	//Build get bookingDetails Rest API
	@GetMapping("{ticked-id}")
	public ResponseEntity<BookingDto> getBookingDetailsByTicketId(@PathVariable("ticked-id") String bookingTicketId)
	{
		BookingDto bookingdetails=bookingService.getBookingDetailsByTicketId(bookingTicketId);
		return new ResponseEntity<>(bookingdetails,HttpStatus.OK);
	}
	
}
