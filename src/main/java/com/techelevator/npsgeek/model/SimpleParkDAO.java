package com.techelevator.npsgeek.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkDAO implements ParkDAO {
	
	private List<Park> listOfParks;
	
	public SimpleParkDAO() {
		
		
		listOfParks= new ArrayList<Park>();
		Park park = new Park("GNP");
		park.setName("Glacier National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Montana");
		park.setAcreage("1013322");
		park.setAnnualVisitors("2338528");
		park.setClimate("Temperate");
		park.setElevation("6646");
		park.setEntryFee("$12");
		park.setMilesOfTrail("745.6");
		park.setNumberOfAnimalSpecies("300");
		park.setNumberOfCampsites("923");
		park.setQuote("Far away in northwestern Montana, hidden from view by clustering mountain peaks, lies an unmapped corner—the Crown of the Continent.");
		park.setQuoteSource("George Bird Grinnell");
		park.setYearFounded("1910");
		listOfParks.add(park);
		
		park = new Park("GCNP");
		park.setName("Grand Canyon National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Arizona");
		park.setAcreage("1217262");
		park.setAnnualVisitors("4756771");
		park.setClimate("Desert");
		park.setElevation("8000");
		park.setEntryFee("$8");
		park.setMilesOfTrail("115");
		park.setNumberOfAnimalSpecies("450");
		park.setNumberOfCampsites("120");
		park.setQuote("It is the one great wonders. . . every American should see.");
		park.setQuoteSource("Theodore Roosevelt");
		park.setYearFounded("1919");
		listOfParks.add(park);
		
		park = new Park("CVNP");
		park.setName("Cuyahoga Valley National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Ohio");
		park.setAcreage("32832");
		park.setAnnualVisitors("2189849");
		park.setClimate("Woodland");
		park.setElevation("696");
		park.setEntryFee("$0");
		park.setMilesOfTrail("115");
		park.setNumberOfAnimalSpecies("390");
		park.setNumberOfCampsites("0");
		park.setQuote("Of all the paths you take in life, make sure a few of them are dirt.");
		park.setQuoteSource("John Muir");
		park.setYearFounded("2000");
		listOfParks.add(park);
		
		park = new Park("ENP");
		park.setName("Everglades National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Florida");
		park.setAcreage("1508538");
		park.setAnnualVisitors("1110901");
		park.setClimate("Tropical");
		park.setElevation("0");
		park.setEntryFee("$8");
		park.setMilesOfTrail("35");
		park.setNumberOfAnimalSpecies("760");
		park.setNumberOfCampsites("0");
		park.setQuote("There are no other Everglades in the world. They are, they have always been, one of the unique regions of the earth; remote, never wholly known. Nothing anywhere else is like them.");
		park.setQuoteSource("Marjory Stoneman Douglas");
		park.setYearFounded("1934");
		listOfParks.add(park);
		
		park = new Park("YNP2");
		park.setName("Yosemite National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("California");
		park.setAcreage("747956");
		park.setAnnualVisitors("3882642");
		park.setClimate("Forest");
		park.setElevation("5000");
		park.setEntryFee("$15");
		park.setMilesOfTrail("800");
		park.setNumberOfAnimalSpecies("420");
		park.setNumberOfCampsites("1720");
		park.setQuote("Yosemite Valley, to me, is always a sunrise, a glitter of green and golden wonder in a vast edifice of stone and space.");
		park.setQuoteSource("Ansel Adams");
		park.setYearFounded("1890");
		listOfParks.add(park);
		
		park = new Park("MRNP");
		park.setName("Mount Ranier National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Washington");
		park.setAcreage("236381");
		park.setAnnualVisitors("1038229");
		park.setClimate("Rainforest");
		park.setElevation("5500");
		park.setEntryFee("$20");
		park.setMilesOfTrail("260");
		park.setNumberOfAnimalSpecies("280");
		park.setNumberOfCampsites("573");
		park.setQuote("Of all the fire mountains which like beacons, once blazed along the Pacific Coast, Mount Rainier is the noblest.");
		park.setQuoteSource("Unknown");
		park.setYearFounded("1899");
		listOfParks.add(park);
		
		park = new Park("RMNP");
		park.setName("Rocky Mountain National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Colorado");
		park.setAcreage("265761");
		park.setAnnualVisitors("3176941");
		park.setClimate("Woodland");
		park.setElevation("7800");
		park.setEntryFee("$0");
		park.setMilesOfTrail("300");
		park.setNumberOfAnimalSpecies("390");
		park.setNumberOfCampsites("660");
		park.setQuote("It's not the mountain we conquer, but ourselves.");
		park.setQuoteSource("Sir Edmund Hilary");
		park.setYearFounded("1915");
		listOfParks.add(park);
		
		park = new Park("GSMNP");
		park.setName("Great Smoky Mountains National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Tennessee");
		park.setAcreage("522419");
		park.setAnnualVisitors("10099276");
		park.setClimate("Temperate");
		park.setElevation("6500");
		park.setEntryFee("$0");
		park.setMilesOfTrail("850");
		park.setNumberOfAnimalSpecies("400");
		park.setNumberOfCampsites("939");
		park.setQuote("May your trails be crooked, winding, lonesome, dangerous, leading to the most amazing view. May your mountains rise into and above the clouds.");
		park.setQuoteSource("Edward Abbey");
		park.setYearFounded("1934");
		listOfParks.add(park);
		
		park = new Park("GTNP");
		park.setName("Grand Teton National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Wyoming");
		park.setAcreage("310000");
		park.setAnnualVisitors("2791392");
		park.setClimate("Temperate");
		park.setElevation("6800");
		park.setEntryFee("$20");
		park.setMilesOfTrail("200");
		park.setNumberOfAnimalSpecies("280");
		park.setNumberOfCampsites("1206");
		park.setQuote("We can not have freedom without wilderness.");
		park.setQuoteSource("Edward Abbey");
		park.setYearFounded("1929");
		listOfParks.add(park);
		
		park = new Park("YNP");
		park.setName("Yellowstone National Park");
		park.setDescription("Pellentesque sed ligula in metus semper lobortis vel a nulla. Proin varius sem nec interdum vehicula. Aliquam sed volutpat sapien, nec vulputate ante. ");
		park.setLocation("Wyoming");
		park.setAcreage("2219791");
		park.setAnnualVisitors("3394326");
		park.setClimate("Temperate");
		park.setElevation("8000");
		park.setEntryFee("$15");
		park.setMilesOfTrail("900");
		park.setNumberOfAnimalSpecies("390");
		park.setNumberOfCampsites("1900");
		park.setQuote("We can not have freedom without wilderness.");
		park.setQuoteSource("Edward Abbey");
		park.setYearFounded("1872");
		listOfParks.add(park);
	}

	@Override
	public List<Park> readAllParks() {
		
		return listOfParks;
	}


	@Override
	public Park findParkByCode(String parkCode) {
			Park found = null;
			for(Park p : listOfParks) {
				if(p.getParkCode() == parkCode)
					found = p;
			}
			return found;
		}
}
