package oracleProject.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepo;
    public List<Employees> getAllEmployees() {
        return employeesRepo.findAll();
    }
    public Optional<Employees> getParticularEmployee(Long id) {
        return employeesRepo.findById(id);
    }
}
