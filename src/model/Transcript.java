package model;

public class Transcript {

  public Transcript(String studentName, int studentId) {

  }

  // getters
  public String getStudentName() {
    return "Jane";
  }

  // getters
  public int getStudentId() {
    return 1000;
  }

  // setters
  public String setStudentName() {
    return "Jane";
  }

  // setters
  public int setStudentId() {
    return 1000;
  }


  // REQUIRES: grade in [0.0, 4.0] and course not null
  // MODIFIES: this
  // EFFECTS: Adds grade and course to a list
  public void addGrade(String course, double grade) {
  }

  // REQUIRES: course not null
  // EFFECTS: Return course name and grade in format CourseName - Grade
  public String getCourseAndGrade(String course) {
    return "ARTS-101: 3.0";
  }

  // EFFECTS: Displays course names with grades earned
  // in format StudentName, StudentId: CourseName: Grade, CourseName: Grade
  public void printTranscript() {
    System.out.print("Jane, 7830: ARTS-101: 3.0, ENGL-201: 2.0");
  }

  // EFFECTS: Returns GPA
  public double getGPA() {
    return 0.0;
  }
}
