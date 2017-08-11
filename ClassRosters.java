
/**
 * Write a description of class ClassRosters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassRosters
{
   private Student[] student; 
   
  public ClassRosters()
   {
       student = new Student[5];
       student[0] = new Student();
       student[1] = new Student();
       student[2] = new Student();
       student[3] = new Student();
       student[4] = new Student();
  }
   
   public ClassRosters( Student  student1, Student  student2, Student  student3, Student  student4, Student  student5)
  {
    student = new Student[5];
    student[0] = student1;
    student[1] = student2;
    student[2] = student3;
    student[3] = student4;
    student[4] = student5;
  }
  
     public String findStudentWithMaxGPA()
  {
        double[] temp = new double[student.length];
        for(int i = 0; i < student.length; i++)
        {
            temp[i] = student[i].calcGPA();
        }
        
        double max = temp[0];
        int k = 0;
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i] > max)
            {
                max = temp[i];
                k = i;
            }
        }
        
        String maxStudent = student[k].getName();
        return "The student with the most GPA is: " + maxStudent;
  }
    
    public String toString()
  {
        String studentInfo = "The names and grades of the students are: \n";
        for(int i = 0; i < student.length; i++)
        {
            studentInfo += student[i].toString() + "\n";
        }
        return studentInfo;
  }
}
