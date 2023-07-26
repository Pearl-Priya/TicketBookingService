package com.example.service;

import com.example.dto.BookingDto;
import com.example.entity.Booking;

public interface BookingService {
	
	BookingDto saveBooking(BookingDto bookingDto);
	BookingDto getBookingDetailsByTicketId(String bookingTickedId);

}
