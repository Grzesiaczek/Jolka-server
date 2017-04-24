package pl.wasowski.jolka.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.wasowski.jolka.model.Puzzle;
import pl.wasowski.jolka.repositories.PuzzleRepository;

@RestController
public class PuzzleController {
	@Autowired
	private PuzzleRepository puzzleRepository;
	
	@RequestMapping(path = "puzzle/add", method = RequestMethod.POST)
	public Long addPuzzle(@RequestBody Puzzle puzzle) {
		puzzleRepository.save(puzzle);
		return puzzle.getId();
	}
	
	@RequestMapping("puzzle/{id}")
	public Puzzle getPuzzle(@PathVariable Long id) {
		return puzzleRepository.getOne(id);
	}
	
	@RequestMapping("puzzle/data")
	public List<Puzzle> getData() {
		return puzzleRepository.findAll();
	}
}