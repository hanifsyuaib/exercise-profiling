package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<Student> students = studentRepository.findAll();
        Map<Long, List<StudentCourse>> studentCourseMap = new HashMap<>();
        List<StudentCourse> allStudentCourses = studentCourseRepository.findAll();

        for (StudentCourse studentCourse : allStudentCourses) {
            Long studentId = studentCourse.getStudent().getId();
            studentCourseMap.computeIfAbsent(studentId, k -> new ArrayList<>()).add(studentCourse);
        }

        List<StudentCourse> studentCourses = new ArrayList<>();
        for (Student student : students) {
            List<StudentCourse> studentCoursesByStudent = studentCourseMap.getOrDefault(student.getId(), Collections.emptyList());

            for (StudentCourse studentCourseByStudent : studentCoursesByStudent) {
                StudentCourse studentCourse = new StudentCourse();
                studentCourse.setStudent(student);
                studentCourse.setCourse(studentCourseByStudent.getCourse());

                studentCourses.add(studentCourse);
            }
        }
        return studentCourses;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        List<Student> students = studentRepository.findAll();
        Student highestGpaStudent = null;
        double highestGpa = 0.0;
        for (Student student : students) {
            if (student.getGpa() > highestGpa) {
                highestGpa = student.getGpa();
                highestGpaStudent = student;
            }
        }
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        StringBuilder builder = new StringBuilder();

        for (Student student : students) {
            builder.append(student.getName()).append(", ");
        }

        if (builder.length() > 2) {
            builder.setLength(builder.length() - 2);
        }
        return builder.toString();
    }
}

