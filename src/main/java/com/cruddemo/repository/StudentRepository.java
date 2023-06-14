package com.cruddemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {//We need to perform operations on Student entity where primary key is Id and it's data type is Integer. Therefore we write Entity class name and the it's primary key Wrapper class in the Generic area. We don't write Data type here it will give error. So we use Wrapper class instead.
		//This class can only perform crud-operation on Student Object only, bcz we have used the generic as Student only.
		//This is where all our crud operations takes place.
		//And the Interface CrudRepository has the built-in methods to perform CRUD.
}