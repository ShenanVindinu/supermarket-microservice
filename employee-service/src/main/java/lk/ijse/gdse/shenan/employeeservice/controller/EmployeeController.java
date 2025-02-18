package lk.ijse.gdse.shenan.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public String getEmployee() {
        return "Employee Service: Employee1, Employee2, Employee3";
    }
}
