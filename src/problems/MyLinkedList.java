package problems;

import java.util.LinkedList;
import problems.Student;

public class MyLinkedList {
    public void studentsLinkedList() {
        Student student1 = new Student(1, "Imran");
        Student student2 = new Student(2, "Haider");
        LinkedList<Student> students = new LinkedList<>();

        students.add(student1);
        students.add(student2);
        Student last = students.getLast();
        System.out.println("Last Student is : "+ last.getName());
        for(Student s: students){
            System.out.println("Student id : "+s.getStudentId()+ " Name: "+ s.getName());
        }
    }
}
