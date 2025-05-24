package com.gstvcolaco.FolhaDePagamento.repository;

import com.gstvcolaco.FolhaDePagamento.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
