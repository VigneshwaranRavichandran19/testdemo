package com.lti.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Passenger;
import com.lti.model.Passenger.Gender;
import com.lti.model.Passenger.Status;
import com.lti.model.Pnr;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PnrController {
	
	@GetMapping("/pnr")
	
	public Pnr getPnrStatus(@RequestParam("q") int pnrNo) {
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(12345);
		pnr.setTravelDate(LocalDate.now());
		
		List<Passenger> passengers = new ArrayList<Passenger>();
		
		Passenger p1 = new Passenger();
		p1.setName("Priya");
		p1.setGender(Gender.FEMALE);
		p1.setStatus(Status.WAITING);
		
		Passenger p2 = new Passenger();
		p2.setName("Preetha");
		p2.setGender(Gender.FEMALE);
		p2.setStatus(Status.CONFIRMED);
		
		passengers.add(p1);
		passengers.add(p2);
		pnr.setPassengers(passengers);
		
		return pnr;
	}

}
