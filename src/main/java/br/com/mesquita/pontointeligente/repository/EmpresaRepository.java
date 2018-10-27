package br.com.mesquita.pontointeligente.repository;

import org.springframework.transaction.annotation.Transactional;

import br.com.mesquita.pontointeligente.model.Empresa;

public interface EmpresaRepository extends GenericRepository<Empresa>{
	
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
