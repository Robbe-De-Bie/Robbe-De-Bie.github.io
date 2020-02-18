package be.ucll.labo2.Controller;

import be.ucll.labo2.Service.Restaurant;
import be.ucll.labo2.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RestaurantController {
    @Autowired
    RestaurantService service;

    @GetMapping("/")
    public String indexPagina(Model model){
        model.addAttribute("restaurants", service.getRestaurantjes());
        return "index.html";
    }
}
