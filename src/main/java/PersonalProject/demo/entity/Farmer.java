package PersonalProject.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "farmers")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Farmer {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

   @Column(nullable = false)
    String name;

    @Column(unique=true,nullable = false,length=13)
    String phoneNo;

    @Column(nullable = false)
    String village;

    @OneToMany(mappedBy = "farmer")
    List<Crop> crops=new ArrayList<>();
}
