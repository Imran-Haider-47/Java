package problems;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    Student student1 = new Student(1,"Ali");
    Student student2 = new Student(2, "Leo");

    Map<Integer, String> students = new HashMap<>();
    public void myHashMapFn(){
        students.put(student1.getStudentId(),student1.getName());
        students.put(student2.getStudentId(), student2.getName());
        students.put(2,"Lion");
        // Iteration
        System.out.println("Iterating through Student Scores:");
        for(Map.Entry<Integer, String> entry: students.entrySet()){
            Integer id = entry.getKey();
            String name = entry.getValue();
            System.out.println(id+" : "+ name);
        }

    }
}
