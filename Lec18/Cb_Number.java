package Lec18;

public class Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		int n=90;
		System.out.println(PrintSubString(s));

	}

	public static int PrintSubString(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i, j);
				// String ko int me
				// Integer.parseInt(s1); num wali string ko int me convert
				long n = Long.parseLong(s1);// i,j
				if (IsCbNumber(n) == true && Isvalid(visited, i, j) == true) {
					count++;
					// i to j-1 --> marked ye cb bana chuke hai
					for (int k = i; k < j; k++) {

						visited[k] = true;
					}
				}

			}

		}
		return count;

	}

	public static boolean Isvalid(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (; i < j; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean IsCbNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
