package com.techelevator.npsgeek.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSystemParkDAO implements ParkDAO {
	
	private BufferedReader inputReader;
	
	public FileSystemParkDAO(File parkDataFile) {
		try {
			FileInputStream input = new FileInputStream(parkDataFile);
			InputStreamReader reader = new InputStreamReader(input);
			this.inputReader = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	public FileSystemParkDAO(InputStream input) {
		InputStreamReader reader = new InputStreamReader(input);
		this.inputReader = new BufferedReader(reader);
	}

	@Override
	public List<Park> readAllParks() {
		List<Park> results = new ArrayList<>();
		throwAwayHeaderLine();
		String line = readNextLine();
		
		while(line != null) {
			String[] fields = line.split("\t");
			Park thePark = new Park(fields[0]);
			thePark.setName(fields[1]);
			results.add(thePark);
			line = readNextLine();
		}
		return results;
	}

	private void throwAwayHeaderLine() {
		readNextLine();
	}

	private String readNextLine() {
		String line = null;
		try {
			
		line = inputReader.readLine();
		} catch(IOException e) {
			
		}
		return line;
	}

	@Override
	public Park findParkByCode(String parkCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
