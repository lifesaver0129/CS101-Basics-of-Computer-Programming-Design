package secondhalf;

public class class082 {
	/*public Day day;
	public enum day
	{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
	public enum mood
	{happy,sad,soso}
	*/
		int a=1;
        public void funa()
        {
		int a=5;
		System.out.println(a);
		funb();
		func();
		funb();
		func();
		System.out.println(a);
        }
        private void funb()
        {
		    int a=10;
			System.out.println(a);
			a++;
			System.out.println(a);
         }
		private void func(){
			System.out.println(a);
			a++;
			System.out.println(a);
}
public static void main(String[] args) {
			class082 tt=new class082();
			tt.funa();
		}
}
