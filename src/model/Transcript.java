package model;

import java.util.ArrayList;
import java.util.List;

/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */
public class Transcript {
  private String studentName;
  private int studentId;
  private List<String> courses;
  private List<Double> grades;

  public Transcript(String studentName, int studentId) {
    this.studentName = studentName;
    this.studentId = studentId;
    courses = new ArrayList<>();
    grades = new ArrayList<>();
  }

  // getters
  public String getStudentName() {
    return this.studentName;
  }

  // getters
  public int getStudentId() {
    return this.studentId;
  }

  // setters
  public String setStudentName(String studentName) {
    this.studentName = studentName;
    return this.studentName;
  }

  // setters
  public int setStudentId(int studentId) {
    this.studentId = studentId;
    return this.studentId;
  }

  // REQUIRES: grade in [0.0, 4.0] and course not null
  // MODIFIES: this
  // EFFECTS: Adds grade and course to a list
  public void addGrade(String course, double grade) {
    if (courses.contains(course)) {
      int courseIndex = courses.indexOf(course);
      grades.set(courseIndex, grade);
    } else {
      this.courses.add(course);
      this.grades.add(grade);
    }
  }

  // REQUIRES: course not null
  // EFFECTS: Return course name and grade in format CourseName: Grade
  public String getCourseAndGrade(String course) {
    if (courses.contains(course)) {
      int courseIndex = courses.indexOf(course);
      return courses.get(courseIndex) + ": " + grades.get(courseIndex);
    } else {
      return null;
    }
  }

  // EFFECTS: Displays course names with grades earned
  // in format StudentName, StudentId: CourseName: Grade, CourseName: Grade
  public void printTranscript() {
    StringBuilder transcript = new StringBuilder(studentName + ", " + studentId + ": ");
    int courseSize = courses.size();

    for (int i = 0; i < courseSize; i++) {
      transcript
          .append(courses.get(i))
          .append( ": ")
          .append(grades.get(i));

      if (i != courseSize - 1 ) {
        transcript.append(", ");
      }
    }

    System.out.print(transcript);
  }

  // EFFECTS: Returns GPA
  public double getGPA() {
    double sum = 0;
    for(double i : grades) {
      sum += i;
    }

    return sum / grades.size();
  }

  // EFFECTS: calculates average of selected grades
  public double calculateAverage(List<Double> selectedGrades) {
    return 0.0;
  }

  // EFFECTS: returns the grade for the given course parameter
  public double getGradeByCourse(String course) {
    return 0.0;
  }

  // EFFECTS: returns average grade of selected courses
  public double getAverageOverSelectedCourses(List<String> selectedCourses){
    return 0.0;
  }
}
