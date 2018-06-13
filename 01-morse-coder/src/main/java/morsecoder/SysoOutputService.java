package morsecoder;

public class SysoOutputService implements IOutputService{
	
	public String writeOut(String line) {
		System.out.println(line);
		return line;
	}

}
