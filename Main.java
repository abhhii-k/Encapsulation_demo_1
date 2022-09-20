package encapsulation_package;

public class Main {
	
	public static void main(String[] args) {
		
		Students s = new Students();		   //Object creation
		
		s.set_rno(101);						
		s.set_name("Abhishek K");			   //Set the data member using public setter function
		
		int s_rno = s.get_rno();
		String s_name = s.get_name();		    //get the data member using public getter function
		
		System.out.println("Name: "+s_name);
		System.out.println("Rno: "+s_rno);		//Printing the output
	}

}
