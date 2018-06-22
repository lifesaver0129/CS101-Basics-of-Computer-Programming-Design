package secondhalf;
//import java.util.Arrays;
public class class10 
{
	/*public static void main(String[] args) 
	{
		int value=1;
		int []array={1,2,3,4,5};
		System.out.println(value);
		for(int i=0;i<5;i++)
		{System.out.println(array[i]);}
	}
	public static void change_value(int value){
		value=0;
		System.out.println(value);
	}
	public static void change_array(int []array){
		for(int i=0;i<5;i++)
		{System.out.println(array[i]);}
	}*/
	
	//Main函数中定义一个double型的数组score表示成绩
	//调用函数 change，并将数组score作为参数传递进来，在函数中创建一个新数组newArray，在不改变原数组的条件下，做如下修改：
	//元素：如果>100,让其=100, 如果<0,让其=0，其他不变
	//返回这个数组到main函数中，并输出
	/*public static void main(String[] args) {
		double []score ={50,-10.5,120,34,46,78,130,46.8,79.5};
		double []newscore;
		newscore=change(score);
		for(int i=0;i<newscore.length;i++){
			System.out.print(newscore[i]+"  ");}
		}	
		public static double[] change(double[] scoreArray){
			double []newArray = new double[scoreArray.length];
			for(int i=0;i<scoreArray.length;i++){
				if(scoreArray[i]>100){
					newArray[i]=100;}
				else if(scoreArray[i]<0){
					newArray[i]=0;
				}
				else{
					newArray[i]=scoreArray[i];
				}
			}
			return newArray;
		}*/
	
	/*{
		int [][] b = {{1},{2,3},{4,5,6}};
	    System.out.println(b);
	    System.out.println(b[0]);
	    System.out.println(b[1]);
	    System.out.println(b[2]);
	    System.out.println(b[1][1]);
	    for(int i=0;i<b.length;i++)
	    {
	        for(int j=0;j<b[i].length;j++)
	        {
	    	System.out.print(b[i][j]+" ");
	        }
	        System.out.println(); }*/
	
	/*{
		int [][] b = {{1,1,1,1},{1,2,2,2},{1,4,7,8},{1,5,11,15}};
		for(int i=0;i<b.length;i++)
	    {
	        for(int j=0;j<b[i].length;j++)
	        {
	    	System.out.print(b[i][j]+" ");
	        }
	        System.out.println(); }
	}*/
	
	/*{
	     int a[]={3,2,4,6,1,0,8};
	     Arrays.sort(a);
	     for(int temp:a)
	     System.out.print(temp); 
	}*/
	
	/*{
	     int a[]={3,2,4,6,1,0,8};
	     Arrays.fill(a, 5);
	     for(int temp:a)
	      System.out.print(temp); 
	}*/
	
	/*{
			 int a[]={3,2,4,6,1,0,8};
		     int b[]=new int[5];
		     int c[]=new int[a.length];
		     System.arraycopy(a,2,b,0,5);
		     System.out.println(Arrays.toString(b));
		     
		     System.arraycopy(a,0,c,0,a.length);
		     System.out.println(Arrays.toString(c));
		     
		     System.out.println(Arrays.equals(a, b));
		     System.out.println(Arrays.equals(a, c));  
     }*/
}


	

