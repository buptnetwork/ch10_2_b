package cn.edu.bupt.ch10_2_b.controller;

import cn.edu.bupt.ch10_2_b.dao.CardRepository;
import cn.edu.bupt.ch10_2_b.dao.StudentRepository;
import cn.edu.bupt.ch10_2_b.entity.Card;
import cn.edu.bupt.ch10_2_b.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/add")
    public String add(){
        Student student = new Student();
        student.setName("小明");
        studentRepository.save(student);

        Card card = new Card();
        card.setNo("a001");
        card.setBalance(BigDecimal.valueOf(100.00));
        card.setStudent(student);
        cardRepository.save(card);

        return "OK!";
    }


    @GetMapping("/find")
    public List<Student> find(){
        return studentRepository.findAll();
    }

    @GetMapping("/delete")
    public String delete(){
        studentRepository.deleteAll();
        return "OK!";
    }


}
