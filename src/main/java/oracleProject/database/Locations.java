package oracleProject.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Locations {
    @Id
    private Long location_id;

    private String street_address;
    private String postal_code;
    private String city;
    private String state_province;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "country_id")
    private String country_id;
}
