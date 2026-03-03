package PersonalProject.demo.dto;

import PersonalProject.demo.enums.ExpenseType;

import java.time.LocalDate;

public record ExpenseResponseDto(Long id,
                                 Double amount,
                                 ExpenseType expenseType,
                                 String description,
                                 LocalDate expenseDate,
                                 Long cropId) {
}
