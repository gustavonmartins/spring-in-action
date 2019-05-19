package com.techprimers.kotlin.kotlinlearning.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Ingredient(
        @Id
        val id: String,

        val name: String="",

        val type: Type=Type.CHEESE
){
    enum class Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}