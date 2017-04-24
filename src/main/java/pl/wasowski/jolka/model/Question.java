package pl.wasowski.jolka.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private long id;
	
	private String question;
	
	@ManyToOne
	private Puzzle puzzle;
	
	@OneToMany
	@JoinColumn(name = "question_id")
	private List<Answer> answers;
	
	public long getId() {
		return id;
	}
	
	public Question() {}
	
	public Question(String question) {
		this.question = question;
	}
	
	public String getQuestion() {
		return question;
	}
}
