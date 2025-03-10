package raisetech.StudentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.controller.StudentController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentsCourses;
import raisetech.StudentManagement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> searchStudentList() {
        return repository.search();
        //絞り込みをする。年齢が３０代の人のみを抽出する。
        //抽出したリストをコントローラーに返す


    }

    public List<StudentsCourses> searchStudentsCourseList() {
        //絞り込み検索で「Javaコース」のコース情報のみを抽出する。
        //抽出したリストをコントローラーに返す。
        return repository.searchStudentsCourses();
    }
}
