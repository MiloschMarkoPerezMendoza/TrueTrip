package backend.truetrip.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="plans")

public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date arrivalDate;
    private Date departureDate;
    private Double cost;
    private Integer maxParticipants;

    /*@OneToMany(mappedBy = "plan")
    private List<Trip> trips;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;*/


}
