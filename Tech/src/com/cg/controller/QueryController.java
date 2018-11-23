package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Query;
import com.cg.service.IQueryService;

@Controller
public class QueryController {

	@Autowired
	IQueryService ser;
	@RequestMapping("searchid")
	public String search(Model model){
		return "searchquery";
		
	}
	@RequestMapping("searchquery1")
	public ModelAndView searchque(@ModelAttribute("my") Query que,Map<String, Object> model){
		Query q = ser.search(que.getQuery_id());
		if(q == null || q.getQuery_id()==0){
			return new ModelAndView("failure","queryid",q);
		}
		else{
			q.setQuery_id(que.getQuery_id());
		}
		List<String> soln = new ArrayList<>();
		soln.add("Nikhil");
		soln.add("Raveena");
		soln.add("Suraj");
		model.put("soln", soln);
		model.put("q", q);
		
		return new ModelAndView("showsearch","temp",q);
		
	}
	@RequestMapping("update")
	public ModelAndView updatequery(@ModelAttribute("my") Query que){
		int id = que.getQuery_id();
		ser.update(que);
		return new ModelAndView("UpdateSuccess","queryid",id);
	}
}
