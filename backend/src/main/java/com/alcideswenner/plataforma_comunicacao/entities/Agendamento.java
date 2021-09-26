package com.alcideswenner.plataforma_comunicacao.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String destinatario;
private String mensagem;
@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
private Date dataHora;

public Agendamento() {
}

public Agendamento(Long id, String destinatario, String mensagem, Date dataHora) {
	this.id = id;
	this.destinatario = destinatario;
	this.mensagem = mensagem;
	this.dataHora = dataHora;
}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDestinatario() {
	return destinatario;
}
public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}
public String getMensagem() {
	return mensagem;
}
public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}
public Date getDataHora() {
	return dataHora;
}
public void setDataHora(Date dataHora) {
	this.dataHora = dataHora;
}


}
