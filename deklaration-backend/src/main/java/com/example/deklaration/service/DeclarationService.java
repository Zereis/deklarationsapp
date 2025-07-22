package com.example.deklaration.service;

import com.example.deklaration.model.Declaration;
import com.example.deklaration.repository.DeclarationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeclarationService {
    private final DeclarationRepository repository;

    public DeclarationService(DeclarationRepository repository) {
        this.repository = repository;
    }

    public List<Declaration> findAll() {
        return repository.findAll();
    }

    public Optional<Declaration> findById(Long id) {
        return repository.findById(id);
    }

    public Declaration save(Declaration declaration) {
        return repository.save(declaration);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
