package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static char ch='x';
	static char[][]board= {
			{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '}
			};

	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe");
		Scanner sc=new Scanner(System.in);
		diaplayboard();
		while(true) {
			if(isdraw()) {
				System.out.println("its a draw ");
				break;
			}
		System.out.println("enter row number for "+ch);
		int row=sc.nextInt();
		System.out.println("enter col number for "+ch);
		int col=sc.nextInt();
		if(!isvalid(row,col)) {
			System.out.println("invalid row or col enter again ");
			continue;
		}
		if(board[row][col]!=' ') {
			System.out.println("posistion alredy filled try other posistion");
			continue;
		}
		board[row][col]=ch;
		diaplayboard();
		if(iswin(ch)) {
			System.out.println("you won !!");
			break;
		}
		
		if(ch=='x') {
			ch='o';
		}
		else {
			ch='x';
		}
	}

	}
	static boolean iswin(char ch) {
		for(int i=0;i<3;i++) {
			if(board[i][0]==ch && board[i][1]==ch && board[i][2]==ch) {
				return true;
			}
		}
		for(int i=0;i<3;i++) {
			if(board[0][i]==ch && board[1][i]==ch && board[2][i]==ch) {
				return true;
			}
		}
		if(board[0][0]==ch && board[1][1]==ch && board[2][2]==ch) {
			return true;
		}
		if(board[0][2]==ch && board[1][1]==ch && board[2][0]==ch) {
			return true;
		}
		return false;
	}
	
	static boolean isdraw() {
		for(char[]c1:board) {
			for(char c2:c1) {
				if(c2==' ') {
					return false;
				}
				
			}
		}
		return true;
	}
	static boolean isvalid(int row,int col) {
		if(row<0||row>2 || col<0 ||col>2) {
			return false;
		}
		else
			return true;
	}
	static void diaplayboard(){
		System.out.println("-------------");
		for(char[]c1:board) {
			for(char c2:c1) {
				System.out.print(c2+"|");
			}
			System.out.println();
			
		}
		System.out.println("--------------");
	}

}
