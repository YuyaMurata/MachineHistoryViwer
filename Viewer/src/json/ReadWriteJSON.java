/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Map;
import obj.SyaryoObject;

/**
 *
 * @author kaeru
 */
public class ReadWriteJSON {
	public Map read(String fileName){
		try (JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(new File(fileName))))) {
			Type syaryoMapType = new TypeToken<Map<String, SyaryoObject>>(){}.getType();
			
			Gson gson = new Gson();
			while(reader.hasNext()){
				return gson.fromJson(reader, syaryoMapType);
			}
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		return null;
	}
}
