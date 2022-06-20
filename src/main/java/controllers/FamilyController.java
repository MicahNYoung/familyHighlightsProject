package controllers;

import models.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repositories.FamilyRepo;

import java.util.List;

/**
 * Created by Micah Young
 */
@Controller
@RequestMapping("templates/familyMember/family")
public class FamilyController {

    @Autowired
    FamilyRepo familyMemberRepo;
//
//    @GetMapping
//    public String displayFamilyMembers(){
//        return
//    }
//    @GetMapping("new")
//    public String displayNewFamilyForm(Model model){
//
//    }
//
//    @PostMapping("new")
//    public ResponseEntity<FamilyMember> processNewFamilyForm(@RequestBody FamilyMember familyMember, Error errors){
//        return familyMemberRepo.save(familyMember)
//    }

    @GetMapping("${id}")
    public ResponseEntity<?> displayFamily(@PathVariable String familyId, Model model){
        List<FamilyMember> allFamilyMembers = familyMemberRepo.findAllById(familyId);
        return new ResponseEntity<>(allFamilyMembers, HttpStatus.OK);
    }





}
