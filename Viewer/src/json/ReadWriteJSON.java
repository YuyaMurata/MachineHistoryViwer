/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kaeru
 */
public class ReadWriteJSON {
	public Map read(String fileName){
		try (JsonReader reader = new JsonReader(new FileReader(new File(fileName)))) {
			Gson gson = new Gson();
			return gson.fromJson(reader, Map.class);
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		return null;
	}
}
