package ui;

import java.util.ArrayList;
import java.util.List;
import model.Transcript;

public class Main {

  public static void main(String[] args) {
    Transcript t1 = new Transcript("Jane Doe", 7830);
    Transcript t2 = new Transcript("Ada Lovelace", 8853);
    Transcript t3 = new Transcript("Alan Turing", 1234);

    t1.addGrade("CPSC-210", 3.5);
    t1.addGrade("ENGL-201", 4.0);
    t1.addGrade("CPSC-110", 3.1);

    t2.addGrade("CPSC-210", 3.0);
    t2.addGrade("ENGL-201", 2.0);
    t2.addGrade("CPSC-110", 3.2);

    t3.addGrade("CPSC-210", 3.1);
    t3.addGrade("ENGL-201", 4.0);
    t3.addGrade("CPSC-110", 4.0);

    System.out.println(t1.getStudentName() + ": ");
    t1.printTranscript();
    System.out.println(t1.getCourseAndGrade("CPSC-210"));
    System.out.println(t1.getGPA());

    System.out.println(t2.getStudentName() + ": ");
    t2.printTranscript();
    System.out.println(t2.getCourseAndGrade("CPSC-210"));
    t2.addGrade("CPSC-210", 1.0);
    System.out.println(t2.getCourseAndGrade("CPSC-210"));
    System.out.println(t2.getGPA());
    t2.printTranscript();

    System.out.println(t3.getStudentName() + ": ");
    t3.printTranscript();
    System.out.println(t3.getCourseAndGrade("CPSC-210"));
    System.out.println(t3.getGPA());

    List<Double> grades = new ArrayList<>();
    grades.add(1.0);
    grades.add(2.7);
    grades.add(3.0);

    System.out.println("Aveage grades: ");
    System.out.println(t1.calculateAverage(grades));

    System.out.println("Grade for CPSC-210: ");
    System.out.println(t1.getGradeByCourse("CPSC-210"));

    List<String> courses = new ArrayList<>();
    courses.add("CPSC-210");
    courses.add("ECON-115");

    System.out.println("Average grades for CPSC-210 and ENGL-201: ");
    System.out.println(t1.getAverageOverSelectedCourses(courses));
  }
}
