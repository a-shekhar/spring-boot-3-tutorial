package com.springboot.thymeleafdemo.controller;

import com.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    // method to show form for adding new student
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add the student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){
        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName()
                                        + " " + theStudent.getLastName());
        return "student-confirmation";
    }


}
