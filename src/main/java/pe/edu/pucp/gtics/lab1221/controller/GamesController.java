package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;
import pe.edu.pucp.gtics.lab1221.entity.Games;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;
import pe.edu.pucp.gtics.lab1221.repository.GamesRepository;

import java.util.List;

@Controller
public class GamesController {

    @Autowired
    GamesRepository gamesRepository;

    @GetMapping("/juegos/lista")
    public String listaJuegos (Model model){
        List<Games> listaGames = gamesRepository.findAll();
        model.addAttribute("listaJuegos", listaGames);
        return "/juegos/lista";
    };

    public String editarJuegos(){
        return "";
    };

    public String guardarJuegos(){
        return "";
    };

}
