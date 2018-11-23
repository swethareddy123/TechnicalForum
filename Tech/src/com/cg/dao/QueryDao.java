package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.Query;
@Repository("dao")
public class QueryDao implements IQueryDao{

	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public Query search(int query_id) {
		// TODO Auto-generated method stub
		Query query = entitymanager.find(Query.class, query_id);
		return query;
	}

	@Override
	public void update(Query query) {
		// TODO Auto-generated method stub
		Query res = entitymanager.merge(query);
		entitymanager.flush();
	}

	
}
