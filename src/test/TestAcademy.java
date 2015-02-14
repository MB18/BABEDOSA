package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import metier.Academy;
import metier.Dancer;
import metier.Person;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAcademy {

	protected Academy academyDauphine;
	protected Person studentDance1, studentDance2, studentTennis1, studentTennis2;
	protected ArrayList<Person> students = new ArrayList<Person>();
	
	@Before
	public void setUp() throws Exception {
		academyDauphine = new Academy(16, "AcademyDauphine", "France", "Paris");
		studentDance1 = new Person("Thomas", "Catton","academyDauphine", 24, "Tom", "Dance");
		studentTennis1 = new Person("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");
		studentTennis2 = new Person("Fabrice", "Pearson", "academyDauphine", 12, "Fab", "Tennis");
		studentDance2 = new Dancer("David", "Rudio", "academyDescartes", 28, "Dance", "Dav");
		students.add(studentTennis1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCodeAcademy() {
		assertEquals(16, academyDauphine.getCodeAcademy());
	}

	@Test
	public void testSetCodeAcademy() {
		academyDauphine.setCodeAcademy(2);
		assertEquals(2, academyDauphine.getCodeAcademy());
	}

	@Test
	public void testGetName() {
		assertEquals("AcademyDauphine", academyDauphine.getName());
	}

	@Test
	public void testSetName() {
		academyDauphine.setName("PhineDoAademy");
		assertEquals("PhineDoAademy", academyDauphine.getName());
	}

	@Test
	public void testGetCountry() {
		assertEquals("France", academyDauphine.getCountry());
	}

	@Test
	public void testSetCountry() {
		academyDauphine.setCountry("Canada");
		assertEquals("Canada", academyDauphine.getCountry());
	}

	@Test
	public void testGetCity() {
		assertEquals("Paris", academyDauphine.getCity());
	}

	@Test
	public void testSetCity() {
		academyDauphine.setCity("Montreal");
		assertEquals("Montreal", academyDauphine.getCity());
	}

	@Test
	public void testGetStudents() {
		assertEquals(0, academyDauphine.getStudents().size());
	}

	@Test
	public void testSetStudents() {
		students.add(studentDance1);
		academyDauphine.setStudents(students);
		assertFalse(academyDauphine.getStudents().size()==0);
		assertEquals(2, academyDauphine.getStudents().size());
	}

	@Test
	public void testAddStudent() {
		academyDauphine.AddStudent(studentDance2);
		academyDauphine.AddStudent(studentTennis2);
	}

}
