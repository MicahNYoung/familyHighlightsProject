package repositories;

import models.Family;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Micah Young
 */
@Repository
public interface FamilyRepo extends CrudRepository<Family, Integer> {
}
