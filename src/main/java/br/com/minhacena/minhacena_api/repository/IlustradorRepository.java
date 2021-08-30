package br.com.minhacena.minhacena_api.repository;

import br.com.minhacena.minhacena_api.model.Ilustrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IlustradorRepository extends JpaRepository<Ilustrador, Long> {
}
