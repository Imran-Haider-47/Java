package problems;

public class Student {
    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    private Integer studentId;
    private String name;
    private String email;
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
