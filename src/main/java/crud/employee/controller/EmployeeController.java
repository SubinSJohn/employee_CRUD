package crud.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import crud.employee.entity.Employee;
import crud.employee.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/createPage")
	public String ShowCreatePage() {
		return "create";
	}
	
	@PostMapping("/create")
	public void createNewEmployee(@ModelAttribute Employee emp) {
		service.createNewEmployee(emp);
	}
	
	@GetMapping("/updatePage")
	public String ShowUpdatePage() {
		return "update";
	}
	
	@PostMapping("/update")
	public void updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
	}
	
	@GetMapping("/deletePage")
	public String showDeletePage() {
		return "delete";
	}
	
	@PostMapping("/delete")
	public void delectEmployee(Long id) {
		service.deleteEmployee(id);
	}
	
	@GetMapping("/searchPage")
	public String displaySearchPage() {
		return "search";
	}
	
	@GetMapping("/search")
	public String searchEmployee(Long id,Model model) {
		Employee emp = service.searchEmployee(id);
		model.addAttribute("empObj", emp);
		return"searchResult";
	}
	
	@GetMapping("/vewAllPage")
	public String vewAllPage(Model model) {
		List<Employee> emp = service.getAllEmployee();
		model.addAttribute("empList",emp);
		return "vewpage";
	}
	
	
}















