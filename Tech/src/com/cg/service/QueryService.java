package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IQueryDao;
import com.cg.entity.Query;
@Service("ser")
@Transactional
public class QueryService implements IQueryService {

	@Autowired
	IQueryDao dao;
	@Override
	public Query search(int query_id) {
		// TODO Auto-generated method stub
		return dao.search(query_id);
	}

	@Override
	public void update(Query query) {
		// TODO Auto-generated method stub
		dao.update(query);
	}

	
}
