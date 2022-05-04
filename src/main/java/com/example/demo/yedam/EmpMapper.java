package com.example.demo.yedam;

import java.util.List;

public interface EmpMapper {
    public EmpVO getEmp(EmpVO empVO);
    public List<EmpVO> getEmpList(EmpVO empVO);
    public void empInsert(EmpVO empVO);
}
