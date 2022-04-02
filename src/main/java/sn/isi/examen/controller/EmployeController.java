package sn.isi.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sn.isi.examen.model.Employe;
import sn.isi.examen.service.EmployeService;

@Controller
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employe> listEmploye = employeService.getEmployes();
        model.addAttribute("employes", listEmploye);
        return "home";
    }

    @GetMapping("/createEmploye")
    public String createEmployee(Model model) {
        Employe e = new Employe();
        model.addAttribute("employe", e);
        return "formNewEmploye";
    }


    @PostMapping("/saveEmploye")
    public ModelAndView saveEmploye(@ModelAttribute Employe employe) {
        employeService.saveEmploye(employe);
        return new ModelAndView("redirect:/");
    }

}


