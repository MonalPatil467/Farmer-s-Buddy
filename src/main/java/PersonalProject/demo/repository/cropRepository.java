package PersonalProject.demo.repository;

import PersonalProject.demo.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cropRepository extends JpaRepository<Crop,Long> {
}
