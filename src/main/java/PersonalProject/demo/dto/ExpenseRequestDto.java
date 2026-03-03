package PersonalProject.demo.dto;

import PersonalProject.demo.enums.ExpenseType;

public record ExpenseRequestDto(ExpenseType expenseType,
         Double amount,
         Long cropId) {
}
