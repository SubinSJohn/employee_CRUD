package crud.employee.service;

import java.util.List;

import crud.employee.entity.Employee;

public interface EmployeeService {
	void createNewEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
	Employee searchEmployee(Long id);
	List<Employee> getAllEmployee();
}
