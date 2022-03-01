package com.comparator.comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {

	// empId based sorting
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEmpId() - o2.getEmpId();
	}



}
