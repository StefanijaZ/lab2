package mk.ukim.finki.emt.lab.repository;


import mk.ukim.finki.emt.lab.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {


}
