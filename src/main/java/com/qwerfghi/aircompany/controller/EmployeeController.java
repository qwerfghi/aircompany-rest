package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.EmployeeDTO;
import com.qwerfghi.aircompany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping
    public void updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.updateEmployee(employeeDTO);
    }
}
