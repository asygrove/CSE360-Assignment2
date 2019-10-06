/**
 * Author: Alyssa Sygrove
 * Class #: 70642
 * ASU ID: 1212579574
 * Assignment: 2
 * 
 * This file does basic arithmetic operations on numbers to find the total 
 * and return a string of the operations.The majority of the methods 
 * are purposefully left blank.
 */
package cse360assign2;
/**
 * Contains methods that perform basic arithmetic, finds the total, 
 * and displays the string of operations.
 */
public class AddingMachine {
	
	private int total;
	private String history;
	
	/**
	 * Initiates the total as 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total as an integer.
	 * @return The total from performing operations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the total and the history.
	 * @param Value is the number to be added to the total.
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total.
	 * Adds operation into history string.
	 * @param Value is the number to be subtracted from the total.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Returns a string of the operations done.
	 * @return A string that shows operations done.
	 */
	public String toString () {
		return history;
		}
	
	/**
	 * Clears the total value and the history.
	 */
	public void clear() {
		total = 0;
		history = "";
		
	}
}