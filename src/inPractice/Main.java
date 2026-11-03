package inPractice;


import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		

	 //CLASS OBJECTS
		
		
	      Student[] students=new Student[3];
	      
	      //Scanner object to take input from user
	      Scanner scanner=new Scanner(System.in); 
	      
	      //for loop to take input from user and display the output
	     for(int i=0;i<students.length;i++) {
	    	 
	    	 
	    	 
	    	 //CREATING OBJECTS and Constructor in action
	    	    
	    	 
	    	 System.out.println("Enter Student Name");
	    	 String name=scanner.nextLine();
	    	 while(name.trim().isEmpty()) {
	    		 System.out.println("Field name can Not be Empty!!");
	    		 name=scanner.nextLine();	 
	    	 }
	    	 
	    	 
	    	 System.out.println("Enter Mark 1");
	    	 int mark1=scanner.nextInt();
	    	 while(mark1<0 || mark1>100) {
	    		 System.out.println("Invalid Mark. Please enter a mark between 0 and 100.");
	    		 mark1=scanner.nextInt();
	    	 }
	    	
	    	 
	    	 System.out.println("Enter Mark 2");
	    	 int mark2=scanner.nextInt();
	    	 while(mark2<0 || mark2>100) {
	    		 System.out.println("Invalid Mark. Please enter a mark between 0 and 100.");
	    		 mark2=scanner.nextInt();
	    	 }
	    	
	    	 
	    	 System.out.println("Enter Mark 3");
	    	 int mark3=scanner.nextInt();
	    	 while(mark3<0 || mark3>100) {
	    		 System.out.println("Invalid Mark. Please enter a mark between 0 and 100.");
	    		 mark3=scanner.nextInt();
	    	 }
	    	 
	    	
	    	 
	    	 scanner.nextLine(); // Consume the newline character after reading integers
	    	
	    	 students[i]=new Student( name, mark1, mark2, mark3);
	    	 	    	 
	    	 	    		 
	    		 
	           /*  System.out.println("Enter Student Name");
	    		 students[i].name=scanner.nextLine();
	    		 
	    		 System.out.println("Enter Mark 1");
	    		 students[i].mark1=scanner.nextInt();
	    		 
	    		 System.out.println("Enter Mark 2");
	    		 students[i].mark2=scanner.nextInt();
	    		 
	    		 System.out.println("Enter Mark 3");
	    		 students[i].mark3=scanner.nextInt();
	    		 
	    		 */
	    		 
	    		 System.out.println("Student  " + students[i].name);
	    		 System.out.println("Mark 1: " + students[i].mark1);
	    		 System.out.println("Mark 2: " + students[i].mark2);
	    		 System.out.println("Mark 3: " + students[i].mark3);
	    		 System.out.println("Total: " + students[i].calculator());
	    		 System.out.println("Average: "+ students[i].studentAverage());
	    	     System.out.println("Grade: " + students[i].studentGrade());
	    		 System.out.println("Status: " + students[i].studentStatus());
	    		 System.out.println("---------------------------------------"); 
	    	 
	    	 
	     }
	     
	  
 
}
	
}
	
	
	
