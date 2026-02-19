package PersonalProject.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@Table(name = "harvests")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Harvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    Double quantitySold;

    @Column(nullable = false)
    BigDecimal pricePerUnit;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="crop_id",nullable = false,unique = true)
    Crop crop;
}
