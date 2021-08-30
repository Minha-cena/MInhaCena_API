package br.com.minhacena.minhacena_api.repository;

import br.com.minhacena.minhacena_api.model.Redacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedacaoRepository extends JpaRepository<Redacao, Long> {
}
