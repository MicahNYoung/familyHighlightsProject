package repositories;

import models.Family;
import models.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Micah Young
 */
@Repository
public interface FamilyRepo extends JpaRepository<Family, Integer> {
    List<FamilyMember>findAllById(String familyId);
}
