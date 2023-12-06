package br.edu.ifsul.academico.projetotadshdc.api.Heroi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//get http://localhost:8080/api/heroi

//post http://localhost:8080/api/login

@RestController
@RequestMapping("/api/heroi")
public class HeroiController {

    @Autowired
    private HeroiService heroiService;

    @GetMapping
    public ResponseEntity<List<Heroi>> getAllHerois() {
        List<Heroi> herois = heroiService.getAllHerois();
        return ResponseEntity.ok(herois);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Heroi> getHeroiById(@PathVariable Long id) {
        Optional<Heroi> heroi = heroiService.getHeroiById(id);
        return heroi.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Heroi> createHeroi(@RequestBody Heroi heroi) {
        Heroi createdHeroi = heroiService.createHeroi(heroi);
        return ResponseEntity.ok(createdHeroi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Heroi> updateHeroi(@PathVariable Long id, @RequestBody Heroi heroi) {
        Heroi updatedHeroi = heroiService.updateHeroi(id, heroi);
        return ResponseEntity.ok(updatedHeroi);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroi(@PathVariable Long id) {
        heroiService.deleteHeroi(id);
        return ResponseEntity.noContent().build();
    }
}
