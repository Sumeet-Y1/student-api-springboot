package SPringStudent.Stumange;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface En21Repository extends JpaRepository<En21, Long> {
    List<En21> findByUserId(Long userId);
}