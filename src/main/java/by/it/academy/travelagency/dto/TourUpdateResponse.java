package by.it.academy.travelagency.dto;

import by.it.academy.travelagency.entities.Tour;
import by.it.academy.travelagency.repositories.TourRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TourUpdateResponse {
    private TourRepository tourRepository;

    public Tour updateTour(TourRequest tourRequest, Tour tour) {
        Tour updatedTour = (Tour) tourRepository.findByTourName(tourRequest.getTourName());
        updatedTour.setTourName(tour.getTourName());
        updatedTour.setState(tour.getState());
        updatedTour.setHotel(tour.getHotel());
        updatedTour.setCost(tour.getCost());
        updatedTour.setAdditionalInformation(tour.getAdditionalInformation());
        tourRepository.save(updatedTour);
        return updatedTour;
    }
}
