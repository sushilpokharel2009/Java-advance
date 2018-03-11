package com.stosh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stosh.dao.StudentDao;
import com.stosh.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDao sdo;
	
	
	
	
	@RequestMapping(value="student-form")
	public String studentForm() {
		return "student-form";
		
	}
	
	@RequestMapping(value={"add-student"}, method=RequestMethod.POST)
			public ModelAndView addStudent(@ModelAttribute Student st) {
			 sdo.insertStudent(st);
		
			 
			 List<Student> sList = sdo.getStudentList();
			 System.out.println("S-->>"+ sList.size());
			 ModelAndView mv = new ModelAndView("student-list");
			 mv.addObject("stLists", sList);
		
				return mv;
		
	}
}
