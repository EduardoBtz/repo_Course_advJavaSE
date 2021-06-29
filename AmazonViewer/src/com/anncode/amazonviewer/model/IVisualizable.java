package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method captures the time of visualization.
	 * @param dateI is an object {@code Date} with the start time.
	 * @return Returns the date and captured hour.
	 * 
	 */
	Date startToSee(Date dateI);
	void stopToSee(Date dateI, Date dateF);
	
}
