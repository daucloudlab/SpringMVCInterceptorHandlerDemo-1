package kz.tezdet.lessons.springmvc.controllers;

import kz.tezdet.lessons.springmvc.models.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ZooController {
    AnimalService animalService = new AnimalService() ;
    @RequestMapping(value = "/animalList", method = RequestMethod.GET)
    public String getAnimals(Model model){
        List animalList = animalService.getAnimalList() ;
        model.addAttribute("animalList", animalList) ;

        return "animalList" ;
    }
}
