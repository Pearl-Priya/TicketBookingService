package com.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.BookingDto;
import com.example.entity.Booking;
import com.example.repository.BookingRepository;
import com.example.service.BookingService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService{

	
	private BookingRepository bookingRepository;

	@Override
	public BookingDto saveBooking(BookingDto bookingDto) 
	{
		Booking booking=new Booking(bookingDto.getId(), bookingDto.getBookingTicketId(), bookingDto.getLocalDateTime(), bookingDto.getIsBooked());
		Booking savedObject=bookingRepository.save(booking);
		BookingDto savedbookingDto=new BookingDto(savedObject.getId(), savedObject.getBookingTicketId(), savedObject.getLocalDateTime(), savedObject.getIsBooked());
		
		return savedbookingDto;
	}

	@Override
	public BookingDto getBookingDetailsByTicketId(String bookingTickedId) {
		
		Booking bookingdetails=bookingRepository.findByBookingTicketId(bookingTickedId);
		BookingDto bookingDtodetails=new BookingDto(bookingdetails.getId(),bookingdetails.getBookingTicketId(),bookingdetails.getLocalDateTime(),bookingdetails.getIsBooked());
		return bookingDtodetails;
	}
	
	
	

}
