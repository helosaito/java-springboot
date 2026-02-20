package com.example.saito.repositories;

import com.example.saito.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesosaRepository extends JpaRepository<PessoaModel, Long> {
}
