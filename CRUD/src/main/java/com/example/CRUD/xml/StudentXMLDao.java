package com.example.CRUD.xml;

import com.example.CRUD.model.StudentDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentXMLDao {
  private final SqlSessionFactory sessionFactory;

  // Read
  public List<StudentDto> readStudentsAll() {
    // 사용방식은 annotation 기반과 동일하다.
    try(SqlSession session = sessionFactory.openSession()) {
      StudentXMLMapper mapper = session.getMapper(StudentXMLMapper.class);
      return mapper.selectStudentAll();
    }
  }

  public StudentDto resdStudent(Long id) {
    try(SqlSession session = sessionFactory.openSession()) {
      StudentXMLMapper mapper = session.getMapper(StudentXMLMapper.class);
      return mapper.selectStudent(id);
    }
  }

  // Create
  public void createStudent(StudentDto dto) {
    try(SqlSession session = sessionFactory.openSession()) {
      StudentXMLMapper mapper = session.getMapper(StudentXMLMapper.class);
      mapper.insertStudent(dto);
    }
  }

  // Update
  public void updateStudent(StudentDto dto) {
    try(SqlSession session = sessionFactory.openSession()) {
      StudentXMLMapper mapper = session.getMapper(StudentXMLMapper.class);
      mapper.updateStudent(dto);
    }
  }


  // Delete
  public void deleteStudent(Long id) {
    try(SqlSession session = sessionFactory.openSession()) {
      StudentXMLMapper mapper = session.getMapper(StudentXMLMapper.class);
      mapper.deleteStudent(id);
    }
  }
}
