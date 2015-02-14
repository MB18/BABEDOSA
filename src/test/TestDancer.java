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
		dancer = new Dancer("Thomas", "Catton", "Academy Dauphine", 24,"Dance", "Tom");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalutation() {
		salutations = "Hello";
		assertEquals(salutations, dancer.getSalutations());
	}

	@Test
	public void testWarmUp() {
		
		dancer = new Dancer("Thomas","Catton","Academy Dauphine",24,"Dance","TC Dynamic","Jive",1500,"Greeeeeetings !", "Seeeeeeeee Ya!");
		timeOfWarmUp = dancer.getTimeOfwarmUp();
		long timeBefore = new Date().getTime();
		dancer.WarmUp();
		long timeAfter = new Date().getTime();
		System.out.println(timeBefore +" " + timeAfter);
		assertTrue((timeAfter - timeBefore) >= timeOfWarmUp);
		
		
	}

	@Test
	public void testMsgtoLeave() {
		msgToLeave = "Thank you !";
		assertEquals(msgToLeave, dancer.getMsgToLeave());

	}

	@Test 
	 //test us 7 
	 public void testProceedings() { 
		 // a modifier la US ou le code : temps echuffement ou temps de chor» ? 
		 salutations = "Hello";
		 timeOfWarmUp = 1000;
		 msgToLeave = "Thank you !";
		 assertEquals(salutations, dancer.getSalutations());
		 assertEquals(ready, dancer.isReady());
		 assertEquals(msgToLeave, dancer.getMsgToLeave());
			
	 }	
}
