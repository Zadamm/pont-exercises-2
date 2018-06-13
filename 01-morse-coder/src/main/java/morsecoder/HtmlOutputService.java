package morsecoder;

import java.io.FileWriter;
import java.io.IOException;

public class HtmlOutputService implements IOutputService{

	public String writeOut(String line) {
		try {
			
			String HTMLstart =

					"<html>\r\n" + 
					"	<head>\r\n" + 
					"	</head>\r\n" + 
					"	<body>";
			
			String HTMLend = 
					"	</body>\r\n" + 
					"</html>";
			
			FileWriter fw = new FileWriter("braille.html", false);
			
			line = HTMLstart + line + HTMLend;
			
			fw.write(line);				
			fw.flush();

			fw.close();
			System.out.println("write out to file is done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "done";
	}
	
}
