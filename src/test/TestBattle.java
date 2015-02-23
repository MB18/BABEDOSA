package test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import metier.Academy;
import metier.Battle;
import metier.Dancer;
import metier.Team;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBattle {

	protected Battle battleDauphine;
	protected Team BetSat, baDo, DauDau;
	protected Date aujourdhui, newdate;
	protected DateFormat formatter;
	protected Locale locale = Locale.getDefault();
	protected Academy academyDauphine;
	protected Dancer dancer1, dancer2, dancer3, dancer4, dancer5, dancer21, dancer22, dancer23, dancer24, dancer25;
	protected ArrayList<Dancer> dancers = new ArrayList<Dancer>();
	protected ArrayList<Dancer> dancersteam2 = new ArrayList<Dancer>();
	protected ArrayList<Dancer> dancersteam3 = new ArrayList<Dancer>();
	@Before
	public void setUp() throws Exception {
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		aujourdhui = Calendar.getInstance().getTime();
		//System.out.println("String : " + formatter.format(aujourdhui));
		academyDauphine = new Academy(16, "AcademyDauphine", "France", "Paris");
		BetSat = new Team("BetSat", academyDauphine);
		baDo = new Team ("BaDo", academyDauphine);
		DauDau = new Team ("DauDau", academyDauphine);
		dancer1 = new Dancer("Thomas", "Catton", "academyDauphine", 24,"Dance", "Tom");
		dancer2 = new Dancer("Nicole", "Pearson", "academyDauphine", 24, "Dance", "Nicky");
		dancer3 = new Dancer("David", "Rudio", "academyDauphine", 28, "Dance", "Dav");
		dancer4 = new Dancer("Sophie", "Lopez", "academyDauphine", 23, "Dance", "Lop");
		dancer5 = new Dancer("David", "Rudio", "academyDauphine", 23, "Dance", "Dav");
		
		dancer21 = new Dancer("Aurore", "Catton", "academyDauphine", 24,"Dance", "AU");
		dancer22 = new Dancer("Marie", "Pearson", "academyDauphine", 24, "Dance", "Rie");
		dancer23 = new Dancer("Lucie", "Rudio", "academyDauphine", 28, "Dance", "Lux");
		dancer24 = new Dancer("Rebecca", "Lopez", "academyDauphine", 23, "Dance", "Rev");
		dancer25 = new Dancer("Jon", "Rudio", "academyDauphine", 23, "Dance", "Jon");
		dancers.add(dancer1);
		dancers.add(dancer2);
		dancers.add(dancer4);
		dancers.add(dancer5);
		dancersteam2.add(dancer21);
		dancersteam2.add(dancer22);
		dancersteam2.add(dancer23);
		dancersteam2.add(dancer24);
		dancersteam2.add(dancer25);
		dancersteam3.add(dancer21);
		dancersteam3.add(dancer22);
		//dancersteam3.add(dancer23);
	//	dancersteam3.add(dancer24);
		//dancersteam3.add(dancer25);
		battleDauphine = new Battle (aujourdhui, "Dauphine", BetSat, baDo);
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
		battleDauphine.setTeam1(baDo);
		assertEquals(baDo, battleDauphine.getTeam1());
	}

	@Test
	public void testGetTeam2() {
		assertSame(baDo, battleDauphine.getTeam2());
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
	
	@Test
	public void testCheckBattle(){
		BetSat.setDancers(dancers);
		baDo.setDancers(dancersteam2);
		DauDau.setDancers(dancersteam3);
		System.out.println (baDo.getDancers().size());
		System.out.println (DauDau.getDancers().size());
		assertEquals(true,battleDauphine.CheckBattle(baDo, BetSat));
		assertEquals(false,battleDauphine.CheckBattle(baDo, DauDau));	
		assertEquals(false,battleDauphine.CheckBattle(DauDau, baDo));
	}

}
