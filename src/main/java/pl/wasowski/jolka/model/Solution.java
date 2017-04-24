package pl.wasowski.jolka.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Solution {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Puzzle puzzle;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "solution_id")
	private List<Answer> answers = new ArrayList<Answer>();
	
	public List<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
}