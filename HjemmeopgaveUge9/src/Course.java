public class Course {
    private Student[] students;
    private String courseName;
    private int maxParticipants;
    private int courseYear;
    private int currentParticipants;

    public Course(String courseName, int maxParticipants, int courseYear) {
        this.courseName = courseName;
        this.maxParticipants = maxParticipants;
        this.courseYear = courseYear;
        this.students = new Student[maxParticipants]; // Her opretter jeg et array til studerende
        this.currentParticipants = 0;
    }

    public void addStudent(Student student) {
        if (currentParticipants < maxParticipants) {
            students[currentParticipants] = student; // Her gives studerende en plads i arrayet
            currentParticipants++; // Sådan her øges antallet af tilmeldte studerende
            System.out.println(student.getName() + " er blevet tilføjet til kurset.");
        } else {
            System.out.println("Kurset er fuldt.");
        }
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < currentParticipants; i++) {
        if (students[i].getStudentId() == studentId) {
        for (int j = i; j < currentParticipants - 1; j++) {
            students[j] = students[j + 1]; // HEr flytter de resterende studerende en plads op
        }
        students[currentParticipants - 1] = null; //Her bliver den sidste pladas til null
        currentParticipants--;
        System.out.println("Studerende med ID " + studentId + " er blevet fjernet fra kurset.");
        return;
        }
        }
        System.out.println("Studerende med ID " + studentId + " blev ikke fundet.");
    }

    public void showStudentList() {
        System.out.println("Studerende på " + courseName + " kurset:");
        for (int i = 0; i < currentParticipants; i++) {
        System.out.println(students[i].toString()); // Her viser studerendes oplysninger
        }
    }
}
