package morsecoder;

public class FakeUserInputService implements IUserInputService{
	
	public String line = "abc";
	
	public String readLine() {
		return line;
	}

}
