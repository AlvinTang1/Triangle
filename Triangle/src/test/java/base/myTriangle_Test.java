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
Triangle instance = new Triangle();{
	setSideOne(2);
	setSideTwo(2);
	setSideThree(2);};;
double bExpectedresult = 6;
double bActualResult= instance.getPerimeter();
assertEquals("testPerimeter() failed", bExpectedresult,bActualResult);
}
@Test
public void testArea() {
Triangle instance = new Triangle();{
	setSideOne(2);
	setSideTwo(2);
	setSideThree(2);};;
double bExpectedresult = Math.sqrt(3);
double bActualResult= instance.getArea();
assertEquals("testArea() failed", bExpectedresult,bActualResult);}
@Test
public void testToString() {
Triangle instance = new Triangle();{
	setSideOne(2);
	setSideTwo(2);
	setSideThree(2);};;
String bExpectedresult = "The area of the triangle is" + this.getArea() +
"The perimeter of the triangle is" +this.getPerimeter();
String bActualResult= instance.toString();
assertEquals("testToString() failed", bExpectedresult,bActualResult);
}}