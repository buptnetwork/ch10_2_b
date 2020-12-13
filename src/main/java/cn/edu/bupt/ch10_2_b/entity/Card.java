package cn.edu.bupt.ch10_2_b.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String no;
    private BigDecimal balance;

    @OneToOne
    @JsonIgnore
    private Student student;

}
