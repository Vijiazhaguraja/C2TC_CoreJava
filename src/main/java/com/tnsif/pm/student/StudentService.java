package com.tnsif.pm.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class StudentService {
	@Autowired
	private StudentRepository repo;

	

	public List<Student> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

    public Student get(Integer id) {
    	return repo.findById(id).get();
		 
	}

	public void save(Student student) {
		repo.save(student);
		
	}


	 public void delete(Integer id) {
	        repo.deleteById(id);
	    }

	
}
