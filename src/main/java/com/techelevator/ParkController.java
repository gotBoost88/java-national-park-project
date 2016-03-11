package com.techelevator;

import java.io.InputStream;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.npsgeek.model.FileSystemParkDAO;
import com.techelevator.npsgeek.model.Park;
import com.techelevator.npsgeek.model.ParkDAO;
import com.techelevator.npsgeek.model.SimpleParkDAO;

@Controller 
public class ParkController {
	
	private ParkDAO parkDAO;
	
	public ParkController() {
		InputStream parkDataInputStream = this.getClass().getResourceAsStream("/data/Parks.tsv");
		parkDAO = new FileSystemParkDAO(parkDataInputStream);
	}

	@RequestMapping("/")
	public String displayParkList(Map<String, Object> model) {
		
		model.put("listOfParks", parkDAO.readAllParks());
		return "parkList";
	}
	
	@RequestMapping(path="/parkDetail")
	public String displayParkDetail(Map<String, Object> model,@RequestParam("parkCode") String parkCode) {
		
		ParkDAO parkDAO = new SimpleParkDAO();
		Park requestedPark = parkDAO.findParkByCode(parkCode);
		model.put("parkCode", requestedPark);
		
		
		return "parkDetail";
	
	}
}
