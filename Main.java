package encap;
public class Main {
    public static void main(String[] args) {
        
        Student student = new Student();

       
        student.setName("John Doe");
        student.setAge(20);
        student.setGpa(3.5);

       
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGpaStatus());
        System.out.println("GPA Status: " + student.getGpaStatus());

        
        student.setGpa(5.0);

        System.out.println("Updated GPA: " + student.getGpaStatus());
        System.out.println("Updated GPA Status: " + student.getGpaStatus());
    }
}