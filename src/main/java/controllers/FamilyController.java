package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repositories.FamilyRepo;

/**
 * Created by Micah Young
 */
@Controller
@RequestMapping("family")
public class FamilyController {

    @Autowired
    FamilyRepo familyMemberRepo;

    @GetMapping("new")
    public String displayNewFamilyForm(Model model){

    }

    @PostMapping("new")
    public String processNewFamilyForm(ModelAttribute , Model model, Error errors){

    }

    @GetMapping("${id}")
    public String displayFamily(@PathVariable String familyId, Model model){

    }





}
