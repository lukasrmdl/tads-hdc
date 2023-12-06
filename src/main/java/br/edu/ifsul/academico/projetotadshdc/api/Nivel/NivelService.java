package br.edu.ifsul.academico.projetotadshdc.api.Nivel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelService {

    @Autowired
    private NivelRepository nivelRepository;

    public List<Nivel> getAllNiveis() {
        return nivelRepository.findAll();
    }

    public Optional<Nivel> getNivelById(Long id) {
        return nivelRepository.findById(id);
    }

    public Nivel createNivel(Nivel nivel) {
        return nivelRepository.save(nivel);
    }

    public Nivel updateNivel(Long id, Nivel nivel) {
        nivel.setNivel_id(id);
        return nivelRepository.save(nivel);
    }

    public void deleteNivel(Long id) {
        nivelRepository.deleteById(id);
    }
}
