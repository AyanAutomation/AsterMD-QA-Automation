package Cucumber.Step.Definition.Java.Classes;

import java.io.IOException;

import AsterMD.Project.AsterMD.Data_Reader;

public class Data_Fetcher_Cucumber {

	public String Data_Fetcher(String Key) throws IOException {
		Data_Reader f = new Data_Reader();
		return f.Data_Fetcher(Key);
	}
}
