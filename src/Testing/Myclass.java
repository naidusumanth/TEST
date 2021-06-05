package Testing;

import Test.Age;
import Test.Myclass;

interface Age
{
	int x = 21;
	void getAge();
}


public class Myclass implements Age
{
@Override
public void getAge()
{
	System.out.print("Implementing an Abstract method using Anonymous Class object");
	System.out.print("Age is "+x);
}


public static void main(String[] args)
{
Myclass obj=new Myclass();
System.out.print("This is an Anonymous Class");
obj.getAge();	

}
}


