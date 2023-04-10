package by.it.academy.travelagency.controllers;

import by.it.academy.travelagency.dto.TourRequest;
import by.it.academy.travelagency.dto.TourResponse;
import by.it.academy.travelagency.services.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("tour")
@RequiredArgsConstructor
public class TourController {
    private final TourService tourServiceImpl;

    @GetMapping("{id}")
    public TourResponse getTour(@PathVariable UUID id) {
        return tourServiceImpl.getTour(id);
    }

    @GetMapping
    public List<TourResponse> getAllTours(@PageableDefault() Pageable pageable) {
        return tourServiceImpl.getAllTours(pageable);
    }

    @GetMapping("{tourName}")
    public List<TourResponse> getTourByTourName(@PathVariable String tourName) {
        return tourServiceImpl.getByNameTour(tourName);
    }

    @GetMapping("{state}")
    public List<TourResponse> getTourByState(@PathVariable String state) {
        return tourServiceImpl.getByState(state);
    }

    @GetMapping("{cost}")
    public List<TourResponse> getTourByHotel(@PathVariable int cost) {
        return tourServiceImpl.getByCost(String.valueOf(cost));
    }

    @PostMapping("create")
    public TourResponse createTour(@Validated @RequestBody TourRequest tourRequest) {
        return tourServiceImpl.createTour(tourRequest);
    }

    @PutMapping("update")
    public TourResponse updateTour(@Validated @RequestBody TourRequest tourRequest) {
        return tourServiceImpl.updateTour(tourRequest);
    }

    @DeleteMapping("remove/{id}")
    public void deleteTour(@PathVariable UUID id) throws ExecutionException {
        tourServiceImpl.deleteTour(id);
    }
}


