package com.example.deklaration.controller;

import com.example.deklaration.model.Declaration;
import com.example.deklaration.service.DeclarationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deklaration")
@CrossOrigin(origins = "http://localhost:3000")
public class DeclarationController {
    private final DeclarationService service;

    public DeclarationController(DeclarationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Declaration> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Declaration create(@RequestBody Declaration declaration) {
        return service.save(declaration);
    }

    @PutMapping("/{id}")
    public Declaration update(@PathVariable Long id, @RequestBody Declaration declaration) {
        declaration.setId(id);
        return service.save(declaration);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
