package com.example.demo.yedam;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class EmpVO {
    String employeeId;
    String firstName;
    String lastName;
    String email;
    String hireDate;
    String jobId;
    String departmentId;
    String profile;
    MultipartFile uploadFile;
}
