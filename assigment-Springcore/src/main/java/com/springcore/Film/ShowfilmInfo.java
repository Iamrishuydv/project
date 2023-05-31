package com.springcore.Film;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowfilmInfo {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Film/filmconfig.xml");
	Filmdirector film = (Filmdirector) context.getBean("film");
	film.printFilmInfo();
}
}
