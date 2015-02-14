package test;
// test lmain /+ exceptoon
import static org.junit.Assert.*;

import java.util.ArrayList;

import metier.Dancer;
import metier.Show;
import metier.TennisPlayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestShow {

	protected Show showDauphine;
	protected Dancer dancer1, dancer2;
	protected  ArrayList<Dancer> dancers = new ArrayList<Dancer>();
		
	@Before
	public void setUp() throws Exception {	
		 showDauphine = new Show("ShowDauphine", "Paris");
		 dancer1 = new Dancer("Thomas", "Catton", "Academy Dauphine", 24,"Dance", "Tom");
		 dancer2 = new Dancer("Nicole", "Pearson", "academyDauphine", 24, "Dance", "Nicky");
		 dancers.add(dancer1);
		 dancers.add(dancer2);
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDancers() {
		assertTrue(showDauphine.getDancers().size()==0);
	}

	@Test
	public void testSetDancers() {
		showDauphine.setDancers(dancers);
		assertFalse(showDauphine.getDancers().size()==0);
		assertEquals(2, showDauphine.getDancers().size());
	}

	@Test
	public void testGetPlace() {
		assertEquals("Paris", showDauphine.getPlace());
	}

	@Test
	public void testSetPlace() {
		showDauphine.setPlace("Rio de Janeiro");
		assertEquals("Rio de Janeiro", showDauphine.getPlace());
	}

	@Test
	public void testGetName() {
		assertEquals("ShowDauphine", showDauphine.getName());
	}

	@Test
	public void testSetName() {
		showDauphine.setName("Descartes");
		assertEquals("Descartes", showDauphine.getName());
	}

}
