public class Student {
    private String name;
    private int studentId;
    private int age;

    public Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Navn: " + name + ", ID: " + studentId + ", Alder: " + age;
    }
}

