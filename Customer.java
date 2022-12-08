/*Class: CMSC203Â 21754
 * Instructor: Prof Grinberg
 * Description: (this is public customer class.)
 * Due: 12/14/2022
 * Platform/compiler: Eclipse
* I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 Print your Name here: __Estifanos Kebebew________
*/

public class Customer
{
	private String name;
	private int age;
	
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer obj)
	{
		this.name = obj.name;
		this.age = obj.age;
	}
	
	public String toString()
	{
		String str = "Name: " + getName();
		str += "\nAge: " + getAge();
		return str;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
}