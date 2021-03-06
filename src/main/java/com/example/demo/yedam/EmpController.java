package com.example.demo.yedam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

    @Autowired
    EmpMapper dao;
    @RequestMapping("/empList")
    public String empList(Model model) {
        model.addAttribute("empList", dao.getEmpList(null));
        return "empList";
    }
}
