package inPractice;


import java.util.Scanner;
public class Main {
	
	//Method to get valid mark input from user/mark validation
	static int getValidMark(Scanner scanner) {
		int mark; 
		
  	  while(true) {
  		  
  		  
  		  if(scanner.hasNextInt()) {
  			  mark=scanner.nextInt();
  			  
  			  if(mark>=0 && mark<=100) {
  				  return mark;
  			  }else {
  				  System.out.println("Invalid Mark. Please enter a mark between 0 and 100.");
  			  }
  		  }else {
  			  System.out.println("Invalid input. Please enter an integer value for Mark 1.");
  			  scanner.next(); // Consume the invalid input
  		  }
  	  }
  	
		
		
		
	}
	
	
	public static void main(String[] args) {
		

	 //CLASS OBJECTS
		
		
	      Student[] students=new Student[3];
	      
	      //Scanner object to take input from user
	      Scanner scanner=new Scanner(System.in); 
	      
	      
	      
	      //for loop to take input from user and display the output
	     for(int i=0;i<students.length;i++) {
	    	 
	    	 
	    	 
	    	 //CREATING OBJECTS and Constructor in action
	    	    
	    	 //Name Validation
	    	 System.out.println("Enter Student Name");
	    	 String name=scanner.nextLine();
	    	// Consume the invalid input
	    	 while(name.trim().isEmpty()) {
	    		 System.out.println("Field name can Not be Empty!!");
	    		 name=scanner.nextLine();	 
	    	 }
	    	 
	    	 System.out.println("Enter Mark1");
	    	 int mark1 = getValidMark(scanner);
	    	 System.out.println("Enter Mark2");
	    	 int mark2 = getValidMark(scanner);
	    	 System.out.println("Enter Mark3");
	    	 int mark3 = getValidMark(scanner);
	    
	    	
	         
	    	 scanner.nextLine(); // Consume the newline character after reading integers
	    	
	    	 students[i]=new Student( name, mark1, mark2, mark3);
	    	 	    	 
	    	 	    		 
	    		 
	          
	    		 
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
	
	
	
