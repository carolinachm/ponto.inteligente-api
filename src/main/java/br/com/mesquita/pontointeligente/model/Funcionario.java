package br.com.mesquita.pontointeligente.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.mesquita.pontointeligente.enums.PerfilEnum;
import lombok.Data;

@Entity
@Table(name = "tb_funcionario")
@Data
public class Funcionario extends GenericModel{
	
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private BigDecimal valorHora;
	@Transient
	private Float qtdHorasTrabalhoDia;
	@Transient
	private Float qtdHorasAlmoco;
	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	private PerfilEnum perfil;
	private Date dataCriacao;
	private Date dataAtualizacao;
	@ManyToOne(fetch = FetchType.EAGER)
	private Empresa empresa;
	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lancamento> lancamentos;
	
	@PreUpdate
    public void preUpdate() {
        dataAtualizacao = new Date();
    }
     
    @PrePersist
    public void prePersist() {
        final Date atual = new Date();
        dataCriacao = atual;
        dataAtualizacao = atual;
    }

}
