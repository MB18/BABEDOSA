package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import metier.Dancer;
import metier.Match;
import metier.Person;
import metier.TennisPlayer;
import metier.Tournament;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTournament {

	protected Tournament tournoiInter; 
	protected TennisPlayer tennisPlayer1, tennisPlayer2;
	protected Match matchDauphine;
	protected ArrayList<TennisPlayer> participants = new ArrayList<TennisPlayer>();
	private ArrayList<Match> fixtures  = new ArrayList<Match>();
	
	
	@Before
	public void setUp() throws Exception {
		Date aujourdhui = new Date();
		tournoiInter = new Tournament ("TournoiInternationale", "France", 10);
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");	
		participants.add(tennisPlayer1);
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 4000);
		matchDauphine = new Match(aujourdhui, tennisPlayer1, tennisPlayer2, tournoiInter);
		fixtures.add(matchDauphine);
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
		
		tournoiInter.BeWinner(tennisPlayer1);
		assertEquals("Nicole",tournoiInter.getWinner());
			
	}
	
	@Test
	public void testGetParticipants()
	{
		assertEquals(0, tournoiInter.getParticipants().size());
	}

	@Test
	public void testSetParticipants()
	{
		tournoiInter.setParticipants(participants);
		assertEquals(1, tournoiInter.getParticipants().size());
	}

	@Test
	public void testGetFixtures()
	{
		assertEquals(0, tournoiInter.getFixtures().size());
	}
	
	@Test
	public void testSetFixtures()
	{
		tournoiInter.setFixtures(fixtures);
		assertEquals(1, tournoiInter.getFixtures().size());
	}
	
	@Test
	 public void testTournamentParticipation(){
	    	assertEquals(false, tournoiInter.TournamentParticipation(tennisPlayer1));
	    	assertEquals(true, tournoiInter.TournamentParticipation(tennisPlayer2));
	    }
	

}
