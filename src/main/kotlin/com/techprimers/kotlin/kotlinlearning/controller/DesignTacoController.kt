package com.techprimers.kotlin.kotlinlearning.controller

import com.techprimers.kotlin.kotlinlearning.model.Ingredient
import com.techprimers.kotlin.kotlinlearning.model.Taco
import com.techprimers.kotlin.kotlinlearning.repository.IngredientRepository
import com.techprimers.kotlin.kotlinlearning.repository.TacoRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
class DesignTacoController (private val tacoRepo: TacoRepository, private val ingredientRepo: IngredientRepository){

    @GetMapping(path=["/ingredients"])
    fun getIngredients()=ingredientRepo.findAll()

    @GetMapping(path=["/ingredients/{id}"])
    fun getSpecificIngredient(@PathVariable("id") id: String)=ingredientRepo.findById(id)

    @DeleteMapping(path=["/ingredients/{id}"])
    fun deleteSpecificIngredient(@PathVariable("id") id: String)=ingredientRepo.deleteById(id)

    @PostMapping(path=["/ingredients"])
    @ResponseStatus(HttpStatus.CREATED)
    fun postIngredient(@RequestBody ingredient: Ingredient)=ingredientRepo.save(ingredient)
}