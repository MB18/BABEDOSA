package test;

import static org.junit.Assert.*;
import metier.Robot;
import metier.TennisPlayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRobot {

	protected TennisPlayer tennisPlayer1, tennisPlayer2;
	protected Robot robottest;
	Robot r = Robot.getInstance();
	Robot r2;
	
	@Before
	public void setUp() throws Exception {
		
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 24);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRobotS() {
		assertNotNull(r);
	}

	@Test
	public void testRobot() {
		assertNotNull(r);
		
	}
	
	@Test
	public void testGetId() {
		assertEquals(1, r.getId());
	}
	

	@Test
	public void testSetId() {
		r.setId(2);
		assertEquals(2, r.getId());
	}


	@Test
	public void testGetInstance() {

		assertNotNull(Robot.getInstance());
		//	Robot robot2 = new Robot();
		//assertEquals(robot2, robot2.getInstance());
	}
	
	@Test
	public void testSetInstance() {
		Robot robot2 = Robot.getInstance();
		r.setInstance(robot2);
		assertEquals(robot2, r.getInstance());
	}


	@Test
	public void testLoadPlayer() {
		r.loadPlayer(tennisPlayer1);
		assertNotNull(tennisPlayer1);
	}

	@Test
	public void testpresent() {
		assertEquals(2, r.getId());
	}
	

}
