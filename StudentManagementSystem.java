import java.util.*;

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int age, String studentId, String course) {
        Student student = new Student(name, age, studentId, course);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayDetails();
                System.out.println("----------------------------");
            }
        }
    }

    public void findStudent(String studentId) {
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void deleteStudent(String studentId) {
        Iterator<Student> iterator = students.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId().equals(studentId)) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " has been removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void updateStudent(String studentId, String newName, int newAge, String newCourse) {
        boolean updated = false;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setName(newName);
                student.setAge(newAge);
                student.setCourse(newCourse);
                System.out.println("Student with ID " + studentId + " has been updated.");
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}
