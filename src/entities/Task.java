package entities;

import java.util.Objects;

public class Task {

	private String description;
	private boolean concluded;
	private String title;
	
	public Task(String description, String title) {
		this.description = description;
		this.title = title;
		this.concluded = false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescriptio(String task) {
		this.description = description;
	}

	public boolean isConcluded() {
		return concluded;
	}

	public void setConcluded() {
		this.concluded = true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description) && Objects.equals(title, other.title);
	}
	
	@Override
	public String toString() {
		return "; Title: " + getTitle() + "; Description: " + getDescription();
	}
	
}
