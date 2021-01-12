package oracleProject.database;

import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter @Getter
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employee_id;

    String first_name;
    String last_name;
    String email;
    String phone_number;
    Date hire_date;
    String job_id;
    Float salary;
    Float commission_pct;
    Long manager_id;
    Long department_id;
}
