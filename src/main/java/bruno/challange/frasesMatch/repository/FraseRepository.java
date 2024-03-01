package bruno.challange.frasesMatch.repository;

import bruno.challange.frasesMatch.dto.FraseDTO;
import bruno.challange.frasesMatch.model.Frase;
import bruno.challange.frasesMatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {


    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    List<Frase> pegaFraseAleatoria();
}
