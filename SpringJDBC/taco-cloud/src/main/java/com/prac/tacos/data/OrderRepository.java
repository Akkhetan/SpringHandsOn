package com.prac.tacos.data;

import java.util.Optional;

import com.prac.tacos.TacoOrder;

public interface OrderRepository {

  TacoOrder save(TacoOrder order);

  Optional<TacoOrder> findById(Long id);

}
