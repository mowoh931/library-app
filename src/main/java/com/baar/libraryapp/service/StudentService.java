package com.baar.libraryapp.service;

import java.util.List;

import com.baar.libraryapp.dto.StudentDto;
import com.baar.libraryapp.model.Student;

public interface StudentService {

	public   void registerStudent(StudentDto dto);

	public   List<StudentDto> findAllStudents();

	public   StudentDto findBystudentId(Integer studentId);

	public   void updateStudentAddress(Integer studentId, String address);

	public   void deleteStudent(Student student);

}
