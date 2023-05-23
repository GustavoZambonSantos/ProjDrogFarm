package com.Farmacia.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Farmacia.Farmacia.Model.Produto;


public interface ProdutosRepository extends JpaRepository <Produto, Long> {

	public List <Produto> findAllByMedicamentoContainingIgnoreCase(@Param("medicamento") String medicamento);
}
