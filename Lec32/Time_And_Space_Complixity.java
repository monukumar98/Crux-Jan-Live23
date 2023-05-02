package Lec32;

public class Time_And_Space_Complixity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start= System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//             
//		}
//		long end= System.currentTimeMillis();
//		System.out.println(end-start);

//		System.out.println("Hey");
//		System.out.println("Hey");
//		System.out.println("Hey");
//		System.out.println("Hey");
//		System.out.println("Hey");
		int n = 176781671;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}
		int k = 3;
		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N/K)
			i += k;
		}

		while (i <= n) {
			System.out.println("Hey");
			// log(N) base k
			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
			// o(N/k)
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}

		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// sqrt(N)
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (k = 1; k <= n; k++) {
              //O(N^3)
				}
			}
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for ( k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					
					//O(N^4)
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
			}
		}
		
		        // bubble
				// Selection
				// instersion

	}

}
