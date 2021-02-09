package oracleProject.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Jobs {
    @Id
    private String job_id;

    private String job_title;
    private Long min_salary;
    private Long max_salary;
}
