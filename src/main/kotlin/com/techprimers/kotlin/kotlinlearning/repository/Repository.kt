package com.techprimers.kotlin.kotlinlearning.repository

import com.techprimers.kotlin.kotlinlearning.model.Ingredient
import com.techprimers.kotlin.kotlinlearning.model.Order
import com.techprimers.kotlin.kotlinlearning.model.Taco
import org.springframework.data.repository.CrudRepository

interface IngredientRepository: CrudRepository<Ingredient, String>
interface TacoRepository: CrudRepository<Taco, Long>
interface OrderRepository: CrudRepository<Order, Long>