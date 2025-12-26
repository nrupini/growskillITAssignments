package assignments;

public class Program6_gradingSystem {

	public static void main(String[] args) {
	
	 int mark=40; 
	 char Grade1 = 'A';
	 char Grade2 ='B';
	 char Grade3 = 'C';
	 String Grade4 ="Fail";
     if(mark>=90) {
		 System.out.println("Grade:"+ Grade1);
	 }
	 else if(mark>=75) {
		 
		 System.out.println("Grade:"+ Grade2);
	 }
	 else if(mark>=50) {
		 System.out.println("Grade:"+ Grade3);
	 }
	 else{
		 System.out.println(Grade4);
	 }
	}

}
