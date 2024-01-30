package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MyHashSet {

    Set<Student> students = new HashSet<>();
    Student student1 = new Student(1,"Imran");
    Student student2 = new Student(2, "Haider");
    Student student3 = new Student(1, "Imran");
    Student s4 =new Student(3,"Ali");
    public void uniqueStudents(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(Student s : students) {
            System.out.println(s.getStudentId() + " Name : " + s.getName());
        }
        Set<Student> student_greaterthat1= students.stream().filter(s->s.getStudentId()>1).collect(Collectors.toSet());
        for(Student s1: student_greaterthat1){
            System.out.println("Id:"+ s1.getStudentId());
        }
    }
}
