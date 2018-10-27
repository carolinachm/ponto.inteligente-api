package br.com.mesquita.pontointeligente.repository;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.mesquita.pontointeligente.model.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({ @NamedQuery(name = "LancamentoRepository.findByFuncionarioId", query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId") })
public interface LancamentoRepository extends GenericRepository<Lancamento> {

	List<Lancamento> findByFuncionarioId(
			@Param("funcionarioId") Long funcionarioId);

	Page<Lancamento> findByFuncionarioId(
			@Param("funcionarioId") Long funcionarioId, Pageable pageable);

}
