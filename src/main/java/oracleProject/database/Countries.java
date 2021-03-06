package oracleProject.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Countries {
    @Id
    private String country_id;

    private String country_name;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "region_id")
    private Long region_id;
}
