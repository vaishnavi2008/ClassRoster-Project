
/**
 * Write a description of class ClassRostersDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassRostersDriver
{
    public static void main ( String[] args)
    {
        
        Student student1 = new Student("Bob Ross", 3.0, 3.0, 3.0, 4.0, 2.0, 5.0);
        Student student2 = new Student("John Cena", 4.0, 4.0, 4.0, 4.0, 4.0, 4.0);
        Student student3 = new Student("Abraham Lincoln", 5.0, 5.0, 5.0, 5.0, 5.0, 5.0);
        Student student4 = new Student("Donald Trump", 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
        Student student5 = new Student("Hillary Clinton", 3.0, 3.0, 3.0, 3.0, 2.5, 3.0);
        
        ClassRosters class1 = new ClassRosters();
        ClassRosters class2 = new ClassRosters( student1, student2, student3, student4, student5 );
        
        System.out.println(class1 + "\n\n" + class2);
        
        String max1 = class1.findStudentWithMaxGPA();
        String max2 = class2.findStudentWithMaxGPA();
        
        System.out.println(max1 + "\n" + max2);
    }
}