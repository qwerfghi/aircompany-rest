package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.EmployeeDTO;
import com.qwerfghi.aircompany.repository.dto.EmployeeDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeDTORepository employeeDTORepository;

    @Autowired
    public EmployeeService(EmployeeDTORepository employeeDTORepository) {
        this.employeeDTORepository = employeeDTORepository;
    }

    @Transactional(readOnly = true)
    public EmployeeDTO getEmployeeById(int id) {
        return employeeDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<EmployeeDTO> getAllEmployees() {
        return employeeDTORepository.findAll();
    }

    public void addEmployee(EmployeeDTO employeeDTO) {
        employeeDTORepository.save(employeeDTO);
    }

    public void deleteEmployee(int id) {
        employeeDTORepository.delete(id);
    }

    public void updateEmployee(EmployeeDTO employeeDTO) {
        employeeDTORepository.save(employeeDTO);
    }
}
