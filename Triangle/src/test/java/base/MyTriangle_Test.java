package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class myTriangle_Test extends Triangle {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
@Test
public void testPerimeter() {
Triangle instance = new Triangle(sideOne, sideTwo, sideThree);{
	sideOne = 2;
	sideTwo= 2;
	sideThree= 2;};;
double bExpectedresult = 6;
double bActualResult= instance.Perimeter;
assertEquals("testPerimeter() failed", bExpectedresult,bActualResult);
}
@Test
public void testArea() {
Triangle instance = new Triangle(sideOne, sideTwo, sideThree);{
	sideOne = 2;
	sideTwo= 2;
	sideThree= 2;};;
double bExpectedresult = Math.sqrt(3);
double bActualResult= instance.Area;
assertEquals("testArea() failed", bExpectedresult,bActualResult);}}