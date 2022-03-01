package com.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExample {

	public static void main(String[] args) {

		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp("Ram", "5462315487", 16));
		emps.add(new Emp("Shyam", "1245655423", 10));
		emps.add(new Emp("Mohan", "2356451256", 12));
		System.out.println(emps);
		
		/*	Comparing using COMPARABLEe: We need Emp class to implement the Comparable.
			Only one logic can be implemented using Comparator (for e.g., we have used empId to sort in this example)
		*/
		Collections.sort(emps);
		System.out.println(emps);
		
		/*	Comparing using COMPARATOR: We need to make separate class and implements comparator each time for sorting based on any field.
			We can sort based on any field provided that we need to create separate comparator classes.
			For e.g., We have created 2 classes namely, IdComparator() & NameComparator()
		*/
		// 1. empId based sorting
		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		
		// 2. name based sorting
		Collections.sort(emps, new NameComparator());
		System.out.println(emps);
		
	}
	
	/*CONCLUSION: In COMPMARABLE, the original class has to be modified (implements comparable) while in COMPARATOR, no need to modify original class.
	 
	 1. Comparable provides a single sorting sequence WHILE Comparator provides multiple sorting sequences.
	 2. Comparable affects the original class; the actual class is modified WHILE Comparator doesn't affect the original class; the actual class is not modified.
	 3. Comparable provides compareTo() method to sort elements. Comparator provides compare() method to sort elements.
	 4. Comparable is present in java.lang package. Comparator is present in the java.util package.
	 5. Sort the list by Collections.sort(List) method WHILE in Comparator, sort the list by Collections.sort(List, Comparator) method.
	 
	 */

}
