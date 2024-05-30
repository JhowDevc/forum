package br.com.alura.forum.Controller.Form;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repositoy.CursoRepository;
import br.com.alura.forum.repositoy.TopicoRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

//Essa classe, será responsavel pela recepçao de informações cadastradas

public class TopicoForm {


    private String titulo;
    private String mensagem;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private String nomeCurso;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
