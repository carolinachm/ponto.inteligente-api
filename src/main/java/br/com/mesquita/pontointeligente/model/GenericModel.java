package br.com.mesquita.pontointeligente.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericModel implements Serializable{
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Basic(optional = false)  
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")  
    private long id;
}
