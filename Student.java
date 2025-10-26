 
package student; 
public class Student {  
    private int studentId;
    private String studentName;
    private String grade;
    public Student() {  
        this(1136, "Hasmun", "A");
    } 
    public Student(int studentId, String studentName, String grade) {      
        this.studentId = studentId;         
        this.studentName = studentName;        
        this.grade = grade;
    } 
    public static void main(String[] args) { 
        Student student1 = new Student(); 
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 Grade: " + student1.grade); 
        Student student2 = new Student(1130, "Hasi", "A+");
       
        System.out.println("Student2 ID: " + student2.studentId);
        System.out.println("Student2 Name: " + student2.studentName);
        System.out.println("Student2 Grade: " + student2.grade);
    }
}