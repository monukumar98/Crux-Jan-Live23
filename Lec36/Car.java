package Lec36;

public class Car {
	private String color;
	private int price;
	private int speed;

	public Car(String color, int price, int speed) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.price = price;
		this.speed = speed;

	}

	public void SetColor(String color) {
		this.color = color;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	public String getColor() {
//		return this.color;
//	}
//
//	public int getPrice() {
//		return this.price;
//	}
//
//	public int getSpeed() {
//		return this.speed;
//	}

	public void Displaycar() {
		System.out.println("c " + this.color + " P " + this.price + " s " + this.speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) throws Exception{
//		if (price < 0) {
//
//			throw new Exception("Bklol price kabhi -ve nhi hota hai");
//		}
//		this.price = price;
//	}

	public void setPrice(int price) {
		
		try {
			if (price < 0) {

				throw new Exception("Bklol price kabhi -ve nhi hota hai");
			}
			this.price = price;
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("In catch ");
			e.printStackTrace();

		} 
		 
		finally {
			System.out.println("i am in finaly");
		}

	}

	public int getSpeed() {

		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("Bklol Speed -ve nhi hoga");
			return;
		}
		this.speed = speed;
	}

}
