package pro;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {

	private static ArrayList<Consumer> consumers ;
	private static ArrayList<Library> books ;
	private static Scanner scan = new Scanner(System.in);
	//主菜单
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		consumers = Consumer.read();
		books = Library.read();
		while(true){
			System.out.println("图书管理系统（Books Management System）");
			System.out.println("1.管理员登录（Administrator Login）");
			System.out.println("2.用户登录（Consumer Login）");
			System.out.println("3.退出（Exit）");
			System.out.print("输入选项（Input Options）:");
			String choose = scan.nextLine();
			switch(choose){
			case "1":Manage();break;
			case "2":Consumer();break;
			case "3":Consumer.save(consumers);Library.save(books);System.exit(0);
			}
		}
	}
	
	//管理员操作
	public static void Manage() throws ParseException{
		String id,password;
		System.out.println("账号（ID）:");
		id = scan.nextLine();
		System.out.println("密码（Password）:");
		password = scan.nextLine();
		if(!(id.equals("admin")&&password.equals("123456"))){
			System.out.println("用户名和密码错误！（Wrong！）");
			return ;
		}
		while(true){
			System.out.println("1.读者信息管理（Readers information management）");
			System.out.println("2.图书信息管理（Library Information Management）");
			System.out.println("3.借书还书操作（Borrow and Return）");
			System.out.println("4.设置逾期时间（Set the Overdue time ）");
			System.out.println("5.返回上一层（Turn back）");
			System.out.print("输入选项（Input Options）:");
			String choose = scan.nextLine();
			switch(choose){
			case "1":consumerManage();break;
			case "2":bookManage();break;
			case "3":operation();break;
			case "4":setDate();break;
			case "5":return;
			}
		}
	}
	
	public static void setDate() {
		// TODO Auto-generated method stub
		System.out.println("输入要设置的时间（以天为单位）（Enter to set the time (in days)）:");
		DATA.EndDate = Integer.parseInt(scan.nextLine());
		System.out.println("修改成功（OK！）");
	}

	//借书还书操作
	public static void operation() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("1.借书（Borrow）");
			System.out.println("2.还书（Return）");
			System.out.println("3.逾期处理（Late processing）");
			System.out.println("4.续借（Renew）");
			System.out.println("5.返回上一层（Get Back）");
			System.out.print("输入选项（Input Options）:");
			String choose = scan.nextLine();
			switch(choose){
			case "1":borrow();break;
			case "2":back();break;
			case "3":dispose();break;
			case "4":renew();break;
			case "5":return;
			}
		}
		
	}

	//还书操作
	public static void back() {
		// TODO Auto-generated method stub
		System.out.println("卡号：（ID Number：）");
		String id  = scan.nextLine();
		int index=-1;
		int indexDATA=-1;
		int bookIndex = -1;
		for(int i=0;i<consumers.size();i++){					//判断是否存在改卡号
			if(consumers.get(i).getID().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("卡号不存在！（Card number does not exist！）");
			return;
		}
		System.out.println("书名：（Title：）");
		String name = scan.nextLine();
		for(int i=0;i<books.size();i++)
			if(name.equals(books.get(i).getbookname())){
				bookIndex = i;
				break;
			}
		long b =1000;
		Date date = new Date();
		for(int i=0;i<consumers.get(index).getBook().size();i++){	//判断是否存在该借书记录
			if(consumers.get(index).getBook().get(i).getBook().equals(name)&&consumers.get(index).getBook().get(i).getdayofreturn().getTime()==0){
				indexDATA = i;
			}
		}
			if(indexDATA==-1){
				System.out.println("没有这条借书记录！（Without this article borrow books record ！）");
				return;
			}
			date.setTime(date.getTime()-DATA.EndDate*b*60*60*24);
			
			if(date.compareTo(consumers.get(index).getBook().get(indexDATA).getdayofborrow())>0){
				System.out.println("逾期。不可以自主还书！请前往逾期处理！"
						+ "（Within the time limit. Return the book can not be independent! Please go to late processing!）"	);
				return;
			}
			consumers.get(index).getBook().get(indexDATA).setdayofreturn(new Date());
			books.get(bookIndex).setstate("在馆（At the Library）");
			System.out.println("成功还书！（Return the book successfully!）");
		
	}

	//逾期处理
	public static void dispose() {
		// TODO Auto-generated method stub
		System.out.println("卡号：（Card Number:）");
		String id  = scan.nextLine();
		int index=-1;
		int indexDATA=-1;
		int bookIndex = -1;
		for(int i=0;i<consumers.size();i++){
			if(consumers.get(i).getID().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("卡号不存在！（Card number does not exist!）");
			return;
		}
		System.out.println("书名：（Title:）");
		String name = scan.nextLine();
		for(int i=0;i<books.size();i++)
			if(name.equals(books.get(i).getbookname())){
				bookIndex = i;
				break;
			}
		Date date = new Date();
		for(int i=0;i<consumers.get(index).getBook().size();i++){
			if(consumers.get(index).getBook().get(i).getBook().equals(name)&&consumers.get(index).getBook().get(i).getdayofreturn().getTime()==0){
				indexDATA = i;
			}
		}
			if(indexDATA==-1){
				System.out.println("没有这条借书记录！（Without this article borrow books record!）");
				return;
			}
			long b =1000;
			date.setTime(date.getTime()-DATA.EndDate*b*60*60*24);
			if(consumers.get(index).getBook().get(indexDATA).getdayofreturn().getTime()!=0){
				System.out.println("书本已经归还！（The book has returned!）");
				return;
			}
			if(!(date.compareTo(consumers.get(index).getBook().get(indexDATA).getdayofborrow())>0)){
				System.out.println("书本未逾期！（The book did not exceed the time limit!）");
				return;
			}
			long day = (date.getTime()-consumers.get(index).getBook().get(indexDATA).getdayofborrow().getTime())/(b*60*60*24);
			System.out.println("逾期"+day+"天。罚款"+day+"元!请缴纳罚款！"
					+ "Overdue"+day+"days.Fine"+day+"yuan! Please pay the fines!");
			books.get(bookIndex).setstate("在馆");
			consumers.get(index).getBook().get(indexDATA).setdayofreturn(new Date());
			System.out.println("成功还书！（Return the book successfully!）");
		
	}

	//续借处理
	public static void renew() {
		// TODO Auto-generated method stub
		System.out.println("卡号：（ID Number：）");
		String id  = scan.nextLine();
		int index=-1;
		int indexDATA=-1;
		for(int i=0;i<consumers.size();i++){
			if(consumers.get(i).getID().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("卡号不存在！（Card number does not exist!）");
			return;
		}
		System.out.println("书名：（Title：）");
		String name = scan.nextLine();
		long b =1000;
		Date date = new Date();
		for(int i=0;i<consumers.get(index).getBook().size();i++){
			if(consumers.get(index).getBook().get(i).getBook().equals(name)&&consumers.get(index).getBook().get(i).getdayofreturn().getTime()==0){
				indexDATA = i;
			}
		}
			if(indexDATA==-1){
				System.out.println("没有这条借书记录！");
				return;
			}
			date.setTime(date.getTime()-DATA.EndDate*b*60*60*24);
			if(date.compareTo(consumers.get(index).getBook().get(indexDATA).getdayofborrow())>0){
				System.out.println("逾期。不可以续借！请前往逾期处理！"
						+ "（Without this article borrow books record!）");
				return;
			}
			if(consumers.get(index).getBook().get(indexDATA).getbooknumber()!=0){
				System.out.println("已经续借过！不可在续借（Have been renew!  Can not do it again!）");
			}
			consumers.get(index).getBook().get(indexDATA).setbooknumber(1);
			consumers.get(index).getBook().get(indexDATA).setdayofborrow(new Date());
			System.out.println("成功续借！（Renew successfully!）");
		
	}

	//借书
	public static void borrow() {
		// TODO Auto-generated method stub
		System.out.println("卡号：（ID Number：）");
		String id  = scan.nextLine();
		int index=-1;
		int indexbook=-1;
		for(int i=0;i<consumers.size();i++){
			if(consumers.get(i).getID().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("卡号不存在！（Card number does not exist!）");
			return;
		}
		System.out.println("书名：（Title：）");
		String name = scan.nextLine();
		for(int i=0;i<books.size();i++){
			if(books.get(i).getbookname().equals(name)
					&&books.get(i).getstate().equals("在馆")){
				indexbook = i;
				break;
			}
		}
		if(indexbook==-1){
			System.out.println("已经被借了！（Has been borrowed!）");
			return;
		}
		books.get(indexbook).setstate("借出（Lend out）");
		DATA DATA = new DATA();
		DATA.setBook(name);
		DATA.setbooknumber(0);
		consumers.get(index).setNum(consumers.get(index).getNum()+1);
		consumers.get(index).getBook().add(DATA);
		System.out.println("成功借出！（Lend out successfully!）");
	}

	public static void consumerdisplay() {
		// TODO Auto-generated method stub
		System.out.println("所有读者信息:（All readers information:）");
		for(Consumer Consumer:consumers){
			Consumer.display();
		}
	}

	//录入新读者
	public static void consumerInput() {
		// TODO Auto-generated method stub
		Consumer Consumer = new Consumer();
		String id;
		int index = -1;
		while(true){
			System.out.println("卡号:（ID Number：）");
			id = scan.nextLine();
			for(Consumer u:consumers){
				if(u.getID().equals(id)){
					System.out.println("卡号存在！错误！（Card number! Error!）");
					index = 1;
					return;
				}
			}
			if(index==-1)
				break;
		}
		Consumer.setID(id);
		System.out.println("密码:（Password：）");
		Consumer.setPassward(scan.nextLine());
		Consumer.setNum(0);
		Consumer.setBook(new ArrayList<DATA>());
		consumers.add(Consumer);
	}

	//图书信息管理
	public static void bookManage() throws ParseException {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("1.录入新图书（1. The entry of new books）");
			System.out.println("2.编辑图书（Edit books）");
			System.out.println("3.查看所有图书（3. To see all the books）");
			System.out.println("4.返回上一层（4. Return）");
			System.out.print("输入选项:（Input Options：）");
			String choose = scan.nextLine();
			switch(choose){
			case "1":bookInput();break;
			case "2":bookEdit();break;
			case "3":bookdisplay();break;
			case "4":return;
			}
		}
	}

	//查看所有读书信息 
	public static void bookdisplay() {
		// TODO Auto-generated method stub
		System.out.println("所有图书信息:（All book information:）");
		for(Library book:books){
			book.display();
		}
	}

	//书本编辑
	public static void bookEdit() throws ParseException {
		// TODO Auto-generated method stub
		String name;
		Library  book = new Library();
		int index=-1;
		System.out.println("输入书名:（Input the title）");
		name = scan.nextLine();
		for(int i=0;i<books.size();i++){
			if(books.get(i).getbookname().equals(name)){
				index=i;
				break;
			}
		}
		if(index==-1){
			System.out.println("书不存在！（The book does not exist!）");
			return;
		}
		System.out.println("编号（Number）");
		book.setbooknumber(scan.nextLine());
		System.out.println("书名(Title)");
		book.setbookname(scan.nextLine());
		System.out.println("单价（Unit Price）");
		book.setbookprice(Integer.parseInt(scan.nextLine()));
		System.out.println("入馆时间(yyyy-MM-dd HH:mm:ss)");
		book.settimeofputin(scan.nextLine());
		System.out.println("书架编号（Shelf number）");
		book.setbookshelfnumber(scan.nextLine());
		System.out.println("图书状态(在馆/借出)（State of books (in/out)）");
		book.setstate(scan.nextLine());
		books.set(index, book);
		System.out.println("修改完成！（ Modify Complete！）");
	}

	public static void bookInput() {
		// TODO Auto-generated method stub
		String name;
		Library  book = new Library();
		int index=-1;
		System.out.println("输入书名:（Enter the title：）");
		name = scan.nextLine();
		for(int i=0;i<books.size();i++){
			if(books.get(i).getbookname().equals(name)){
				index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println("书存在！（The book exists!）");
			return;
		}
		book.setbookname(name);
		System.out.println("编号（Number）");
		book.setbooknumber(scan.nextLine());
		System.out.println("单价（Unit Price）");
		book.setbookprice(Integer.parseInt(scan.nextLine()));
		books.add(book);
		System.out.println("添加完成！（Add Successfully!）");
	}

	//读者信息管理
	public static void consumerManage() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("1.录入新读者（1. Input new readers）");
			System.out.println("2.查看读者信息（2. View the reader information）");
			System.out.println("3.返回上一层（3.Turn back）");
			System.out.print("输入选项:（ Input Options：）");
			String choose = scan.nextLine();
			switch(choose){
			case "1":consumerInput();break;
			case "2":consumerdisplay();break;
			case "3":return;
			}
		}
		
	}

	//普通用户操作
	public static void Consumer(){
		String id,password;
		System.out.println("账号:（ID Number：）");
		id = scan.nextLine();
		System.out.println("密码:（Password：）");
		password = scan.nextLine();
		Consumer Consumer=null;
		for(Consumer u:consumers){
			if((u.getID().equals(id)&&u.getPassward().equals(password))){
				Consumer = u;
				break;
			}
		}
		if(Consumer==null){
			System.out.println("账号或密码错误！（Account or password error!）");
			return;
		}
		while(true){
			System.out.println("1.查询（1.Search for）");
			System.out.println("2.查看读者信息（2. View the reader information）");
			System.out.println("3.返回上一层（3.Turn Back）");
			System.out.print("输入选项:（Input Options：）");
			String choose = scan.nextLine();
			switch(choose){
			case "1":find();break;
			case "2":display(Consumer);break;
			case "3":return;
			}
		}
	}
	
	public static void display(Consumer Consumer) {
		// TODO Auto-generated method stub
		Consumer.display();
	}

	public static void find() {
		// TODO Auto-generated method stub
		System.out.println("书名：");
		String name = scan.nextLine();
		for(Library  book:books){
			if(book.getbookname().equals(name)){
				book.display();
				break;
			}
		}
	}

}
