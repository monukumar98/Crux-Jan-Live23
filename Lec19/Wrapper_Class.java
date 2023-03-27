package Lec19;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;
//		Long l1 = 89l;
//		long l2 = 67;
//		int b = 89;
//		Integer b1 = 145;
//		b1 = b;
//		Float f = 18.9f;
//		Double d = 6.8;
//		Byte b6 = 7;
//		Short s = 10;
//		Boolean b12=true;
//		Character ch ='a';

		int b = 78;
		Integer b1 = 89;

		a1 = a;// Auto Boxing
		b = b1;// unBoxing
		System.out.println(b1);

		Integer c1 = 15;
		Integer c2 = 15;
		Integer c4 = 157;
		Integer c5 = 157;
		System.out.println(c1 == c2);
		System.out.println(c4 == c5);
		System.out.println(c4.equals(c5));

	}

}
