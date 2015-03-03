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
	
	@Before
	public void setUp() throws Exception {
		robottest = new Robot();
		tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis");
		tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 24);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRobotS() {
		Robot robottest2 = new Robot("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis", 3000);
		assertNotNull(robottest2);
	}

	@Test
	public void testRobot() {
		assertNotNull(robottest);
	}
	
	@Test
	public void testGetId() {
		assertEquals(1, robottest.getId());
	}
	

	@Test
	public void testSetId() {
		robottest.setId(2);
		assertEquals(2, robottest.getId());
	}


	@Test
	public void testGetInstance() {

		assertNotNull(robottest.getInstance());
			Robot robot2 = new Robot();
		assertEquals(robot2, robot2.getInstance());
	}
	
	@Test
	public void testSetInstance() {
		Robot robot2 = new Robot();
		robottest.setInstance(robot2);
		assertEquals(robot2, robottest.getInstance());
	}


	@Test
	public void testLoadPlayer() {
		robottest.loadPlayer(tennisPlayer1);
		assertNotNull(tennisPlayer1);
	}

	@Test
	public void testpresent() {
		assertEquals(1, robottest.getId());
	}
	

}
