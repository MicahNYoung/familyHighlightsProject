package repositories;

import models.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Micah Young
 */
@Repository
public interface FamilyMemberRepo extends JpaRepository<FamilyMember, Integer> {
}
