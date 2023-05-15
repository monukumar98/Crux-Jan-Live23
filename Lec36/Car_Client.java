package Lec36;
//import java.lang.*;

public class Car_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car c = new Car("Black", 1929, 25);
		Car c1 = new Car("Red", 19029, 23);

		c.Displaycar();
		c1.Displaycar();
		c.setColor("Green");
		c.setPrice(-1000);
		c.Displaycar();
		System.out.println("hey");
//		System.out.println(c.getColor());
//		System.out.println(c1.getPrice());
//		System.out.println(c.getSpeed());

	}

}
