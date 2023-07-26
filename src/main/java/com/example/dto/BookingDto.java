package com.example.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
	
	private Long id;
	private String bookingTicketId;
	private LocalDateTime localDateTime;
	private Boolean isBooked;
	
}
