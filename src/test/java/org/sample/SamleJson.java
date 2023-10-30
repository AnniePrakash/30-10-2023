package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

 



public class SamleJson {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		//1.file
		
		File file=new File("C:\\Users\\USER\\eclipse-workspace\\JulyBatchFramework\\src\\test\\resources\\sample.json");
		
		//2.FileReader==pass the file as input parameter
		
		FileReader reader=new FileReader(file);
		
	   //3.To read data from JSON,We need to use class called JSONParser--->This class is present in SimpleJSON  maven Dependency
		
		JSONParser parser=new JSONParser();
		
		//4.By using method called parse(),We are going to read the json file
		
		Object parse = parser.parse(reader);
		
		//To get data from json,we need type object to json object
		
		JSONObject ob=(JSONObject) parse;
		
		
		ob.get("Name");
		
		//To get directly as string value
		
		String string = ob.get("Name").toString();
		
		System.out.println(string);
		
		
	}

}
