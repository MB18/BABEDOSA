package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import metier.Academy;
import metier.Dancer;
import metier.Team;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTeam {

		protected Team baDo;
		protected Academy academyDauphine;
		protected Academy academyDescartes;
		protected Dancer dancer1, dancer2, dancer3;
		protected ArrayList<Dancer> dancers = new ArrayList<Dancer>();
		
	@Before
	public void setUp() throws Exception {
		academyDauphine = new Academy(16, "AcademyDauphine", "France", "Paris");
		academyDescartes = new Academy(1, "AcademyDescartes", "Bresil", "Rio de Janeiro");
		baDo = new Team ("BaDo", academyDauphine);
		dancer1 = new Dancer("Thomas", "Catton", "academyDauphine", 24,"Dance", "Tom");
		dancer2 = new Dancer("Nicole", "Pearson", "academyDauphine", 24, "Dance", "Nicky");
		dancer3 = new Dancer("David", "Rudio", "academyDescartes", 28, "Dance", "Dav");
		dancers.add(dancer1);
		dancers.add(dancer2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assertEquals("BaDo", baDo.getName());
	}

	@Test
	public void testSetName() {
		baDo.setName("BetSat");
		assertEquals("BetSat", baDo.getName());
	}

	@Test
	public void testGetAcademy() {
		assertNotNull(baDo.getAcademy());
		assertEquals(academyDauphine, baDo.getAcademy());
	}

	@Test
	public void testSetAcademy() {
		baDo.setAcademy(academyDescartes);
		assertEquals(academyDescartes, baDo.getAcademy());
	}

	@Test
	public void testGetDancers() {
		assertTrue(baDo.getDancers().size()==0);
	}

	@Test
	public void testSetDancers() {
		baDo.setDancers(dancers);
		assertFalse(baDo.getDancers().size()==0);
		assertEquals(2, baDo.getDancers().size());
	}

	@Test
	public void testDanceInTeam() {
		baDo.DanceInTeam(dancer3);
		assertEquals(1, baDo.getDancers().size());
	}

}
	