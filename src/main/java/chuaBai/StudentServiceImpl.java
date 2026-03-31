package chuaBai;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        if (findById(student.getId()) == null) {
            studentList.add(student);
        } else {
            System.out.printf("Loi: Ma sinh vien da ton tai");
        }
    }

    @Override
    public void updateStudent(String id, String name, String major, double gpa, int credits) {
        Student s = findById(id);
        if (s != null) {
            s.setFullName(name);
            s.setMajor(major);
            s.setGpa(gpa);
            s.setRegisteredCredits(credits);
        }
    }

    @Override
    public void displayAll() {
        studentList.forEach(System.out::println);
    }

    @Override
    public Student findById(String id) {
        return studentList.stream()
                .filter(s -> s.getId().equalsIgnoreCase(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Student> getExcellentStudents() {
        return studentList.stream()
                .filter(s -> s.getGpa() >= 3.5)
                .toList();
    }

    @Override
    public void sortByGpaDescending() {
        studentList.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }
}
