package br.com.wendel.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wendel.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
