package by.it.academy.travelagency.services;

import by.it.academy.travelagency.dto.TourRequest;
import by.it.academy.travelagency.dto.TourResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public interface TourService {

    List<TourResponse> getByNameTour(String nameTour);

    List<TourResponse> getByCost(String hotel);

    List<TourResponse> getByState(String state);

    TourResponse getTour(UUID id);

    List<TourResponse> getAllTours(Pageable pageable);

    TourResponse createTour(TourRequest tourRequest);

    TourResponse updateTour(TourRequest tourRequest);

    void deleteTour(UUID id) throws RuntimeException, ExecutionException;
}
