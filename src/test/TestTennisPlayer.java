package test;

import static org.junit.Assert.*;
import metier.Person;
import metier.TennisPlayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTennisPlayer {
	
	protected TennisPlayer tennisPlayer1, tennisPlayer2;

	@Before
	public void setUp() throws Exception {
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 24);

	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetPoints() {
		assertEquals(0, tennisPlayer1.getPoints());
	}

	@Test
	public void testSetPoints() {
		tennisPlayer1.setPoints(20);
		assertEquals(20, tennisPlayer1.getPoints());
	}

	@Test
	public void testWinOver() {
		int testpointswin2 = tennisPlayer2.WinOver(tennisPlayer1);
		assertEquals(testpointswin2, tennisPlayer2.getPoints());
		int testpointswin1 = tennisPlayer1.WinOver(tennisPlayer2);
		assertEquals(testpointswin1, tennisPlayer1.getPoints());

	}

}
