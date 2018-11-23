package com.cg.dao;

import java.util.List;

import com.cg.entity.Query;

public interface IQueryDao {

	public Query search(int query_id);
	public void update(Query query);


}
