package com.farmacia.farmacia.repository;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.farmacia.model.Produto;


public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	public List<Produto> findAllByPrecoBetween(@Param("inicio") BigDecimal inicio, @Param ("fim") BigDecimal fim );
	
	public List<Produto> findAllByItemContainingIgnoreCase(@Param ("item")String item);




}
