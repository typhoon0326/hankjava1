package com.tom;
import java.util.Random;
public class Poker 
{
	
    public Poker()
    {
    		
    	 int[] Poker =  new int[52];
    		for(int i = 0; i<52; i++)
    		{
    			Poker[i] = i;

    				System.out.print((i%13+1) + " ");
    				if(i%13 == 12)
    				{
    					System.out.println(" ");
    				}
    		}
    		
    		
    		
    }

	

}
