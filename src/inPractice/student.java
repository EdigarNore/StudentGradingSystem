package inPractice;

 class Student {
	 String name;
	   int mark1;
	   int mark2;
	   int mark3;
	   
//CONSTRUCTOR	   
Student(String name, int mark1, int mark2, int mark3){
		   this.name=name;
		   this.mark1=mark1;
		   this.mark2=mark2;
		   this.mark3=mark3;
	   }
	   
	   void introduction() {
		   
		   System.out.println("My name is " + name);
	   }
	   
	   int calculator() {
		   int total=mark1+mark2+mark3;
		   return total;
	   }
	   
	   double studentAverage( ) {
		   double average=calculator()/3.0;
		   return average;
	   }
	   
	   String studentGrade() {
		   double average=studentAverage();
		   String grade;
		   
		   if(average>=80) {
			   grade="A";
		   }else if(average>=70) {
			   grade="B";
		   }else if(average>=60) {
			   grade="C";
		   }else if(average>=50) {
			   grade="D";
		   }else {
			   grade="F";
		   }
		   
		   return grade;
	   }
	   
	   String studentStatus () {
		   double average= studentAverage();
		   final double PASS_MARK= 50.0;
		   String status;
		     if(average>=PASS_MARK){
		    	 status="Pass";
		     }else {
		    	 status="Fail";
		     }
		     
		   return status;
		   
		   
	   }
}
