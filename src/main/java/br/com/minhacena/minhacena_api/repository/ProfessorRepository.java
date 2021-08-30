package br.com.minhacena.minhacena_api.repository;

import br.com.minhacena.minhacena_api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
