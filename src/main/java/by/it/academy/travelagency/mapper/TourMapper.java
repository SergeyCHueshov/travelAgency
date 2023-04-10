package by.it.academy.travelagency.mapper;

import by.it.academy.travelagency.dto.TourRequest;
import by.it.academy.travelagency.dto.TourResponse;
import by.it.academy.travelagency.entities.Tour;
import org.springframework.stereotype.Component;

@Component
public class TourMapper{
    public TourResponse buildTourResponse (Tour tour){
        return TourResponse.builder()
                .id(tour.getId())
                .state(tour.getState())
                .hotel(tour.getHotel())
                .cost(tour.getCost())
                .additionalInformation(tour.getAdditionalInformation())
                .build();
    }

    public Tour buildTour(TourRequest tourRequest){
        return Tour.builder()
                .state(tourRequest.getState())
                .hotel(tourRequest.getHotel())
                .cost(tourRequest.getCost())
                .additionalInformation(tourRequest.getAdditionalInformation())
                .build();
    }

}
