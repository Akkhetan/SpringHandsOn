package com.prac.tacos.data;

import java.util.Optional;

import com.prac.tacos.Ingredient;
import com.prac.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
