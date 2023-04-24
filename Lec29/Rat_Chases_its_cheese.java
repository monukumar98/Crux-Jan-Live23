package Lec29;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);

			}

		}
		int[][] ans = new int[n][m];
		Ratinmaze(maze, 0, 0, ans);
		if (flag == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean flag = false;

	public static void Ratinmaze(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			display(ans);
			flag = true;
			return;

		}
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { 0, 0, -1, 1 };
		int[] c = { -1, 1, 0, 0 };
		for (int i = 0; i < c.length; i++) {
			Ratinmaze(maze, cr + r[i], cc + c[i], ans);
		}
//		Ratinmaze(maze, cr, cc - 1, ans);// left
//		Ratinmaze(maze, cr, cc + 1, ans);// right
//		Ratinmaze(maze, cr - 1, cc, ans);// up
//		Ratinmaze(maze, cr + 1, cc, ans);// down
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
