import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void newStudentTest(){
        Student student = new Student("Giovanni Alberico", "Bonacci");
        Assert.assertEquals("Giovanni Alberico", student.getFirstName());
        Assert.assertEquals("Bonacci", student.getLastName());
        Assert.assertTrue(student.getExams().isEmpty());
    }

    @Test
    public void registerExamsTest(){
        Student student = new Student("Giovanni", "Malacci");

        Exam exam1 = new Exam("Discrete Mathematics", new GregorianCalendar(2022, Calendar.FEBRUARY, 18), 30);
        student.registerExam(exam1);

        Exam exam2 = new Exam("PSD", new GregorianCalendar(2022, Calendar.MAY, 21), 25);
        student.registerExam(exam2);

        double examsNumber = student.getExams().size();
        double averageGrade = student.computeAverageGrade();
        Assert.assertEquals(2, examsNumber, 0);
        Assert.assertEquals(27, averageGrade, 0.5);

    }
}