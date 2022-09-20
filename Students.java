package encapsulation_package;

/*Encapsulation is the process grouping Data members and member functions
 * in single entity called Class for protecting the data members*/

public class Students {
	
	private int rno;			//private variables
	private String name;			//cannot access the outside of class
	
	
	
	public void set_rno(int rno) {
		this.rno = rno;
	}
	public int get_rno() {
		return this.rno;
	}
											//Public getter and setter method for private data members
											//Validation can be done
											//Flexible that is we make data only read or write
	public void set_name(String name) {
		this.name = name;
	}
	public String get_name() {
		return this.name;
	}

}
