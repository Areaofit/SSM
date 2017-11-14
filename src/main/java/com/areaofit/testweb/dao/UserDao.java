package com.areaofit.testweb.dao;

import java.util.Map;

import com.areaofit.multiDataSource.byAnnotation.DataSource;
import com.areaofit.multiDataSource.byAnnotation.DynamicDataSourceGlobal;

public interface UserDao {
	
	@DataSource(DynamicDataSourceGlobal.WRITE)
	Map<String, Object> getUserById(String id);
}
