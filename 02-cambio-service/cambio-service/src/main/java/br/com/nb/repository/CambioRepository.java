package br.com.nb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nb.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio,Long>{

    Cambio findByFromAndTo(String from, String to);
}
