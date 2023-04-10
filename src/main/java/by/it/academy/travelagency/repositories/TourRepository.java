package by.it.academy.travelagency.repositories;

import by.it.academy.travelagency.entities.Tour;
import by.it.academy.travelagency.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TourRepository extends JpaRepository<Tour, UUID> {
    List<Tour> findByState(String state);

    List<Tour> findByHotel(String hotel);

    List<Tour> findByTourName(String nameTour);
}
