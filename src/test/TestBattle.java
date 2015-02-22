package test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import metier.Battle;
import metier.Team;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBattle {

	protected Battle battleDauphine;
	protected Team BetSat, BaDo;
	protected Date aujourdhui, newdate;
	protected DateFormat formatter;
	protected Locale locale = Locale.getDefault();
	
	@Before
	public void setUp() throws Exception {
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		aujourdhui = Calendar.getInstance().getTime();
		//System.out.println("String : " + formatter.format(aujourdhui));
		BetSat = new Team("BetSat", null);
		battleDauphine = new Battle (aujourdhui, "Dauphine", BetSat, BaDo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDate() {	
		assertEquals(aujourdhui, battleDauphine.getDate());
	}

	@Test
	public void testSetDate() {
		
		String dateMAJ = "02-03-2015";
		Date newdate=null;
		try {
			newdate = formatter.parse(dateMAJ);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//System.out.println("avant : " + newdate);
		battleDauphine.setDate(newdate);
		//System.out.println("avant : battleDauphine.getDate() : " + formatter.format(battleDauphine.getDate()));
		assertEquals("02-03-2015", formatter.format(battleDauphine.getDate()));
	}

	@Test
	public void testGetPlace() {
		assertEquals("Dauphine", battleDauphine.getPlace());
	}

	@Test
	public void testSetPlace() {
		battleDauphine.setPlace("Descartes");
		assertEquals("Descartes", battleDauphine.getPlace());
	}
	
	@Test
	public void testGetTeam1() {
		assertSame(BetSat, battleDauphine.getTeam1());
	}

	@Test
	public void testSetTeam1() {
		battleDauphine.setTeam1(BaDo);
		assertEquals(BaDo, battleDauphine.getTeam1());
	}

	@Test
	public void testGetTeam2() {
		assertSame(BaDo, battleDauphine.getTeam2());
	}

	@Test
	public void testSetTeam2() {
		battleDauphine.setTeam2(BetSat);
		assertEquals(BetSat, battleDauphine.getTeam2());
	}

	@Test
	public void testGetWinner() {
		assertNull(battleDauphine.getWinner());
	}

	@Test
	public void testSetWinner() {
		battleDauphine.setWinner("BaDo");
		assertNotNull(battleDauphine.getWinner());
		assertEquals("BaDo", battleDauphine.getWinner());
	}
	

	@Test
	public void testWinBattle() {
		battleDauphine.WinBattle(BetSat);
		assertEquals("BetSat", battleDauphine.getWinner());
	}
}
