/**
 * Author: Alyssa Sygrove
 * Class #: 70642
 * ASU ID: 1212579574
 * Assignment: 2
 * 
 * This file is used to test the file AddingMachine using multiple 
 * testing methods.
 */
package cse360assign2;

import org.junit.jupiter.api.Test;
/**
 * Contains the methods basictest, testTotal, testString, and testClear.
 */
public class AddingMachineTest {

	/**
	 * Tests the methods add, subtract, getTotal, toString, and clear.
	 */
	@Test
	public void basictest() 
	{
		System.out.println("");
		System.out.println("basictest");
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println("Total = " + myCalculator.getTotal());
		System.out.println("String: " + myCalculator.toString());
		myCalculator.clear();
		System.out.println("Total = " + myCalculator.getTotal());
		System.out.println("String: " + myCalculator.toString());
	}
	
	/**
	 * Tests if getTotal can be called multiple times.
	 */
	@Test
	public void testTotal()
	{
		System.out.println("");
		System.out.println("testTotal");
		AddingMachine myCalculator = new AddingMachine();
		System.out.println("Total = " + myCalculator.getTotal());
		myCalculator.add(4);
		System.out.println("Total = " + myCalculator.getTotal());
		myCalculator.subtract(6);
		System.out.println("Total = " + myCalculator.getTotal());
	}
	
	/**
	 * Tests if toString can be called multiple times.
	 */
	@Test
	public void testString()
	{
		System.out.println("");
		System.out.println("testString");
		AddingMachine myCalculator = new AddingMachine();
		System.out.println("String: " + myCalculator.toString());
		myCalculator.add(40);
		System.out.println("String: " + myCalculator.toString());
		myCalculator.add(2);
		System.out.println("String: " + myCalculator.toString());	
	}
	
	/**
	 * Tests if clear can be called multiple times.
	 */
	@Test
	public void testClear()
	{
		System.out.println("");
		System.out.println("testClear");
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		System.out.println("Total = " + myCalculator.getTotal());
		System.out.println("String: " + myCalculator.toString());
		myCalculator.clear();
		System.out.println("Total = " + myCalculator.getTotal());
		System.out.println("String: " + myCalculator.toString());
		myCalculator.clear();
		System.out.println("Total = " + myCalculator.getTotal());
		System.out.println("String: " + myCalculator.toString());
	}

}
