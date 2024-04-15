package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Company;
import codoacodo.vuelosapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public Optional<Company> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    public Optional<Company> updateCompany(Company company) {
        companyRepository.save(company);
        return companyRepository.findById(company.getId());
    }
}
