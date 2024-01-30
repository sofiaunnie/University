package university;

import java.util.List;

public class  Student extends Person implements GradingSystem {
    int studentID;
    List <Course> courses;
    public void calculateGrade() {}
    public void updateTranscript() {}
    public Student(int studentID, int age, String name, 
                        String address, String phoneNumber, List <Course> courses) {
        this.studentID = studentID;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.courses = courses;
    }

    @Override
    public String toString() {
        // return "Student Information: \nID: " + studentID + ", address: " + address;
        return String.format("Student Information: \nID: %d, name: %s, phone number: %s, age: %d, courses: %s", 
            studentID, name, phoneNumber, age, courses);
    }
}
