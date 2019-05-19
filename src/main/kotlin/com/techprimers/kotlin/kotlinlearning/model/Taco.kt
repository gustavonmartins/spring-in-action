package com.techprimers.kotlin.kotlinlearning.model

import com.sun.istack.NotNull
import javax.persistence.*
import javax.validation.constraints.Size

@Entity
data class Taco(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private val id: Long,

        @NotNull
        @Size(min=5, message="Name must be at least 5 char long")
        val name: String,

        @ManyToMany(targetEntity = Ingredient::class)
        @Size(min=1, message="You must choose at least 1 ingredient")
        val ingredients: List<Ingredient>
)