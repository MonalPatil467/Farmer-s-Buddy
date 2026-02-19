package PersonalProject.demo.repository;

import PersonalProject.demo.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface expenseRepository extends JpaRepository<Expense,Long> {
}
