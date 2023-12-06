package br.edu.ifsul.academico.projetotadshdc.api.Heroi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroiService {

    @Autowired
    private HeroiRepository heroiRepository;

    public List<Heroi> getAllHerois() {
        return heroiRepository.findAll();
    }

    public Optional<Heroi> getHeroiById(Long id) {
        return heroiRepository.findById(id);
    }

    public Heroi createHeroi(Heroi heroi) {
        return heroiRepository.save(heroi);
    }

    public Heroi updateHeroi(Long id, Heroi heroi) {
        heroi.setId_ator(id);
        return heroiRepository.save(heroi);
    }

    public void deleteHeroi(Long id) {
        heroiRepository.deleteById(id);
    }
}
