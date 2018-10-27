package br.com.mesquita.pontointeligente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mesquita.pontointeligente.model.GenericModel;


public interface GenericRepository <T extends GenericModel> extends JpaRepository<T, Serializable>{

}
