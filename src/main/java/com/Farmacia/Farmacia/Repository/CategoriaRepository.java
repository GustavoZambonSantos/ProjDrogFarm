package com.Farmacia.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Farmacia.Farmacia.Model.Categoria;


public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
	public List<Categoria> findAllByTipoMedicamentoContainingIgnoreCase(@Param ("tipoMedicamento") String tipoMedicamento);

}
