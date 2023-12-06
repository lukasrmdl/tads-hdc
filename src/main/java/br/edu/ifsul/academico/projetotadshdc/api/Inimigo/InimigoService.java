package br.edu.ifsul.academico.projetotadshdc.api.Inimigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InimigoService {

    @Autowired
    private InimigoRepository inimigoRepository;

    public List<Inimigo> getAllInimigos() {
        return inimigoRepository.findAll();
    }

    public Optional<Inimigo> getInimigoById(Long id) {
        return inimigoRepository.findById(id);
    }

    public Inimigo createInimigo(Inimigo inimigo) {
        return inimigoRepository.save(inimigo);
    }

    public Inimigo updateInimigo(Long id, Inimigo inimigo) {
        inimigo.setId_ator(id);
        return inimigoRepository.save(inimigo);
    }

    public void deleteInimigo(Long id) {
        inimigoRepository.deleteById(id);
    }
}
