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

	@RequestMapping("/countries")
	public List<Countries> countries() {
		return entitiesService.getAllCountries();
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT)
	public void putCountries(@RequestBody Countries countries) {
		entitiesService.setCountries(countries);
	}

	@RequestMapping("/departments")
	public List<Departments> departments() {
		return entitiesService.getAllDepartments();
	}

	@RequestMapping("/jobhistory")
	public List<JobHistory> jobHistory() {
		return entitiesService.getAllJobHistory();
	}

	@RequestMapping("/jobs")
	public List<Jobs> jobs() {
		return entitiesService.getAllJobs();
	}

	@RequestMapping("/locations")
	public List<Locations> locations() {
		return entitiesService.getAllLocations();
	}

	@RequestMapping("/regions")
	public List<Regions> regions() {
		return entitiesService.getAllRegions();
	}
}
