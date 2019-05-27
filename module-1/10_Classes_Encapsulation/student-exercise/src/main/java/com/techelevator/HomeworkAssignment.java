package com.techelevator;

public class HomeworkAssignment {
	
	private int possibleMarks;
	private int totalMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
		if (((double) totalMarks / possibleMarks) * 100 >= 90) {
			return "A";
		}
		else if (((double) totalMarks / possibleMarks) * 100 >= 80) {
			return "B";
		}
		else if (((double) totalMarks / possibleMarks) * 100 >= 70) {
			return "C";
		}
		else if (((double) totalMarks / possibleMarks) * 100 >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
}
