package peaksoft.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "student_gen"
    )
    @SequenceGenerator(
            name = "student_gen",
            sequenceName = "student_seq",
            allocationSize = 1,
            initialValue = 2
    )
    private Long id;
    private String fullName;
    private int age;
    private String image;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Student(String fullName, int age, String image, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.image = image;
        this.gender = gender;
    }
}
