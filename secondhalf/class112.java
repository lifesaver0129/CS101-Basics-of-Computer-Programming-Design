package secondhalf;

import java.util.ArrayList;

public class class112 
{public static void main(String[] args) {
	// 创建存放Student类的对象的动态数组
	ArrayList<Student> students = new ArrayList<Student>();
	// 创建3个Studnet类的对象
	Student stu1 = new Student("Liming", "Male", 90);
	Student stu2 = new Student("Zhangsan", "Male", 50);
	Student stu3 = new Student("Hanlin", "Female", 85);
	// 将3个对象添加到students中
	students.add(stu1);
	students.add(stu2);
	students.add(stu3);
	// 输出所有成员的姓名
	for (int i = 0; i < students.size(); i++) {
		System.out.println(students.get(i).getName());
	}
	//及格同学的姓名
	for (int i = 0; i < students.size(); i++) {
		if(students.get(i).getScore()>60){
		System.out.println(students.get(i).getName());
		}
	}
	//平均分
	double sum=0;
	for (int i = 0; i < students.size(); i++) {
		sum+=students.get(i).getScore();
	}
	System.out.println("average="+sum/students.size());
}

}


