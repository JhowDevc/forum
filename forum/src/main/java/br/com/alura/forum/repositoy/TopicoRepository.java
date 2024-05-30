package br.com.alura.forum.repositoy;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

//Concatenação Curto + Nome, essas classes estão na classe dentro de "modelo" "Topico"
    List<Topico> findByCursoNome(String nomeCurso);
}
