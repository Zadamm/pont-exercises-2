package morsecoder;

public class FakeOutputService implements IOutputService{
	
	public String lastLine = "";
	
	public String writeOut(String line) {
		lastLine = line;
		return line;
	}

}
