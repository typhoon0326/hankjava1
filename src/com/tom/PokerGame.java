package com.tom;

import java.util.Random;

public class PokerGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		char [] flowers = new char[4];
			flowers[0] = 0x2663;
			flowers[1] = 0x2666; 
			flowers[2] = 0x2665;
			flowers[3] = 0x2660;
		
		int[] nums = new int[52];
		
		System.out.println(flowers.length);
		System.out.println(nums.length);
		for(int i=0; i<nums.length; i++)
			{
				System.out.println(nums[i]);
			}
		
		System.out.println(nums[3]);
		System.out.println(flowers[2]);
		
		
		
		Random random = new Random();
		int color = random.nextInt(4);
		int num = random.nextInt(13)+1;
		
		System.out.print(num);
		switch(color)
		{
			case (0):
				System.out.println("S");
				break;
			case (1):
				System.out.println("H");
				break;
			case (2):
				System.out.println("D");
				break;
			case (3):
				System.out.println("C");
				break;
		}
		
		
	}

}
