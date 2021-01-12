package oracleProject;

import oracleProject.database.Employees;
import oracleProject.database.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RestController
public class InitController {
	@Autowired
	EmployeesService employeesService;

	@RequestMapping("/employees")
	public List<Employees> employees() {
		return employeesService.getAllEmployees();
	}
	@RequestMapping("/employees/{id}")
	public Optional<Employees> getParticularEmployee(@PathVariable(value="id") Long id) {
		return employeesService.getParticularEmployee(id);
	}
}
