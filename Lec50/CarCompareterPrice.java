package Lec50;

import java.util.Comparator;

import Lec50.Cars;

public class CarCompareterPrice implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o2.price - o1.price;
	}

}
