package br.edu.ifsul.academico.projetotadshdc.api.Nivel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nivel")
public class NivelController {

    @Autowired
    private NivelService nivelService;

    @GetMapping
    public ResponseEntity<List<Nivel>> getAllNiveis() {
        List<Nivel> niveis = nivelService.getAllNiveis();
        return ResponseEntity.ok(niveis);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nivel> getNivelById(@PathVariable Long id) {
        Optional<Nivel> nivel = nivelService.getNivelById(id);
        return nivel.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Nivel> createNivel(@RequestBody Nivel nivel) {
        Nivel createdNivel = nivelService.createNivel(nivel);
        return ResponseEntity.ok(createdNivel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nivel> updateNivel(@PathVariable Long id, @RequestBody Nivel nivel) {
        Nivel updatedNivel = nivelService.updateNivel(id, nivel);
        return ResponseEntity.ok(updatedNivel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNivel(@PathVariable Long id) {
        nivelService.deleteNivel(id);
        return ResponseEntity.noContent().build();
    }
}
