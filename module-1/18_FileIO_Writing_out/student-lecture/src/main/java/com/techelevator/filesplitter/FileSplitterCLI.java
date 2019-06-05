package com.techelevator.filesplitter;

import java.io.File;

import com.techelevator.filesplitter.userinput.Menu;

import com.techelevator.filesplitter.FileSplitterCLI;
import com.techelevator.filesplitter.file.FileProcessor;

public class FileSplitterCLI {

private Menu menu = new Menu();
	
	public void run() {
		
		// Get a file name from user
		File inputFile = getFile();
		// Get the number of lines to split on
		int lineCount = getLineCount();
		// Use something to split the file
		FileProcessor processor = new FileProcessor();
		try {
			processor.split(inputFile,  lineCount);
		} catch (IOException e) {
			menu.displayMessageToUser("An Unexpected error occurred");
			throw new RuntimeException(e);
		}
		
	}
	
	// TODO: Finish getting the line count from the user
	private int getLineCount() {
		return 300;
	}
	
	private File getFile() {
		File file = null;
		while (file == null) {
			String fileName = menu.getFileNameFromUser();
			file = new File(fileName);
			if (!file.exists() || !file.isFile()) {
				menu.displayMessageToUser(file.getAbsolutePath() + " does not exists. Please try again.");
				file = null;
			}
		}
		return file;
	}
	
	public static void main(String[] args) {
		
		FileSplitterCLI fs = new FileSplitterCLI();
		fs.run();

	}

}
