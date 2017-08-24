/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Map;
import json.ReadWriteJSON;

/**
 *
 * @author kaeru
 */
public class ViewerMain {
	public static void main(String[] args) {
		String fileName = "sample_machinehistory.json";
		Map map = (new ReadWriteJSON()).read(fileName);
		
		System.out.println(map);
	}
}
