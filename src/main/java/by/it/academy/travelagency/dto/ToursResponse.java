package by.it.academy.travelagency.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ToursResponse {
    private List<TourResponse> tours;
    private String metaInfo;
}
