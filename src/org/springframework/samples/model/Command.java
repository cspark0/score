package org.springframework.samples.model;

public class Command {
	private String code;
	private String subject;
	private String score;
	private String hakbun;
	
	public Command() {}

	public Command(String code, String subject) {
		this.code = code;
		this.subject = subject;		
	}

	public String getCode() {
		return code;
	}

	public String getSubject() {
		return subject;
	}

	public String getScore() {
		return score;
	}
	
	public void setCode(String code) {
		this.code = code.trim();
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	
}
