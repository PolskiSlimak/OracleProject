package oracleProject.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Departments {
    @Id
    private Long department_id;

    private String department_name;
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "manager_id")
    private Long manager_id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "location_id")
    private Long location_id;
}
