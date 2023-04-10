package by.it.academy.travelagency.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "COMPANIES")
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "COMPANY_NAME", nullable = false, length = 40)
    private String companyName;

    @Column(name = "SINGLE_REGISTRATION_NUMBER", nullable = false, length = 40)
    private String officialStateRegistrationNumber;

}
