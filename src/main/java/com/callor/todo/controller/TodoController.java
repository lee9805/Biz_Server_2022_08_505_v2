package com.callor.todo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

	@Autowired
	private TodoService todoService;
	@RequestMapping(value={"","/"},method=RequestMethod.GET)
	public String home(Principal principal,Model model) {
		String username principal.getName();
		List<TodoVO> todoList= todoService.findByUsername(username);
		 model.addAttribute(todoList);
		 return "todo/
		
	}
	
}
