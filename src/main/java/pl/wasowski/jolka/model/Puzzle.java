package pl.wasowski.jolka.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Puzzle {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique = true)
	private int number;
	
	@OneToMany
	@JoinColumn(name = "puzzle_id")
	private List<Solution> solutions = new ArrayList<Solution>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "puzzle_id")
	private List<Question> questions = new ArrayList<Question>();
	
	public long getId() {
		return id;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void addQuestion(Question question) {
		questions.add(question);
	}
}
