package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;

import java.util.List;

@Controller
public class DistributorsController {

    @Autowired
    DistributorsRepository distributorsRepository;

    @GetMapping("distribuidoras/lista")
    public String listaDistribuidoras(Model model) {
        List<Distributors> listaDistribuidoras = distributorsRepository.findAll(); //listatodo
        model.addAttribute("listaDistrib", listaDistribuidoras);
        return "distribuidoras/lista";
    }

    ;

    @GetMapping("distribuidoras/editar")
    public String editarDistribuidoras() {
        return "distribuidoras/editar";
    }

    ;

    //nueva distribuidora
    @GetMapping("distribuidoras/nuevo")
    public String nuevaDistribuidora() {
        return "distribuidoras/nuevo";
    }

    ;

    @PostMapping("distribuidoras/guardar")
    public String guardarDistribuidora(Distributors distributors) {
        distributorsRepository.save(distributors);
        return "redirect:/distribuidoras/lista";
    }

    ;

    @GetMapping ("/distribuidoras/borrar")
    public String borrarDistribuidora(Distributors distributors) {
        distributorsRepository.delete(distributors);
            return "redirect:/distribuidoras/lista";
    }
    ;

}

