package com.example.deklaration.repository;

import com.example.deklaration.model.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarationRepository extends JpaRepository<Declaration, Long> {}
