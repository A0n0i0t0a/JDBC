//package FileSystem;
import java.io.SerializeDemo;
public class Employee implements java.io.Serializable 
{
		// TODO Auto-generated method stub
		public String name;
		public String address;
		public transient int SSN;
		public int number;
		
		public void mailCheck()
		{
			System.out.println("Mailing a check to  "+ name + " " + address);
		}

}
	



