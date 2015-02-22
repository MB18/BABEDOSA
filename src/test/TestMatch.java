package test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

import metier.Match;
import metier.TennisPlayer;
import metier.Tournament;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMatch {
	
	protected TennisPlayer tennisPlayer1, tennisPlayer2,tennisPlayer3;
	protected Tournament tournoiInter, tournoiUniv;
	protected Match matchDauphine, matchDescartes;
	protected Date aujourdhui, newdate;
	protected DateFormat formatter;

	@Before
	public void setUp() throws Exception {
		aujourdhui = new Date();
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		aujourdhui = Calendar.getInstance().getTime();
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis", 5000);
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 4000);
		tennisPlayer3 = new TennisPlayer("Elise", "Catton","academyDauphine", 23, "Eli", "Tennis", 1000);
		tournoiInter = new Tournament ("TournoiInternationale", "France", 10);
		tournoiUniv = new Tournament ("TournoiUniverselle", "Brezil", 20);
		matchDauphine = new Match(aujourdhui, tennisPlayer1, tennisPlayer2, tournoiInter);
		matchDescartes = new Match(aujourdhui, tennisPlayer3, tennisPlayer2, tournoiInter);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDate() {
		assertEquals(aujourdhui,matchDauphine.getDate());		
	}

	@Test
	public void testSetDate() {
		String dateMAJ = "02-03-2015";
		Date newdate=null;
		try {
			newdate = formatter.parse(dateMAJ);
		} catch (ParseException e) {
		}
		matchDauphine.setDate(newdate);
		assertEquals("02-03-2015", formatter.format(matchDauphine.getDate()));
	}
	
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
		assertEquals(tournoiUniv, matchDauphine.getTournament());
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
		assertEquals(tennisPlayer1.getName(), matchDauphine.getWinner());
	}

	@Test
	public void testCheckPoints() {
		assertEquals(true, matchDauphine.CheckPoints(tennisPlayer1, tennisPlayer2));
		assertEquals(false, matchDauphine.CheckPoints(tennisPlayer3, tennisPlayer2));
	}

}
