package test;

import static org.junit.Assert.*;

import java.util.Date;

import metier.Match;
import metier.TennisPlayer;
import metier.Tournament;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMatch {
	
	protected TennisPlayer tennisPlayer1, tennisPlayer2;
	protected Tournament tournoiInter, tournoiUniv;
	protected Match matchDauphine;

	@Before
	public void setUp() throws Exception {
		Date aujourdhui = new Date();
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis", 21);
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 24);
		tournoiInter = new Tournament ("TournoiInternationale", "France", 10);
		tournoiUniv = new Tournament ("TournoiUniverselle", "Brezil", 20);
		matchDauphine = new Match(aujourdhui, tennisPlayer1, tennisPlayer2, tournoiInter);
		
	}

	@After
	public void tearDown() throws Exception {
	}

/*
	@Test
	public void testGetDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDate() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testGetWinner() {
		assertEquals(null,matchDauphine.getWinner());
	}

	@Test
	public void testSetWinner() {
		matchDauphine.setWinner("Player 1");
		assertEquals("Player 1",matchDauphine.getWinner());
	}

	@Test
	public void testGetTournament() {
		assertEquals(tournoiInter, matchDauphine.getTournament());
	}

	@Test
	public void testSetTournament() {
		matchDauphine.setTournament(tournoiUniv);
		assertEquals(tournoiInter, matchDauphine.getTournament());
	}

	@Test
	public void testGetPlayer1() {
		assertEquals(tennisPlayer1, matchDauphine.getPlayer1());
	}

	@Test
	public void testSetPlayer1() {
		matchDauphine.setPlayer1(tennisPlayer2);
		assertEquals(tennisPlayer2, matchDauphine.getPlayer1());
	}

	@Test
	public void testGetPlayer2() {
		assertEquals(tennisPlayer2, matchDauphine.getPlayer2());
	}

	@Test
	public void testSetPlayer2() {
		matchDauphine.setPlayer2(tennisPlayer1);
		assertEquals(tennisPlayer1, matchDauphine.getPlayer2());
	}

	@Test
	public void testBeWinner() {
		matchDauphine.BeWinner(tennisPlayer1);
		assertEquals(tennisPlayer1, matchDauphine.getWinner());
	}

	@Test
	public void testCheckPoints() {
		fail("Not yet implemented");
	}

}
