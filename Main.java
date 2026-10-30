package inPractice;


import java.util.Scanner;
public class Main {
	
	//WELCOME Method/Function
	 static void welcome(String name) {
		 System.out.println("Welcome " + name+ " to my Grading system");
	 }
	 //Calculation Method
	 static int marksCalculation(int mark1,int mark2,int mark3) {
		 return mark1 + mark2 + mark3;
	 }
	 //output
	 
	 static void output(int total,double average,String grade,String qualification) {
		 System.out.println("Your Total is :" + total);
		 System.out.println("Your Average is :" + average);
		 System.out.println("Your grade is :" + grade);
		 System.out.println("Your status is :" + qualification);
		
	 }
	 
	 //Average
	 static int average(int total) {
		 return total/3;
	 }
	 
	//Grade
	 static String gradeCalculator(double average) {
      String grade;
		 
				 if(average>=80) {
				    	grade="A";
				       }else if(average>=70){
				    	   grade="B";
				    	   
				       }else if(average>=60) {
				    	   grade="C";
				       }else if(average>=50) {
				    	   grade="D";
				       }else {
				    	   grade="E";
				       }
		return grade;
	 }
//Scanner
	 
	static int scannerInput(int times) {
		
		Scanner scanner= new Scanner(System.in) ;
		System.out.println("How many Student do you want to add ?:");
		times= scanner.nextInt();
		return times;
	}
	
	//Status Pass/Fail
	static String statusPoint(double average ) {
	    String status;
	    final int passMark=50;
	      if(average>=passMark) {
	    	  status="PASS";
	      }else {
	    	  status="FAIL";
	      }
	return status;
	}
//MAIN METHOD
	public static void main(String[] args) {
		
//Arrays
	/*	int loop=scannerInput(0);
		String[] persons= new String[loop];
		
		 
	     int count=0;
	       
	        while(count!=loop)	{
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter Your name");
	     String name= scanner.nextLine();
	     System.out.println("Enter Mark 1");
	     int mark1= scanner.nextInt();
	     System.out.println("Enter Mark 2");
	     int mark2= scanner.nextInt();
	     System.out.println("Enter Mark 3");
	     int mark3= scanner.nextInt();
	     persons [count]= name;
	    System.out.println("") ;
	    System.out.println("---------------------------------------");
		welcome(name);
        int total=marksCalculation(mark1,mark2,mark3);
        double average=average(total);  
        String grade=gradeCalculator(average);
        String qualification=statusPoint(average);
       // String person=scanner.nextLine();
        output(total,average,grade,qualification);
        System.out.println("---------------------------------------");
        System.out.println("");
      	System.out.println(persons[count]);
	    count++;
	} 
	        System.out.println("");
	 System.out.println("-----STUDENT------");
	int i=0;
	 while(i<count) {
		 System.out.println(persons[i]);
		 i++;
	 }
*/;	 
	 //CLASS OBJECTS
	 
	 Student[] students=new Student[3];
	     for(int i=0;i<students.length;i++) {
	    	 students[i]=new Student();
	    	 	    	 
	    	 	    		 
	    		 students[i]= new Student();
	    		 Scanner scanner=new Scanner(System.in);
	    		 System.out.println("Enter Student Name");
	    		 students[i].name=scanner.nextLine();
	    		 System.out.println("Enter Mark 1");
	    		 students[i].mark1=scanner.nextInt();
	    		 System.out.println("Enter Mark 2");
	    		 students[i].mark2=scanner.nextInt();
	    		 System.out.println("Enter Mark 3");
	    		 students[i].mark3=scanner.nextInt();
	    		 
	    		 System.out.println("Students" + students[i].name);
	    		 System.out.println("Mark 1: " + students[i].mark1);
	    		System.out.println("Mark 2: " + students[i].mark2);
	    		 System.out.println("Mark 3: " + students[i].mark3);
	    		 System.out.println("Total: " + students[i].calculator());
	    		// System.out.println("Average: " + students[j].average());
	    		 System.out.println("Grade: " + students[i].studentGrade());
	    		 System.out.println("Status: " + students[i].studentStatus());
	    		 System.out.println("---------------------------------------"); 
	    	 }
	    	 
	     }
	     // Student edgar= new Student();
	    /* students[0].name="Edgar Nore";    //edgar.name="Edgar Nore;
	     students[0].mark1=56;            //edgar.mark1=56;
	     students[0].mark2=67;           //edgar.mark2=67;
	     students[0].mark3=78;          //edgar.mark1=78;
	     
	     
	    // Student brian= new Student();
	     students[1].name="Brian Jane";    //brian.name="Brian Jane";
	     students[1].mark1=89;            //brian.mark1=89;
	     students[1].mark2=76;           //brian.mark1=76;
	     students[1].mark3=78;          //brian.mark1=78;
	     
	     
	 String edigargrade=students[0].studentGrade();
	 System.out.println("Edgar Grade is " + edigargrade);
	 
	 String brianGrade=students[1].studentGrade();
	 System.out.println("Brian Grade is " + brianGrade);
	 
	 
/*  Student edgar= new Student();
  edgar.name="Edgar Nore";
  edgar.mark1=56;
  edgar.mark2=67;
  edgar.mark3=78;
  
  Student brian= new Student();
  brian.name="Brian Jane";
  brian.mark1=56;
  brian.mark2=67;
  brian.mark3=78;
  
  brian.introduction();
  edgar.introduction();
  
  Student[] students=new Student[2];s
  students[1]=new Student();
  students[0]=brian;
  students[1].name="Nick";
  
  
  
  
  
  int brianTotal=brian.calculator();
  System.out.println("Brian Total is " + brianTotal);
 String brianGrade=brian.studentGrade();
 System.out.println("Brian Grade is " + brianGrade);
 String brianStatus =brian.studentStatus ();
 System.out.println("Your status is: " + brianStatus);
 
  int edgarTotal=edgar.calculator();
  System.out.println("Edgar Total is " + edgarTotal);
  String edgarGrade=edgar.studentGrade();
  System.out.println("Edgar Grade is " + edgarGrade);
  String edigarStatus=edgar.studentStatus ();
  System.out.println("Your status is: " + edigarStatus); */
}
	
	
	
