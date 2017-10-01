package tests;

import static junit.framework.TestCase.assertEquals;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

public class TranscriptTest {

  private Transcript testTranscript;
  private String testStudentName = "Tim Berners";
  private int testStudentId = 1000;

  @Before
  public void setUp() {
    testTranscript = new Transcript(testStudentName, testStudentId);
  }

  @Test
  public void testStudentNameSet() {
    assertEquals(testTranscript.getStudentName(), testStudentName);
  }

  @Test
  public void testStudentIdSet() {
    assertEquals(testTranscript.getStudentId(), testStudentId);
  }

  @Test
  public void testChangingStudentName() {
    String newName = "Kathryn Janeway";
    assertEquals(testTranscript.getStudentName(), testStudentName);
    testTranscript.setStudentName(newName);
    assertEquals(testTranscript.getStudentName(), newName);
  }

  @Test
  public void testChangingStudentId() {
    int newId = 1001;
    assertEquals(testTranscript.getStudentId(), testStudentId);
    testTranscript.setStudentId(newId);
    assertEquals(testTranscript.getStudentId(), newId);
  }

  @Test
  public void testGradeNotInSet() {
    String course = "MANS-101";
    double grade = 2.5;

    assertEquals(testTranscript.getCourseAndGrade(course), null);
    testTranscript.addGrade(course, grade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + ": " + Double.toString(grade));
  }

  @Test
  public void testGradeInSet() {
    String course = "ECON-101";
    double grade = 2.5;
    double newGrade = 3.0;

    assertEquals(testTranscript.getCourseAndGrade(course), null);
    testTranscript.addGrade(course, grade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + ": " + Double.toString(grade));
    testTranscript.addGrade(course, newGrade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + ": " + Double.toString(newGrade));
  }

  @Test
  public void testGPA() {
    testTranscript.addGrade("CPSC-210", 3.5);
    testTranscript.addGrade("ENGL-201", 4.0);
    testTranscript.addGrade("CPSC-110", 3.1);
    double gpa = (3.5 + 4.0 + 3.1) / 3;
    assertEquals(testTranscript.getGPA(), gpa);
  }
}
