package javass;

public class static_and_nonstatic {
	//global variables-used across all function-conditions
	  String name;//NON STATIC GLOBAL variable
	  static int age;//static global variable
	 // static functions can only access static stuff
	public static void main(String[] args) {
       sum();
     //  sendmail();
       age=100;
      // name="shanmugam";
	}
	
	public static void sum() {//static function
		int x=100;
		
	}
	
	public void sendmail() {// non static
		
		int y=-300;
		sum();
	       sendmail();
	       age=100;
	       name="shanmugam";
		
	}

	
}
