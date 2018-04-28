package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.EmployeeDTO;
import com.qwerfghi.aircompany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional(readOnly = true)
    public EmployeeDTO getEmployeeById(int id) {
        return employeeRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(EmployeeDTO employeeDTO) {
        employeeRepository.save(employeeDTO);
    }

    public void deleteEmployee(int id) {
        employeeRepository.delete(id);
    }

    public void updateEmployee(EmployeeDTO employeeDTO) {
        employeeRepository.save(employeeDTO);
    }
}
