package application;

import java.util.Scanner;

import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMath chessMath = new ChessMath();
		UI.printBoard(chessMath.getPieces());
		
		sc.close();

	}
}