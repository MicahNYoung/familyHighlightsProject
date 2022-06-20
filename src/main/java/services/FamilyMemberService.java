package services;

import models.FamilyMember;
import org.springframework.stereotype.Service;
import repositories.FamilyMemberRepo;

/**
 * Created by Micah Young
 */
@Service
public class FamilyMemberService {

    private FamilyMemberRepo familyMemberRepo;
    public FamilyMember addFamilyMember(FamilyMember familyMember) {
        return familyMemberRepo.save(familyMember);
    }
}
