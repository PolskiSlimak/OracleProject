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

    public void deleteEmployees(Long id) {
        employeesRepo.deleteById(id);
    }

    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }


    public void setCountries(Countries countries) {
        countriesRepository.save(countries);
    }

    public void deleteCountries(String id) {
        countriesRepository.deleteById(id);
    }

    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    public void setDepartments(Departments departments) {
        departmentsRepository.save(departments);
    }

    public void deleteDepartment(Long id) {
        departmentsRepository.deleteById(id);
    }

    public List<JobHistory> getAllJobHistory() {
        return jobHistoryRepository.findAll();
    }

    public void setJobHistory(JobHistory jobHistory) {
        jobHistoryRepository.save(jobHistory);
    }

    public void deleteJobHistory(JobHistoryId id) {
        jobHistoryRepository.deleteById(id);
    }


    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }

    public void setJobs(Jobs job) {
        jobsRepository.save(job);
    }

    public void deleteJobs(String id) {
        jobsRepository.deleteById(id);
    }

    public List<Locations> getAllLocations() {
        return locationsRepository.findAll();
    }

    public void setLocations(Locations locations) {
        locationsRepository.save(locations);
    }

    public void deleteLocations(Long id) {
        locationsRepository.deleteById(id);
    }

    public List<Regions> getAllRegions() {
        return regionsRepository.findAll();
    }

    public void setRegions(Regions regions) {
        regionsRepository.save(regions);
    }

    public void deleteRegions(Long id) {
        regionsRepository.deleteById(id);
    }
}
