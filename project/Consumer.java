package pro; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
public class Consumer {

	private String ID,passward;
	private int num;
	private ArrayList<DATA> book;
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	public String getPassward() {
		return passward;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setBook(ArrayList<DATA> book) {
		this.book = book;
	}
	
	public ArrayList<DATA> getBook() {
		return book;
	}

	public void display(){
		
		System.out.print("卡号："+this.ID+" 密码："+this.passward+" 借书数量："+this.num+"\n");
		
		int i=0;
		
		while(i<num){
			book.get(i).show();
			i++;
		}
	}
	
	public static ArrayList<Consumer> read() throws IOException, ParseException{
		File file = new File("user.txt");
		ArrayList<Consumer> consumers = new ArrayList<Consumer>();
		
		if(!file.exists()){									
			file.createNewFile();
			return consumers;
		}
		
		String line=null;
		Consumer consumer = null;
		ArrayList<DATA> records = null;
		DATA record = null;
		BufferedReader R = new BufferedReader(new FileReader(file));
		
		while((line = R.readLine())!=null){			
			
			consumer = new Consumer();
			records = new ArrayList<DATA>();
			
			consumer.setID(line);
			line = R.readLine();
			
			consumer.setPassward(line);
			line = R.readLine();
			
			consumer.setNum(Integer.parseInt(line));
			
			int i=0;
			for(;i<consumer.num;i++){							
				record = new DATA();
				line = R.readLine();
				record.setBook(line);
				line = R.readLine();
				record.setdayofborrow(DATA.formatter.parse(line));
				line = R.readLine();
				record.setdayofreturn(DATA.formatter.parse(line));
				line = R.readLine();
				record.setbooknumber(Integer.parseInt(line));
				records.add(record);
			}
			
			consumer.setBook(records);
			consumers.add(consumer);
		}
		R.close();
		return consumers;
	}

	public static void save(ArrayList<Consumer> consumers) throws IOException{
		File file = new File("user.txt");
		
		if(!file.exists()){									
			file.createNewFile();
		}
		
		BufferedWriter W = new BufferedWriter(new FileWriter(file));
		
		for(Consumer consumer: consumers){
			W.write(consumer.toString());
		}
		W.close();
	}
	
	public String toString() 
	{
		String s="";
		s+=this.ID+"\n"+this.passward+"\n"+this.num+"\r\n";
		
		int i=0;
		while(i<this.num){
			s+=book.get(i).toString();
			i++;
		}
		return s;
	}
}

