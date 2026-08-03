package AsterMD.Project.AsterMD;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Data_Reader {

	public String Data_Fetcher(String Key) throws IOException {
		Properties prop = new Properties();
		try (InputStream f = Data_Reader.class.getClassLoader().getResourceAsStream("Data/data.properties")) {
			if (f == null) throw new IOException("Unable to find Data/data.properties on the classpath.");
			prop.load(f);
		}

		String Value = prop.getProperty(Key);
		if (Value == null || Value.isBlank()) throw new IllegalArgumentException("Missing or blank property value for key: " + Key);
		return Value.trim();
	}
}
