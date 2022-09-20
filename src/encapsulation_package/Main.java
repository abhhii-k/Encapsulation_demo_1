package encapsulation_package;

public class Main {
	
	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.set_rno(101);
		s.set_name("Abhishek K");
		
		int s_rno = s.get_rno();
		String s_name = s.get_name();
		
		System.out.println("Name: "+s_name);
		System.out.println("Rno: "+s_rno);
	}

}
