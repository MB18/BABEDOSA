package test;

import static org.junit.Assert.*;

import java.util.Date;

import metier.Dancer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDancer {

	protected Dancer dancer;
	protected String msgToLeave;
	protected String salutations;
	protected boolean ready;
	protected int timeOfWarmUp;

	@Before
	public void setUp() throws Exception {
		dancer = new Dancer("Thomas", "Catton", "Academy Dauphine", 24,
				"Dance", "Tom");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTypeDance() {
		assertEquals(null, dancer.getTypeDance());
	}

	@Test
	public void testSetTypeDance() {
		dancer.setTypeDance("Hip Hop");
		assertEquals("Hip Hop", dancer.getTypeDance());
	}

	@Test
	public void testGetTimeOfwarmUp() {
		assertEquals(1000, dancer.getTimeOfwarmUp());
	}

	@Test
	public void testSetTimeOfwarmUp() {
		dancer.setTimeOfwarmUp(2000);
		assertEquals(2000, dancer.getTimeOfwarmUp());
	}

	@Test
	public void testGetSalutations() {
		assertEquals("Hello", dancer.getSalutations());
	}

	@Test
	public void testSetSalutations() {
		dancer.setSalutations("Bonjour les amis");
		assertEquals("Bonjour les amis", dancer.getSalutations());
	}

	@Test
	public void testGetMsgToLeave() {
		assertEquals("Thank you !", dancer.getMsgToLeave());
	}

	@Test
	public void testSetMsgToLeave() {
		dancer.setMsgToLeave("Aurevoir les amis");
		assertEquals("Aurevoir les amis", dancer.getMsgToLeave());
	}

	@Test
	public void testIsReady() {
		assertFalse(dancer.isReady());
		assertEquals(false, dancer.isReady());
	}

	@Test
	public void testSetReady() {
		dancer.setReady(true);
		assertEquals(true, dancer.isReady());
	}

	@Test
	public void testProceedings() {
		// a modifier la US ou le code : temps echuffement ou temps de chor� ?
		salutations = "Hello";
		timeOfWarmUp = 1000;
		msgToLeave = "Thank you !";
		assertEquals(salutations, dancer.getSalutations());
		assertEquals(ready, dancer.isReady());
		assertEquals(msgToLeave, dancer.getMsgToLeave());
	}

	@Test
	public void testSalutation() {
		salutations = "Hello";
		assertEquals(salutations, dancer.getSalutations());
	}

	@Test
	public void testWarmUp() {
		dancer = new Dancer("Thomas", "Catton", "Academy Dauphine", 24,
				"Dance", "TC Dynamic", "Jive", 1500, "Greeeeeetings !",
				"Seeeeeeeee Ya!");
		timeOfWarmUp = dancer.getTimeOfwarmUp();
		long timeBefore = new Date().getTime();
		dancer.WarmUp();
		long timeAfter = new Date().getTime();
		System.out.println(timeBefore + " " + timeAfter);
		assertTrue((timeAfter - timeBefore) >= timeOfWarmUp);
	}

	@Test
	public void testMsgtoLeave() {
		msgToLeave = "Thank you !";
		assertEquals(msgToLeave, dancer.getMsgToLeave());
	}
	
	@Test
	public void testCheckWarmUpTime(){
		assertEquals(true, dancer.CheckWarmUpTime());
		dancer.setTimeOfwarmUp(1);
		assertEquals(false, dancer.CheckWarmUpTime());
	}


}
