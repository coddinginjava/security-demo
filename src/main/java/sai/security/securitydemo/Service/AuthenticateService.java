package sai.security.securitydemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sai.security.securitydemo.Config.AuthicatetionPPL;
import sai.security.securitydemo.Dto.Authenticate;
import sai.security.securitydemo.repo.AuthenticateRepository;

@Service
public  class AuthenticateService implements UserDetailsService {

    @Autowired
    private AuthenticateRepository authenticateRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Authenticate user = authenticateRepository.findByName(s);

        if(user==null){
            throw  new UsernameNotFoundException("user not found 404");
        }

        return new AuthicatetionPPL(user);
    }
}
