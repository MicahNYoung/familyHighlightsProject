package repositories;

import models.Highlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Micah Young
 */
@Repository
public interface HighlightRepo extends JpaRepository<Highlight, Integer> {
}
