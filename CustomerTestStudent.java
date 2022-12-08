/*Class: CMSC203Â 21754
 * Instructor: Prof Grinberg
 * Description: (this is a test for customer student.)
 * Due: 12/14/2022
 * Platform/compiler: Eclipse
* I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 Print your Name here: __Estifanos Kebebew________
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTestStudent {

	Customer C1,C2;
	@Before
	public void setUp() throws 
	Exception {
		 C1 = new Customer("NAME1", 10);
	 
	}

	@After
	public void tearDown() throws Exception {
		
		C1=null;
	}

	@Test
	public void testConstructor() {
		
		Customer c2  = new Customer(C1);
		
		assertFalse(C1 == c2);
		c2.setName("NAME2");
		c2.setAge(20);
		assertFalse(c2.getName().equals(C1.getName()));
		assertFalse(c2.getAge() == C1.getAge());
		 
	}

	 
		


}