package oracleProject.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class JobHistory {
    @EmbeddedId
    private JobHistoryId jobHistoryId;

    private Date end_date;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "job_id")
    private String job_id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "department_id")
    private Long department_id;
}
