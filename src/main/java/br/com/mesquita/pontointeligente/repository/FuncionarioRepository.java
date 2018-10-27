package br.com.mesquita.pontointeligente.repository;

import org.springframework.transaction.annotation.Transactional;

import br.com.mesquita.pontointeligente.model.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends GenericRepository<Funcionario> {

	Funcionario findByCpf(String cpf);

	Funcionario findByEmail(String email);

	Funcionario findByCpfOrEmail(String cpf, String email);
}
