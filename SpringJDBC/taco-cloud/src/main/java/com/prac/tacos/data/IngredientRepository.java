package com.prac.tacos.data;

import java.util.Optional;

import com.prac.tacos.Ingredient;

public interface IngredientRepository {

  Iterable<Ingredient> findAll();
  
  Optional<Ingredient> findById(String id);
  
  Ingredient save(Ingredient ingredient);
  
}
