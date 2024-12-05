package com.prac.tacos.data;

import java.util.Optional;

import com.prac.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
  
}
