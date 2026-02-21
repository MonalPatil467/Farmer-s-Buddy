package PersonalProject.demo.entity;

import PersonalProject.demo.enums.Season;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
@Table(name = "crops")
@NoArgsConstructor
public class Crop {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String cropName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    Season season;

    @Column(nullable = false,precision = 10)
    double landArea;

    @Column(nullable = false)
    LocalDate sowingDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="farmer_id",nullable = false)
    Farmer farmer;

    @OneToMany(mappedBy = "crop")
    List<Expense> expenses = new ArrayList<>();

    @OneToOne(mappedBy = "crop")
    Harvest harvest;
}
