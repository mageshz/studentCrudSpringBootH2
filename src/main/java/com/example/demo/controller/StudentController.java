package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		String username="KindSon";
		List<Student> studentList=studentservice.getAll();
		model.addAttribute("students",studentList);
		model.addAttribute("username",username);
		return "students";
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Student> getOne(Integer Id) {
		return studentservice.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Student student) {
		studentservice.addNew(student);
		return "redirect:/students/getAll";
		
	}
	
	@RequestMapping(value="/update" , method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Student student) {
		studentservice.update(student);
		return "redirect:/students/getAll";
		
	}
	
	@RequestMapping(value="/delete" , method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer Id) {
		studentservice.delete(Id);
		return "redirect:/students/getAll";
		
	}
	
	
}
