package sai.security.securitydemo.Dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "authenticate")
public class Authenticate {

    @Id
    private Integer id;
    private String name;
    private String passwd;


}
