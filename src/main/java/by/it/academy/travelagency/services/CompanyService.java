package by.it.academy.travelagency.services;

import by.it.academy.travelagency.dto.*;

import java.util.UUID;

public interface CompanyService {
    CompanyResponse getCompany(UUID id);
}
