package HackerRankSolutions;

import java.util.Scanner;

public class JumpingOnClouds {

//	Version - v1
//	static int jumpingOnCloudsV1(int[] c)
//	{
//		int len = c.length;
//		int count =-1;
//		
//		for(int i=0;i<len;)
//		{
//			if(i+2 < len && c[i+2] == 0)
//			{
//				i=i+2;
//			}
//			else 
//			{
//				i++;
//			}
//			count++;
//		}
//		return count;
//	}
	
//	version - V2
//	static int jumpingOnClouds(int[] c)
//	{
//		int len =  c.length;
//		int count = -1;
//		for(int i =0; i<len;)
//		{
//			if(i+2 < len && c[i +2] == 0)
//			{
//				i++;
//			}
//			i++;
//			count++;
//		}
//		return count++;
//	}
	
//	final
	static int jumpingOnClouds(int[] c)
	{
		int len = c.length;
		int count = 1;
		
		for(int i=0;i<len;i++, count++)
		{
			if(i+2<len && c[i+2] == 0)
			{
				i++;
			}
		}
		return count;
	}  
	
	
	public static void main(String[] args) {
		
	 
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[] = new int[n];
		for(int i = 0; i< n; i++)
		{
			c[i] = sc.nextInt();
		}
		System.out.println(jumpingOnClouds(c));
	}
}