package pl.wasowski.jolka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Question question;
	
	private String answer;
	
	@ManyToOne
	private Solution solution;
	
	public Question getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
