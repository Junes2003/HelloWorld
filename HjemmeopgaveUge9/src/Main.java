public class Main {
    public static void main(String[] args) {
        Student studerende1 = new Student("Jens", 101, 22);
        Student studerende2 = new Student("Mette", 102, 23);
        Student studerende3 = new Student("Lars", 103, 24);

        // Max 2 studerende
        Course kursus1 = new Course("Intro til Java", 2, 2025);
        // Max 3 studerende
        Course kursus2 = new Course("Grundlæggende Python", 3, 2025);

        // Sådan her bliver studerende til kurset tilføjet
        kursus1.addStudent(studerende1); //Jens
        kursus1.addStudent(studerende2); //Mette
        //Har lavet en ekstra så jeg kan vise at der står kurset er fyldt
        kursus1.addStudent(studerende3);//Lars, men han kommer ikke ind

        kursus2.addStudent(studerende1);
        kursus2.addStudent(studerende2);
        kursus2.addStudent(studerende3);

        // Vis studerende på Java-kurset
        kursus1.showStudentList();

        // Sådan her fjerner jeg en studerende fra Python-kurset
        kursus2.removeStudent(102);

        // Sådam her bliver det vist til studerende at de er blevet fjernet
        kursus2.showStudentList();
    }
}

