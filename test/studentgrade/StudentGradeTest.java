package studentgrade;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentGradeTest {
@Test
public void testGetGrade95() {
    int mark = 95;
    String expResult = "A";
    String result = StudentGrade.getGrade(mark);
    assertEquals(expResult, result);
}

@Test
public void testGetGrade85() {
    int mark = 85;
    String expResult = "B";
    String result = StudentGrade.getGrade(mark);
    assertEquals(expResult, result);
}

@Test
public void testGetGrade75() {
    int mark = 75;
    String expResult = "F"; 
    String result = StudentGrade.getGrade(mark);
    assertEquals(expResult, result);
}

@Test
public void testGetGrade65() {
    int mark = 65;
    String expResult = "F"; 
    String result = StudentGrade.getGrade(mark);
    assertEquals(expResult, result);
}

@Test
public void testGetGrade105() {
    int mark = 105;
    String expResult = "F"; 
    String result = StudentGrade.getGrade(mark);
    assertEquals(expResult, result);
}

}
