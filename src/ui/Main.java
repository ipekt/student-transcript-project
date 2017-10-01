package ui;

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

    System.out.print(t1.getStudentName() + ": ");
    t1.printTranscript();
    System.out.print(t1.getCourseAndGrade("CPSC-210"));
    System.out.println(t1.getGPA());

    System.out.print(t2.getStudentName() + ": ");
    t2.printTranscript();
    System.out.print(t2.getCourseAndGrade("CPSC-210"));
    t2.addGrade("CPSC-210", 1.0);
    System.out.print(t2.getCourseAndGrade("CPSC-210"));
    System.out.println(t2.getGPA());
    t2.printTranscript();

    System.out.print(t3.getStudentName() + ": ");
    t3.printTranscript();
    System.out.print(t3.getCourseAndGrade("CPSC-210"));
    System.out.println(t3.getGPA());
    System.out.print(t3.getStudentName() + ": ");
  }
}
