package com.techelevator.filesplitter.file;

import java.util.List;

public interface SegmentWriter {
	
	void write(List<String> lines, String filename, int segment, throws IOException);
	
}
