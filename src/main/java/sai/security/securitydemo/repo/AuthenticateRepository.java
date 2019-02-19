package sai.security.securitydemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sai.security.securitydemo.Dto.Authenticate;

public interface AuthenticateRepository extends JpaRepository<Authenticate,Integer> {

    Authenticate findByName (String name);
}
