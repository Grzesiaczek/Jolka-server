package pl.wasowski.jolka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.wasowski.jolka.model.Solution;

public interface SolutionRepository extends JpaRepository<Solution, Long> {

}
