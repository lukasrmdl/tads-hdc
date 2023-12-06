package br.edu.ifsul.academico.projetotadshdc.api.Inimigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inimigo")
public class InimigoController {

    @Autowired
    private InimigoService inimigoService;

    @GetMapping
    public ResponseEntity<List<Inimigo>> getAllInimigos() {
        List<Inimigo> inimigos = inimigoService.getAllInimigos();
        return ResponseEntity.ok(inimigos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inimigo> getInimigoById(@PathVariable Long id) {
        Optional<Inimigo> inimigo = inimigoService.getInimigoById(id);
        return inimigo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Inimigo> createInimigo(@RequestBody Inimigo inimigo) {
        Inimigo createdInimigo = inimigoService.createInimigo(inimigo);
        return ResponseEntity.ok(createdInimigo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inimigo> updateInimigo(@PathVariable Long id, @RequestBody Inimigo inimigo) {
        Inimigo updatedInimigo = inimigoService.updateInimigo(id, inimigo);
        return ResponseEntity.ok(updatedInimigo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInimigo(@PathVariable Long id) {
        inimigoService.deleteInimigo(id);
        return ResponseEntity.noContent().build();
    }
}
