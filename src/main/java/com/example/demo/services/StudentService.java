package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public List<Student> getAll(){
		return (List<Student>) studentrepository.findAll();
	}
	
	public Optional<Student> getOne(Integer id){
		return studentrepository.findById(id);
	}
	
	public void addNew(Student student){
		studentrepository.save(student);
	}
	
	public void update(Student student){
		studentrepository.save(student);
	}
	
	public void delete(Integer id){
		studentrepository.deleteById(id);
	}
	
}
