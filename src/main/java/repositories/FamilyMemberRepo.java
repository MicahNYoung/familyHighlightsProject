package repositories;

import models.FamilyMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Micah Young
 */
@Repository
public interface FamilyMemberRepo extends CrudRepository<FamilyMember, Integer> {
}
