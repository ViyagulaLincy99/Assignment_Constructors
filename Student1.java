//write a program to create a default constructor which displays the default values
public class Student1 {
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s1;//creating a reference variable s1
s1=new Student1();//allocating a memory to  s1
Student1 s2;//creating a reference variable s2
s2=new Student1();//allocating a memory to s2
s1.display();//calling the method of display
s2.display();
	}

}
