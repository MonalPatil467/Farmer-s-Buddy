package PersonalProject.demo.entity;

import PersonalProject.demo.enums.Season;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "crops")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String cropName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Season season;

    // ✅ Changed from double to BigDecimal
    @Column(nullable = false, precision = 10, scale = 2)
    BigDecimal landArea;

    @Column(nullable = false)
    LocalDate sowingDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id", nullable = false)
    Farmer farmer;

    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Expense> expenses = new ArrayList<>();

    @OneToOne(mappedBy = "crop", cascade = CascadeType.ALL, orphanRemoval = true)
    Harvest harvest;
}
