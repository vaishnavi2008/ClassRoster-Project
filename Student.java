
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
     private String fullName;
   private double[] grades;
   
   public Student()
   {
       fullName = " Lily Barge ";
       grades = new double[6];
       
       grades[0]= 3.0;
       grades[1]= 4.0;
       grades[2]= 3.2;
       grades[3]= 2.0;
       grades[4]= 1.5;
       grades[5]= 4.0;
   }
   
   public Student( String chosenfullName, double grade1, double grade2, double grade3, double grade4, double grade5, double grade6)
   {
       fullName = chosenfullName;
       grades = new double[6];
       grades[0] = grade1;
       grades[1] = grade2;
       grades[2] = grade3;
       grades[3] = grade4;
       grades[4] = grade5;
       grades[5] = grade6;
   }
   
   public void setGPA( double newGrade1, double newGrade2, double newGrade3,double newGrade4, double newGrade5, double newGrade6)
   {
       grades[0] = newGrade1;
       grades[1] = newGrade2;
       grades[2] = newGrade3;
       grades[3] = newGrade4;
       grades[4] = newGrade5;
       grades[5] = newGrade6;
   }
   
   
   public double calcGPA()
   {
      int i = 0;
      double sum = 0;
      while(i < grades.length)
       {
          sum = sum + grades[i];
          i++;
       }
       double ave = sum/grades.length;
       return ave;
        
    }
    
   public String getGrade()
   {
       String Grade;
       double aveGPA = this.calcGPA();
       if ( aveGPA >= 4.0)
       {
            Grade = "A";
       }
       else if ( aveGPA >= 3.0 )
       {
           Grade="B";
       }
       else if (aveGPA >= 2.0)
       {
            Grade="C";
       }
       else if ( aveGPA >= 1.0 )
       {
            Grade=  "D";
       }
       else 
       {
            Grade ="F";
       }
       return Grade;
    }
    
    public String getName()
    {
        return fullName;
    }
    
   public String toString()
   {
       String StudentInfo = "Name:" + fullName + "\nAverage GPA: " + this.calcGPA() + "\nThe grade is " + this.getGrade();
       return StudentInfo;
    }
}