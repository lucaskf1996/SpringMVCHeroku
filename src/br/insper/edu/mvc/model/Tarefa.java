package br.insper.edu.mvc.model;

import java.sql.Date;

public class Tarefa {
	private Long id;
	private String descricao;
	private Boolean concluido;
	private Date data;
	
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao){this.descricao = descricao;}
	public Boolean getConcluido() {return concluido;}
	public void setConcluido(Boolean concluido) {this.concluido = concluido;}
	public Date getData() {return data;}
	public void setData(Date data) {this.data = data;}
}
