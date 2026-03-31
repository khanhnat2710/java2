package chuaBai;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(String id, String name, String major, double gpa, int credits);
    void displayAll();
    Student findById(String id);
    List<Student> getExcellentStudents();
    void sortByGpaDescending();
}
