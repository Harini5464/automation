package com.hani.daointer;

import com.hani.model.Admin;

public interface AdminDao {
	Admin checkAdminLogin(Admin admin);
	Admin deleteUser(Admin admin);
	Admin viewUser(Admin admin);
	void deleteAppliedJob(Admin admin);
	void rejectReq(Admin admin);
	void selectReq(Admin admin);
}
