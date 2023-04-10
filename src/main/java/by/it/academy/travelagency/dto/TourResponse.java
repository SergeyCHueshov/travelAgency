package by.it.academy.travelagency.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TourResponse {
    private UUID id;

    private String tourName;

    private String state;

    private String hotel;

    private int cost;

    private String additionalInformation;
}
