package PersonalProject.demo.repository;

import PersonalProject.demo.entity.Farmer;
import PersonalProject.demo.entity.Harvest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface harvestRepository extends JpaRepository<Harvest,Long> {
}
