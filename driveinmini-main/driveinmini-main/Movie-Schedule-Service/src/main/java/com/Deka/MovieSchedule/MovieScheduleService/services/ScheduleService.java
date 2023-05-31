package com.Deka.MovieSchedule.MovieScheduleService.services;

import java.util.List;

import com.Deka.MovieSchedule.MovieScheduleService.Entity.movieSchedule;

public interface ScheduleService {

	// create
	movieSchedule saveSchedule(movieSchedule movieSchedule);

	// getAll
	List<movieSchedule> getAllSchedule();

	// get Single by title
	movieSchedule getSchedule(String movieTitle);

	List<movieSchedule> getScheduleByDate(String date);

	movieSchedule getScheduleBydateAndTime(String date, String time);

	// delete

	// put

}
