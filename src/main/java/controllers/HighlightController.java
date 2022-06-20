package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import repositories.HighlightRepo;

/**
 * Created by Micah Young
 */
@Controller
@RequestMapping("highlight")
public class HighlightController {
    @Autowired
    HighlightRepo highlightRepo;
//
//    @GetMapping("new")
//    public String displayNewHighlightForm(Model model){
//
//    }
//
//    public String processNewHighlightForm(@ModelAttribute, Model model, Error errors) {
//
//    }

}
