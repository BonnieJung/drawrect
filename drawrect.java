/**
 * Program Name : Drawrect.java
 * Purpose : to find a point consisting of a rectangle 
 * Coder : Bonnie Jung
 * Date : May 1, 2015
 */

import java.util.*;

public class Drawrect
{
  private static final int POINTS = 3;
  private static final int MIN_NUM = 1;
  private static final int MAX_NUM = 1000;
  private static int x, y;
	//array for the answer
	static int [][] answers = new int [2][];
  
	public static void main(String[] args)
	{
		//create a scanner object
		Scanner myInput = new Scanner(System.in);
		int rects; // number of rectangles
		rects = myInput.nextInt();
		int[][] x_y = new int[2][3];

		
		for(int i =0 ; i<rects; ++i)
		{
					for(int j = 0 ; j < POINTS ; ++j)
					{//a is a position of x, b is a position of y
						int a = myInput.nextInt();
						int b = myInput.nextInt();
						
						if(a>=MIN_NUM && a<=MAX_NUM)
							x_y[0][j] = a;
						if(b>=MIN_NUM && b<=MAX_NUM)
							x_y[1][j] = b;
					}
			getPoint(x_y);
			
				x=answers[0][i];
				y=answers[1][i];
		}//end of for loop
		//print the last position
		for(int i = 0; i<rects;++i)
			System.out.println(answers[0][i]+ " " + answers[1][i]);
	}//end of main

	
	/**
	 * Method Name: getPoint
	 * Purpose: get the last position
	 * Parameters: 2d array
	 * Returns: void
	 */
	private static void getPoint(int[][]x_y)
	{
		//1) x
		if(x_y[0][0] == x_y[0][1])
			x =x_y[0][2];
		else if(x_y[0][1] == x_y[0][2])
			x=x_y[0][0];
		else if(x_y[0][2] == x_y[0][0])
			x=x_y[0][1];
		
		//2) y
		if(x_y[1][0] == x_y[1][1])
			y=x_y[1][2];
		else if(x_y[1][1] == x_y[1][2])
			y=x_y[1][0];
		else if(x_y[1][2] == x_y[1][0])
			y=x_y[1][1];
	}
}//end of class

