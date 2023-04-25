package Lec30;


public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (word.charAt(0) == maze[i][j]) {
					boolean ans = WordSearch(maze, i, j, word, 0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}
				}

			}
		}
		System.out.println(false);
	}

	public static boolean WordSearch(char[][] maze, int cr, int cc, String word, int idx) {
		if (idx == word.length()) {
			return true;
		}
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || word.charAt(idx) != maze[cr][cc]) {
			return false;
		}
		// blocked
		maze[cr][cc] = '*';
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		for (int i = 0; i < c.length; i++) {
			boolean ans = WordSearch(maze, cr + r[i], cc + c[i], word, idx + 1);
			if (ans) {
				return true;
			}
		}
		// undo
		maze[cr][cc] = word.charAt(idx);
		return false;

	}

}
