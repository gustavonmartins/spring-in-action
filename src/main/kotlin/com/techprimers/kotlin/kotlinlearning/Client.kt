package com.techprimers.kotlin.kotlinlearning

import org.springframework.web.client.RestTemplate

import com.techprimers.kotlin.kotlinlearning.model.Ingredient

class Client

fun main(args: Array<String>) {
	postIngredient(Ingredient("qjo","queijo",Ingredient.Type.CHEESE))
	postIngredient(Ingredient("pao","paoo",Ingredient.Type.WRAP))
	postIngredient(Ingredient("sld","SALADA",Ingredient.Type.VEGGIES))

	println("querying...")
	println(getIngredient("qjo"))
	println("deleting and querying qjo...")
	deleteIngredient(Ingredient("qjo","queijo",Ingredient.Type.CHEESE))
	println(getIngredient("qjo"))
}

fun postIngredient(ingredient: Ingredient)=
		RestTemplate().postForObject("http://localhost:8080/ingredients",ingredient,Ingredient::class.java)

fun deleteIngredient(ingredient: Ingredient)=
		RestTemplate().delete("http://localhost:8080/ingredients/{id}",ingredient.id)

fun getIngredient(id: String): Ingredient?{
	return RestTemplate().getForObject("http://localhost:8080/ingredients/{id}",Ingredient::class.java,id)
}
