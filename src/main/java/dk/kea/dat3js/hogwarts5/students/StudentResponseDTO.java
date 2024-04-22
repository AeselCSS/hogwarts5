package dk.kea.dat3js.hogwarts5.students;

public record StudentResponseDTO(
        int id,
        String firstName,
        String middleName,
        String lastName,
        String fulName,
        String house,
        Integer schoolYear) {
}
