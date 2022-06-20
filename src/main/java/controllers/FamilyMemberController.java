package controllers;

import models.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repositories.FamilyMemberRepo;
import services.FamilyMemberService;

/**
 * Created by Micah Young
 */
@Controller
@RequestMapping("familymember")
public class FamilyMemberController {

    FamilyMemberService familyMemberService;

//    @GetMapping("${id}")
//    public String displayFamilyMemberHighlights(@PathVariable int id, Model model){
//
//    }
//
//    @GetMapping("new")
//    public String displayNewFamilyMemberForm(Model model){
//
//    }

    @PostMapping("/new")
    public ResponseEntity<FamilyMember> processNewFamilyMemberForm(@RequestBody FamilyMember familyMember, Model model){
        FamilyMember familyMember1 = familyMemberService.addFamilyMember(familyMember);
        return new ResponseEntity<>(familyMember1, HttpStatus.CREATED);

    }

//    @GetMapping("delete")
//    public String displayDeleteFamilyMemberForm(@RequestParam int id, Model model){
//
//    }
//
//    @PostMapping("delete")
//    public String processDeleteFamilyMemberForm(@RequestParam int id, Model model){
//
//    }
}
