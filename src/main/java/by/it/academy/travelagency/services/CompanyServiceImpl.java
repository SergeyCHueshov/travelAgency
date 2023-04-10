package by.it.academy.travelagency.services;

import by.it.academy.travelagency.configs.CompanyProperties;
import by.it.academy.travelagency.dto.CompanyResponse;
import by.it.academy.travelagency.mapper.CompanyMapper;
import by.it.academy.travelagency.repositories.CompanyRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Data
@Slf4j
@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyProperties companyProperties;
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    private by.it.academy.travelagency.dto.CompanyResponse CompanyResponse;

    @Override
    public CompanyResponse getCompany(UUID id) {
        String officialStateRegistrationNumber = companyProperties.getOfficialStateRegistrationNumber();
        if (officialStateRegistrationNumber.isEmpty()) {
            log.info("There is no such company");
        } else {
            return companyRepository.findById(id)
                    .map(companyMapper::buildCompanyResponse)
                    .orElseThrow(() -> new RuntimeException(String.format("Cannot find Company with id %s", id)));
        }
        return CompanyResponse;
    }
}
