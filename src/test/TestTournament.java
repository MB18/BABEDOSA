package test;

import static org.junit.Assert.*;
import metier.Person;
import metier.TennisPlayer;
import metier.Tournament;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTournament {

	protected Tournament tournoiInter; 
	protected TennisPlayer tennisPlayer;
	
	
	@Before
	public void setUp() throws Exception {
		tournoiInter = new Tournament ("TournoiInternationale", "France", 10);
		tennisPlayer = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assertEquals("TournoiInternationale", tournoiInter.getName());
	}

	@Test
	public void testSetName() {
		tournoiInter.setName("TournoiUniversty");
		assertEquals("TournoiUniversty", tournoiInter.getName());
	}

	@Test
	public void testGetCountry() {
		assertEquals("France", tournoiInter.getCountry());
	}

	@Test
	public void testSetCountry() {
		tournoiInter.setCountry("Bresil");
		assertEquals("Bresil", tournoiInter.getCountry());
	}

	@Test
	public void testGetWinner() {
		assertEquals(null, tournoiInter.getWinner());
	}

	@Test
	public void testSetWinner() {
		tournoiInter.setWinner("Team 1");
		assertEquals("Team 1", tournoiInter.getWinner());
	}

	@Test
	public void testGetBonus() {
		assertEquals(10, tournoiInter.getBonus());
	}

	@Test
	public void testSetBonus() {
		tournoiInter.setBonus(15);
		assertEquals(15, tournoiInter.getBonus());
	}

	@Test
	public void testBeWinner() {
		
		tournoiInter.BeWinner(tennisPlayer);
		assertEquals("Nicole",tournoiInter.getWinner());
			
	}

}
