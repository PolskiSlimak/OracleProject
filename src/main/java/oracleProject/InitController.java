package oracleProject;

import oracleProject.database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InitController {
	@Autowired
	EntitiesService entitiesService;

	@RequestMapping("/employees")
	public List<Employees> employees() {
		return entitiesService.getAllEmployees();
	}

	@RequestMapping(value = "/employees", method = RequestMethod.PUT)
	public void putEmployees(@RequestBody Employees employees) {
		entitiesService.setEmployees(employees);
	}

	@RequestMapping(value = "/employeesD", method = RequestMethod.PUT)
	public void putEmployeesD(@RequestBody Long id) {
		entitiesService.deleteEmployees(id);
	}

	@RequestMapping("/countries")
	public List<Countries> countries() {
		return entitiesService.getAllCountries();
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT)
	public void putCountries(@RequestBody Countries countries) {
		entitiesService.setCountries(countries);
	}

	@RequestMapping(value = "/countriesD", method = RequestMethod.PUT)
	public void putCountriesD(@RequestBody String id) {
		entitiesService.deleteCountries(id);
	}

	@RequestMapping("/departments")
	public List<Departments> departments() {
		return entitiesService.getAllDepartments();
	}

	@RequestMapping(value = "/departments", method = RequestMethod.PUT)
	public void putDepartments(@RequestBody Departments departments) {
		entitiesService.setDepartments(departments);
	}

	@RequestMapping(value = "/departmentsD", method = RequestMethod.PUT)
	public void putDepartmentsD(@RequestBody Long id) {
		entitiesService.deleteDepartment(id);
	}

	@RequestMapping("/jobhistory")
	public List<JobHistory> jobHistory() {
		return entitiesService.getAllJobHistory();
	}

	@RequestMapping(value = "/jobhistory", method = RequestMethod.PUT)
	public void putJobHistory(@RequestBody JobHistory jobHistory) {
		entitiesService.setJobHistory(jobHistory);
	}

	@RequestMapping(value = "/jobhistoryD", method = RequestMethod.PUT)
	public void putJobsHistoryD(@RequestBody JobHistoryId id) {
		entitiesService.deleteJobHistory(id);
	}

	@RequestMapping("/jobs")
	public List<Jobs> jobs() {
		return entitiesService.getAllJobs();
	}

	@RequestMapping(value = "/jobs", method = RequestMethod.PUT)
	public void putJobs(@RequestBody Jobs job) {
		entitiesService.setJobs(job);
	}

	@RequestMapping(value = "/jobsD", method = RequestMethod.PUT)
	public void putJobsD(@RequestBody String id) {
		entitiesService.deleteJobs(id);
	}

	@RequestMapping("/locations")
	public List<Locations> locations() {
		return entitiesService.getAllLocations();
	}

	@RequestMapping(value = "/locations", method = RequestMethod.PUT)
	public void putLocations(@RequestBody Locations locations) {
		entitiesService.setLocations(locations);
	}

	@RequestMapping(value = "/locationsD", method = RequestMethod.PUT)
	public void putLocationsD(@RequestBody Long id) {
		entitiesService.deleteLocations(id);
	}

	@RequestMapping("/regions")
	public List<Regions> regions() {
		return entitiesService.getAllRegions();
	}

	@RequestMapping(value = "/regions", method = RequestMethod.PUT)
	public void putRegions(@RequestBody Regions regions) {
		entitiesService.setRegions(regions);
	}

	@RequestMapping(value = "/regionsD", method = RequestMethod.PUT)
	public void putRegionsD(@RequestBody Long id) {
		entitiesService.deleteRegions(id);
	}
}
