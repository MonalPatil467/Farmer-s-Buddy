package PersonalProject.demo.dto;

import PersonalProject.demo.enums.ExpenseType;
import lombok.Data;

@Data
public class ExpenseRequestDto {
    private ExpenseType expenseType;
    private Double amount;
    private Long cropId;
}
