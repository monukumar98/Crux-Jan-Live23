package Lec1;

public class INC_DEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		a++;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
//		a++;// a=a+1;// Post Inc
//		++a;// a=a+1;//Pre Inc
//		
		int b = 7;
		b--;// b = b-1;//Post Dec
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
//		--b;// b = b-1;//Pre Dec
		a = 9;
		b = 8;
		int c = a++ - b++ - b-- + a++ + 8 + a++ - b++;
		System.out.println(c);

		int x = 11;
		System.out.println(++x);
		System.out.println(x);

		a = 6;
		b = 5;
		c = a++ + ++a - --b + ++b - b--;
		System.out.println(c);

	}

}
