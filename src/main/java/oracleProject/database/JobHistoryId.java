package oracleProject.database;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@RequiredArgsConstructor
@Setter
@Getter
public class JobHistoryId implements Serializable {
    private Date start_date;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employeeId")
//    @JsonBackReference
    private Long employee_id;

}
