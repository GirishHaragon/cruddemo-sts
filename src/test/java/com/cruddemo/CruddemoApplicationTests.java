package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entity.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {

	@Autowired
	private StudentRepository studentRepo;//Object of repository layer is not created because StudentRepository is an Interface & we cannot create object of Interface so Spring IOC has the logic which object to create and inject the address into the the reference studentRepo. We can see this in the below test method.
	
	@Test
	void saveStudent() {
		//System.out.println(studentRepo);//by this we can get the address of the object created.
		Student s = new Student();
		s.setName("Mike");
		s.setCourse("Java Devvelopment Course");
		s.setFee(20000);
		studentRepo.save(s);
	}
	
	@Test
	void deleteStudent() {//We can select the method name and run the specific method.
		studentRepo.deleteById(2);//If we don't select and run then all the methods will run one by one.
	}
	
	@Test
	void getStudentInfo() {
		Optional<Student> findById = studentRepo.findById(3);//In the earlier versions of STS the Id no will be given as 1L that is 1Long with Long DT but the newer versions the Id will be given as Integer.
		//findById will take the record based on the id no provided and put that into Object and that object that it will store into is of the type Optional class.
		Student student = findById.get();//This get method will convert Optional class object into Entity Object Student. Which we can print the data.
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	@Test
	void updateStudent() {
		//System.out.println(studentRepo);//by this we can get the address of the object created.
		Student s = new Student();
		s.setId(3);//Whenever we update we need to give the Unique Parameter. And we cannot update the Primary key, using the primary key only we can update the record.
		s.setName("Jack");
		s.setCourse("Java Development API Course");
		s.setFee(25000);
		studentRepo.save(s);
	}
}