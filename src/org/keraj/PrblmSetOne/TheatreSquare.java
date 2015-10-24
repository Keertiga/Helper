package org.keraj.PrblmSetOne;


import java.util.Scanner;

public class TheatreSquare {
	
	public static void main(String[] args){
		int n,m,a,numTiles;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		a=scan.nextInt();
		numTiles=n*m/a*a;
		if(numTiles!=0)
			numTiles+=1;
		scan.close();
		System.out.println(numTiles);
			
			
		
	}

}
