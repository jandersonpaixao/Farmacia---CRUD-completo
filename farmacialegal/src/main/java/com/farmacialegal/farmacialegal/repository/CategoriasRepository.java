package com.farmacialegal.farmacialegal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacialegal.farmacialegal.model.Categorias;
import com.farmacialegal.farmacialegal.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	
	public List<Categorias> findAllByTipoContainingIgnoreCase (String tipo);
}
