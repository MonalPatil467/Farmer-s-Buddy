package PersonalProject.demo.entity;

import PersonalProject.demo.enums.ExpenseType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "expenses")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    ExpenseType expenseType;

    @Column(nullable = false,precision = 10)
     BigDecimal amount;

    @Column(nullable = false)
    LocalDate expenseDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="crop_id",nullable = false)
    Crop crop;


}
