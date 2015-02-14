package test;

import static org.junit.Assert.*;
import metier.Person;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

	protected Person personDance, personTennis;

	
	@Before
	public void setUp() throws Exception {
		personDance = new Person("Thomas", "Catton","academyDauphine", 24, "Tom", "Dance");
		personTennis = new Person("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");		
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetAcademy() {
		assertEquals("academyDauphine", personDance.getAcademy());
		assertEquals("academyDauphine", personTennis.getAcademy());
	}
	
	@Test
	public void testSetAcademy() {
		personDance.setAcademy("Descartes Academy");
		assertEquals("Descartes Academy", personDance.getAcademy());
	}

	@Test
	public void testGetAge() {
		assertEquals(24, personDance.getAge());
	}

	@Test
	public void testSetAge() {
		personDance.setAge(26);
		assertEquals(26, personDance.getAge());
	}

	@Test
	public void testGetName() {
		assertEquals("Nicole", personTennis.getName());
	}

	@Test
	public void testSetName() {
		personTennis.setName("Suzanne");
		assertEquals("Suzanne", personTennis.getName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Pearson", personTennis.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		personTennis.setFirstName("Meyer");
		assertEquals("Meyer", personTennis.getFirstName());
	}

	@Test
	public void testGetSurname() {
		assertEquals("Nicky", personTennis.getSurname());
	}

	@Test
	public void testSetSurname() {
		personTennis.setSurname("Pears");
		assertEquals("Pears", personTennis.getSurname());
	}

	@Test
	public void testGetSpeciality() {
		assertEquals("Dance", personDance.getSpeciality());
	}

	@Test
	public void testSetSpeciality() {
		personDance.setSpeciality("Dance");
		assertEquals("Dance", personDance.getSpeciality());
	}

}
