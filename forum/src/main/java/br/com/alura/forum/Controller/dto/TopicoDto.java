package br.com.alura.forum.Controller.dto;

import br.com.alura.forum.modelo.Topico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {
    //Classe utiliza apenas tipos primitivos e é responsavel pelo envio das informações cadastradas

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    //Nessa classe, utilizaremos os dados que os getters irão precisar
    public TopicoDto (Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getId() {
        return id;
    }
}
