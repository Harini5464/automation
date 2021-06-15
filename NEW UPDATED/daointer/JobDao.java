package com.hani.daointer;

import com.hani.model.Job;
import com.hani.model.User;

public interface JobDao {

	void addJob(Job job);
	void updateJob(Job job);
	void deactivateJob(Job job);
	void deleteJob(Job job);
	void activateJob(Job job);
	void ViewJobId(Job job);
	void addAppliedJob(Job job,User user);
}
