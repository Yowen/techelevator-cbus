package com.techelevator.filesplitter.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

	public void split(File inputFile, int lineCount) throws IOException {
		
		SegmentWriter segmentWriter = new TextSegmentWriter();
		
		try (Scanner fileScanner = new Scanner(inputFile)) {
			
			List<String> lines = new ArrayList<String>();
			int segment = 0;
			
			while (fileScanner.hasNextLine()) {
				
				int count = lineCount;
				
				while (count > 0 && fileScanner.hasNextLine()) {
					lines.add(fileScanner.nextLine());
					count--;
				}
			}
			
			int count = lineCount;
			while (count > 0 && fileScanner.hasNextLine()) {
				
			}
			segment++;
			segmentWriter.write(lines,  inputFile.getName());
			// Wrote tje [artoa; fo;e
			lines = new ArrayList
		}
		
	}
	
}
