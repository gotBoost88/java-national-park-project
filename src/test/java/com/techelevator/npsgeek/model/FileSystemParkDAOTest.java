package com.techelevator.npsgeek.model;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class FileSystemParkDAOTest {

	@SuppressWarnings("deprecation")
	@Test
	public void readAllParks_returns_one_park() {
		String parkCode = "ABC\t";
		String parkName = "My National Park";
		String input = "ParkCode	ParkName	State	Acreage	ElevationInFt	MilesOfTrail	NumberOfCampsites	Climate	YearFounded	AnnualVisitorCount	Quote	QuoteSource	Description	EntryFee	NumberOfAnimalSpecies\n"+
		parkCode+"\t"+parkName+"\t";
		InputStream source = new ByteArrayInputStream(input.getBytes());
		FileSystemParkDAO parkDAO = new FileSystemParkDAO(source);
		
		List<Park> results = parkDAO.readAllParks();
		
		Assert.assertNotNull(results);
		Assert.assertEquals(1, results.size());
		Park park = results.get(0);
		Assert.assertEquals(parkCode, park.getParkCode());
		Assert.assertEquals(parkName, park.getName());
	}

}
