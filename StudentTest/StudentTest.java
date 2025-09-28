package StudentTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {

    // die6 Gewichtsfälle abtesten
    @Test
    public void testGewichtskategorien() {
       
        Student s1 = new Student("blyat", 45, 170, 'w');
        assertEquals("Untergewicht", s1.gewichtKategorie());

        Student s2 = new Student("omar", 50, 185, 'm');
        assertEquals("Untergewicht", s2.gewichtKategorie());

        
        Student s3 = new Student("balula", 60, 170, 'w');
        assertEquals("Normalgewicht", s3.gewichtKategorie());

        Student s4 = new Student("vater", 70, 180, 'm');
        assertEquals("Normalgewicht", s4.gewichtKategorie());

   
        Student s5 = new Student("girl", 90, 165, 'w');
        assertEquals("Übergewicht", s5.gewichtKategorie());

        Student s6 = new Student("Walter white", 140, 170, 'm');
        assertEquals("Übergewicht", s6.gewichtKategorie());
    }

   
    @Test
    public void testBmiBerechnung() {
        Student s1 = new Student("blyat", 45, 170, 'w');
        assertEquals(15.6f, s1.bmi(), 0.1);

        Student s2 = new Student("vater", 70, 180, 'm');
        assertEquals(21.6f, s2.bmi(), 0.1);

        Student s3 = new Student("Walter white", 140, 170, 'm');
        assertEquals(48.4f, s3.bmi(), 0.1);
    }
@Test
    public void testKonstruktorFehler() {
        // Gewicht <= 0
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("Walter white", 0, 170, 'm');
        });

        // Größe <= 0
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("Balula", 55, -160, 'w');
        });

        // Name leer
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("", 55, 165, 'w');
        });

        // Gender ungültig
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("omar", 70, 175, 'x');
        });
    }
    
    }
