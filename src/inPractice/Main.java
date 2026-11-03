package inPractice;


import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		

	 //CLASS OBJECTS
		
		
	      Student[] students=new Student[3];
	      
	     for(int i=0;i<students.length;i++) {
	    	 
	    	 Scanner scanner=new Scanner(System.in);
	    	 
	    	     students[i]=new Student();
	    	 	    	 
	    	 	    		 
	    		 
	             System.out.println("Enter Student Name");
	    		 students[i].name=scanner.nextLine();
	    		 System.out.println("Enter Mark 1");
	    		 students[i].mark1=scanner.nextInt();
	    		 System.out.println("Enter Mark 2");
	    		 students[i].mark2=scanner.nextInt();
	    		 System.out.println("Enter Mark 3");
	    		 students[i].mark3=scanner.nextInt();
	    		 
	    		 
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
	
	
	
