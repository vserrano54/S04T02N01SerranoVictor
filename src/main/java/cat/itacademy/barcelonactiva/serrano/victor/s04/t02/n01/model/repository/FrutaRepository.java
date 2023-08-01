package cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n01.model.domain.Fruta;

//@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Integer> {

}
