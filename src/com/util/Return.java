package com.util;

import java.sql.ResultSet;

public interface Return<T> {
	
	public abstract T returning(ResultSet rs);
}
