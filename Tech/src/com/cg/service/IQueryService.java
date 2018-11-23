package com.cg.service;

import java.util.List;

import com.cg.entity.Query;

public interface IQueryService {

	public Query search(int query_id);
	public void update(Query query);
}
