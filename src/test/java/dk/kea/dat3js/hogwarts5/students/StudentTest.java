package dk.kea.dat3js.hogwarts5.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StudentTest {

    @Test
    void getFullNameWithMiddleName() {
        // Arrange
        Student student = new Student("Harry", "James", "Potter", null, 9);

        // Act
        var fullName = student.getFullName();

        // Assert
        assertEquals("Harry James Potter", fullName);

    }

    @Test
    void getFullNameWithoutMiddleName() {
        // Arrange
        Student student = new Student("Harry", null, "Potter", null, 9);

        // Act
        var fullName = student.getFullName();

        // Assert
        assertEquals("Harry Potter", fullName);
    }


    @Test
    void setFullNameWithMiddleName() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFullName("Hermione Jean Granger");

        // Assert
        assertEquals("Hermione", student.getFirstName());
        assertEquals("Jean", student.getMiddleName());
        assertEquals("Granger", student.getLastName());
    }

    @Test
    void setFullNameWithMultipleMiddleNames() {
        // Arrange
        Student student = new Student("Albus", "Percival Wulfric Brian", "Dumbledore", null, 9);

        // Act
        student.setFullName("Albus Percival Wulfric Brian Dumbledore");

        // Assert
        assertEquals("Albus", student.getFirstName());
        assertEquals("Percival Wulfric Brian", student.getMiddleName());
        assertEquals("Dumbledore", student.getLastName());
    }

    @Test
    void setFullNameWithoutMiddleName() {
        // Arrange
        Student student = new Student("Neville", null, "Longbottom", null, 9);

        // Act
        student.setFullName("Neville Longbottom");

        // Assert
        assertEquals("Neville", student.getFirstName());
        assertNull(student.getMiddleName());
        assertEquals("Longbottom", student.getLastName());
    }

    @Test
    void setFullNameWithoutMiddleNameAndLastName() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFullName("Harry");

        // Assert
        assertEquals("Harry", student.getFirstName());
        assertNull(student.getMiddleName());
        assertNull(student.getLastName());
    }

    @Test
    void setFullNameWithEmptyString() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFullName("");

        // Assert
        assertEquals("First", student.getFirstName());
        assertEquals("Middle", student.getMiddleName());
        assertEquals("Last", student.getLastName());
        assertEquals("First Middle Last", student.getFullName());
    }

    @Test
    void setFullNameWithNull() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFullName(null);

        // Assert
        assertEquals("First", student.getFirstName());
        assertEquals("Middle", student.getMiddleName());
        assertEquals("Last", student.getLastName());
        assertEquals("First Middle Last", student.getFullName());
    }

    @Test
    void capitalizeIndividualNames() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFirstName("harry");
        student.setMiddleName("james");
        student.setLastName("potter");

        // Assert
        assertEquals("Harry", student.getFirstName());
        assertEquals("James", student.getMiddleName());
        assertEquals("Potter", student.getLastName());
    }

    @Test
    void capitalizeIndividualNamesWithCrazyCasing() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setFirstName("hArRy");
        student.setMiddleName("jAmEs");
        student.setLastName("pOtTeR");

        // Assert
        assertEquals("Harry", student.getFirstName());
        assertEquals("James", student.getMiddleName());
        assertEquals("Potter", student.getLastName());
    }

    @Test
    void capitalizeIndividualNamesWithMultipleMiddleNames() {
        // Arrange
        Student student = new Student("first", "middle", "last", null, 9);

        // Act
        student.setMiddleName("perCy ignAtiUs");

        // Assert
        assertEquals("Percy Ignatius", student.getMiddleName());
    }
}