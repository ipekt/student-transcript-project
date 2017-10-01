package tests;

import static junit.framework.TestCase.assertEquals;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

public class TranscriptTest {

  private Transcript testTranscript;

  @Before
  public void setUp() {
    testTranscript = new Transcript("Tim Berners", 1000);
  }

  @Test
  public void testGradeNotInSet() {
    String course = "MANS-101";
    double grade = 2.5;

    assertEquals(testTranscript.getCourseAndGrade(course), null);
    testTranscript.addGrade(course, grade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + " " + Double.toString(grade));
  }

  @Test
  public void testGradeInSet() {
    String course = "ECON-101";
    double grade = 2.5;
    double newGrade = 3.0;

    assertEquals(testTranscript.getCourseAndGrade(course), null);
    testTranscript.addGrade(course, grade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + " " + Double.toString(grade));
    testTranscript.addGrade(course, newGrade);
    assertEquals(testTranscript.getCourseAndGrade(course), course + " " + Double.toString(newGrade));
  }
}
