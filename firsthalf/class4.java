package firsthalf;

public class class4 {
	public int addReturn(int m, int n){
		int sum;
		sum = m + n;
		return sum;
	}
	public void addArgs(int m, int n){
		int sum;
		sum = m + n;
		System.out.print("a+b="+sum);
	}
	public void addNull(){
		int a, b; 
		a = 12;
		b = 13;
		int sum;
		sum = a + b;
		System.out.print("a+b="+sum);
	}
		public static void main(String args[]){
			class4 s=new class4();
			s.addNull();
			
			int a=12, b=13,u;
			s.addArgs(a,b);
			
			u=s.addReturn(a, b);
			System.out.print("a+b="+u);
		}
	}
