package cn.edu.bupt.ch10_2_b.dao;


import cn.edu.bupt.ch10_2_b.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
