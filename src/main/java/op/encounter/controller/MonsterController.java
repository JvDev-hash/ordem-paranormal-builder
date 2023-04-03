package op.encounter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import op.encounter.repository.MonsterRepository;

@RestController
public class MonsterController {
    
    @Autowired
    private MonsterRepository repository;

    @GetMapping("/monsters")
    ResponseEntity<?> getAllMonsters() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/monster/{id}")
    ResponseEntity<?> getMonsterById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
    }

    @GetMapping("/monsters/{type}")
    ResponseEntity<?> getMonstersByType(@PathVariable String type) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findMonstersByType(type));
    }
}
