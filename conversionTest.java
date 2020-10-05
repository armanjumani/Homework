import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class conversionTest 
{

	private conversion testConversion;
	private String testInput;
	
	@Before
	/*
	 * Method that initializes the accuracy and test input for all conversion methods
	 * Observability:
	 * Controllability:
	 */
	public void init() 
	{
		testConversion = new conversion();
		//the only test input necessary as we are testing if the conversion method works
		testInput = 100 + "";
		testConversion.setRoundingPlace = 1;
	}
	
	
	@Test
	/*
	 * Method that test the Fahrenheit to Celcius program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testF2C()
	{
		float actualResult = testConversion.convertF2C(testInput);
		float expectedResult = (float)37.8;
		
		assertTrue("Problem with Farenheit to Celcius Conversion",expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Celcius to Fahrenheit program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testC2F() 
	{
		float actualResult = testConversion.convertC2F(testInput);
		float expectedResult = (float)212;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Inches to Centimeters program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testIn2Cm() 
	{
		float actualResult = testConversion.convertIn2Cm(testInput);
		float expectedResult = (float)254;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Centimeters to Inches program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testCm2In() 
	{
		float actualResult = testConversion.convertCm2In(testInput);
		float expectedResult = (float)39.4;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Feet to Meters program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testF2M() 
	{
		float actualResult = testConversion.convertF2M(testInput);
		float expectedResult = (float)30.5;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Meters to Feet program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testM2F() 
	{
		float actualResult = testConversion.convertM2F(testInput);
		float expectedResult = (float)328.1;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Miles to Kilometers program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testM2K() 
	{
		float actualResult = testConversion.convertM2K(testInput);
		float expectedResult = (float)160.9;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Kilometers to Miles program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testK2M() 
	{
		float actualResult = testConversion.convertK2M(testInput);
		float expectedResult = (float)62.1;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Gallons to Liters program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testG2L() 
	{
		float actualResult = testConversion.convertG2L(testInput);
		float expectedResult = (float)378.5;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Liters to Gallons program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testL2G() 
	{
		float actualResult = testConversion.convertL2G(testInput);
		float expectedResult = (float)26.4;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Ounces to Grams program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testOz2G() 
	{
		float actualResult = testConversion.convertOz2G(testInput);
		float expectedResult = (float)2835;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Grams to Ounces program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testG2Oz() 
	{
		float actualResult = testConversion.convertG2Oz(testInput);
		float expectedResult = (float)3.5;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Pounds to Kilograms program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testLb2K() 
	{
		float actualResult = testConversion.convertLb2K(testInput);
		float expectedResult = (float)45.4;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Kilograms to Pounds program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testK2Lb() 
	{
		float actualResult = testConversion.convertK2Lb(testInput);
		float expectedResult = (float)220.5;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Hours and Minutes program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testHr2Min() 
	{
		float actualResult = testConversion.convertHr2Min(testInput);
		float expectedResult = (float)6000;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Minutes to Hours program
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testMin2Hr() 
	{
		float actualResult = testConversion.convertMin2Hr(testInput);
		float expectedResult = (float)1.7;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Inches to Centimeters program
	 * Observability: Tests for specific outputs by using an array of expected output
	 * Controllability: Tester can just change the expected result array and testInput in the method
	 * if they want to make a different input and output range
	 */
	public void testAccuracy() 
	{
		//New Test Input to get accuracy
		testInput = 24.8745 + "";
		
		//New Expected Outputs for the accuracy
		float[] expectedOutput = {(float)-4, (float) -4,(float) -3.96,(float) -3.959,(float) -3.9586};
		
		boolean allAccuracyWorks = true;
		float actualResult;
		for(int x = 0; x < 5; x++) 
		{
			testConversion.setRoundingPlace = x;
			actualResult = testConversion.convertF2C(testInput);
			if(actualResult != expectedOutput[x]) 
			{
				allAccuracyWorks = false;
			}
			
		}
		assertTrue("Problem with rounding for accuracy",allAccuracyWorks);
	}
	
	@Test
	/*
	 * Method that test the miles per hour to kilometers per hour function
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testMph2Kph() 
	{
		float actualResult = testConversion.convertMph2Kph(testInput);
		float expectedResult = (float)160.9;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the kilometers per hour to miles per hour function
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testKph2Mph() 
	{
		float actualResult = testConversion.convertKph2Mph(testInput);
		float expectedResult = (float)62.1;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Kelvin to Celsius function
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testK2C() 
	{
		float actualResult = testConversion.convertK2C(testInput);
		float expectedResult = (float)-173.1;
		
		assertTrue(expectedResult == actualResult);
	}
	
	@Test
	/*
	 * Method that test the Celsius to Kelvin function
	 * Observability: Tests for a specific output by inputting 100 for the conversion
	 * Controllability: Tester can just change the expected result and testInput in the init method
	 * if they want to make a different test.
	 */
	public void testC2K() 
	{
		float actualResult = testConversion.convertC2K(testInput);
		float expectedResult = (float)373.2;
		
		assertTrue(expectedResult == actualResult);
	}
}//end of conversionTest
