package secondhalf;

import java.util.Scanner;
//import java.util.Random;

public class class09 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		/*int [ ] a = {6, 19, 44, 42, 10};
		int [ ] b = new int[5];
		b[0]=6;b[1]=19;b[2]=44;b[3]=42;b[4]=10;*/
		
		/*Random randomNumbers = new Random();
		final int ARRAY_LENGTH = 3;
		float[] array = new float[ARRAY_LENGTH];
		array[0]=0 + 2*randomNumbers.nextFloat();
		array[1]=2 + 2*randomNumbers.nextFloat();
		array[2]=4 + 2*randomNumbers.nextFloat();
		for(int i=0;1<3;i++)
		{System.out.println(array[i]);}
		for(float temp:array)
		{System.out.println(temp)};*/
		
		/*int array1[]={2,3,6};
		int array2[]=array1;
		System.out.println(array1+" "+array2+" "+array1[0]+" "+array2[0] );*/
		
		/*final int LENGTH = 10;
		int[] array = new int[LENGTH];
		for(int i=0; i<LENGTH; i++)
		{array[i] = i+1;}
		int total = 0;
		for(int element : array)
		{total += element;}
		System.out.printf("Total of array elements:%d\n", total);*/
		
		/*double[] scoreArray = new double[10];
		for(int i=0; i<10; i++)
		{
		  System.out.printf("Please input score %d:",i+1);
		  scoreArray[i] = input.nextDouble();
		}
		double max = scoreArray[0];
		double min = scoreArray[0];
		double sum = 0;
		for(double score:scoreArray)
		{
		  sum += score;
		  if(max < score)
		  {max = score;}
		  if(min > score)
		  {min = score;}
		}
		  System.out.printf("Average score is %.2f",(sum-max-min) / 8);*/
		
		/*int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}; 
		int k=0;
		for(int i=0;i<oldArr.length-1;i++)
		{
			if (oldArr[i]==0)
			{
				k++;
			}
		}
		int n=oldArr.length-k;
		int newArr[]=new int[n];
	    n=0;
		for(int i=0;i<=oldArr.length-1;i++)
		{
			if (oldArr[i]!=0)
			{
				newArr[n]=oldArr[i];
				n++;
			}
		}
		for(int temp:newArr)
		{
			System.out.print(temp+"  ");
		}*/
		
		/*int a[]={35,64,18,22,51,7};  
	    int temp=0;  
	    for(int i=0;i<a.length-1;i++)
	    {  
	        for(int j=0;j<a.length-1-i;j++)
	        {  
	        if(a[j]>a[j+1])
	          {  
	            temp=a[j];  
	            a[j]=a[j+1];  
	            a[j+1]=temp;  
	          }  
	        }  
	        System.out.printf("The %d loop ",i+1);
	        for(int i1=0;i1<a.length;i1++)  
	        	System.out.print(a[i1]+" ");
                System.out.println();
	    } */
	   input.close();
	}
}
