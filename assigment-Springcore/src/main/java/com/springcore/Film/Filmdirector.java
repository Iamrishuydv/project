package com.springcore.Film;

import java.util.Map;

public class Filmdirector {

	
	private Map<String, String> directorMap;

	public Map<String, String> getDirectorMap() {
		return directorMap;
	}

	public void setDirectorMap(Map<String, String> directorMap) {
		this.directorMap = directorMap;
	}
	
	public void printFilmInfo() {
		System.out.println(directorMap);
	}
}
