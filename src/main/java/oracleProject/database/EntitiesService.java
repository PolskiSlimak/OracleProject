package oracleProject.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntitiesService {
    @Autowired
    EmployeesRepository employeesRepo;
    @Autowired
    CountriesRepository countriesRepository;
    @Autowired
    DepartmentsRepository departmentsRepository;
    @Autowired
    JobHistoryRepository jobHistoryRepository;
    @Autowired
    JobsRepository jobsRepository;
    @Autowired
    LocationsRepository locationsRepository;
    @Autowired
    RegionsRepository regionsRepository;

    public List<Employees> getAllEmployees() {
        return employeesRepo.findAll();
    }

    public void setEmployees(Employees employees) {
        employeesRepo.save(employees);
    }

    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }

    public void setCountries(Countries countries) {
        countriesRepository.save(countries);
    }

    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    public List<JobHistory> getAllJobHistory() {
        return jobHistoryRepository.findAll();
    }

    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }

    public List<Locations> getAllLocations() {
        return locationsRepository.findAll();
    }

    public List<Regions> getAllRegions() {
        return regionsRepository.findAll();
    }
}
