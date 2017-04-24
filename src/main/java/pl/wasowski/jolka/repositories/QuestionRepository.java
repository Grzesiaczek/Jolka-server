package pl.wasowski.jolka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.wasowski.jolka.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
