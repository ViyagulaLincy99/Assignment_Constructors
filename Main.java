//write a program to create a constructor
public class Main {
	String name;
	int i;
	String lang;
	//creating a no-argument constructor
	Main()
	{
		i=5;
		System.out.println("Constructor called");
		name="programiz";
	}
	//creating a parameterized constructor
	
	Main(String m2)
	{
		lang=m2;
		System.out.println(lang+" "+"programming languages");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main m1;//creating a reference variable m1
m1=new Main();//allocating memory to the reference variable m1
System.out.println(m1.name);//printing the member variable
System.out.println(m1.i);
Main m3;
m3=new Main("java");

	}

}
