package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repositories.FamilyMemberRepo;

/**
 * Created by Micah Young
 */
@Controller
@RequestMapping("familyMember")
public class FamilyMemberController {

    @Autowired
    FamilyMemberRepo familyMemberRepo;

    @GetMapping("${id}")
    public String displayFamilyMemberHighlights(@PathVariable int id, Model model){

    }

    @GetMapping("new")
    public String displayNewFamilyMemberForm(Model model){

    }

    @PostMapping("new")
    public String processNewFamilyMemberForm(@ModelAttribute, Model model){

    }

    @GetMapping("delete")
    public String displayDeleteFamilyMemberForm(@RequestParam int id, Model model){

    }

    @PostMapping("delete")
    public String processDeleteFamilyMemberForm(@RequestParam int id, Model model){

    }
}
