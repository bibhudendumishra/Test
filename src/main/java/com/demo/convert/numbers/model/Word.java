package com.demo.convert.numbers.model;

public class Word {
	
	String word;
	
	//Copy Constructor
	public Word(Word word) {
			this.word = word.word;
	}
	
	public Word(String word) {
		super();
		this.word = word;
	}
	
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	
}
