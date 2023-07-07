package Lec53;


public class Cars implements Comparable<Cars> {
	int speed;
	int price;
	String color;

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "P " + this.price + " S " + this.speed + " C " + this.color;
	}

	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		return o.price - this.price;
		// return this.speed - o.speed;
		// return this.color.compareTo(o.color);
	}

}
