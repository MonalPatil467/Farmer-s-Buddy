package PersonalProject.demo.service;

import PersonalProject.demo.dto.ExpenseRequestDto;
import PersonalProject.demo.dto.ExpenseResponseDto;

import java.util.List;

public interface ExpenseService {
    ExpenseResponseDto createExpense(ExpenseRequestDto expenseRequestDto);
    ExpenseResponseDto getExpenseById(Long id);
    List<ExpenseResponseDto> getExpensesByCrop(Long cropId);
    ExpenseResponseDto updateExpense(ExpenseRequestDto expenseRequestDto);
    void deleteExpense(Long id);
}
