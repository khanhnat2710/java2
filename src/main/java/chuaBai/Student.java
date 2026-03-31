package chuaBai;

public class Student {
    private String id;
    private String fullName;
    private String major;
    private double gpa;
    private int registeredCredits;

    public Student(String id, String fullName, String major, double gpa, int registeredCredits) {
        this.id = id;
        this.fullName = fullName;
        this.major = major;
        this.gpa = gpa;
        this.registeredCredits = registeredCredits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getRegisteredCredits() {
        return registeredCredits;
    }

    public void setRegisteredCredits(int registeredCredits) {
        this.registeredCredits = registeredCredits;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-15s | %-5.2f | %-10d |",
                id, fullName, major, gpa, registeredCredits);
    }
}
