package bruno.challange.frasesMatch.service;

import bruno.challange.frasesMatch.dto.FraseDTO;
import bruno.challange.frasesMatch.model.Frase;
import bruno.challange.frasesMatch.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public List<FraseDTO> pegaFrases() {
        List<Frase> frase = repository.pegaFraseAleatoria();
                return frase.stream()
                .map(f -> new FraseDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster()))
                .collect(Collectors.toList());
    }
}
