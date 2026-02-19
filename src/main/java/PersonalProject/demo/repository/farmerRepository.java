package PersonalProject.demo.repository;

import PersonalProject.demo.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface farmerRepository extends JpaRepository<Farmer,Long> {
}
