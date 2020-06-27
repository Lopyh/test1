package myproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author paveldikin
 * @date 27.06.2020
 */
@Getter
@Setter
@Entity
public class Branches {
    @Id
    private Long id;
    private String title;
    private BigDecimal lon;
    private  BigDecimal lat;
    private String address;
}
