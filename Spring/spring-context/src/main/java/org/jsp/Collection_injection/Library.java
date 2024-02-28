package org.jsp.Collection_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	private List<String> books;
	private Set<String> author;
	private Map<String, String> details;
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Set<String> getAuthor() {
		return author;
	}
	public void setAuthor(Set<String> author) {
		this.author = author;
	}
	public Map<String, String> getDetails() {
		return details;
	}
	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	
	
	}
	
	

