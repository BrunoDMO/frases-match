package bruno.challange.frasesMatch.controller;

import bruno.challange.frasesMatch.dto.FraseDTO;
import bruno.challange.frasesMatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping
    public List<FraseDTO> frase(){
        return service.pegaFrases();
    }
}
