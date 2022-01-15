//write a program to demonstrate the use of a parameterized constructor
public class Student2 {
	int id;//declaring a member variable of id
	String name;//declaring a member variable of name
	//creating a parameterized constructor
	Student2(int i,String n)
	{
		id=i;
		name=n;
		
	}
	void display()//creating a method which displays the values
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2 t1;//creating a reference variable t1
t1=new Student2(101,"linc");//allocating a memory to the reference variable and passing the values
t1.display();//calling the method
Student2 t2;//creating a reference variable t2
t2=new Student2(102,"nanc");//allocating a memory to the reference variable and passing the values
t2.display();
	}

}
