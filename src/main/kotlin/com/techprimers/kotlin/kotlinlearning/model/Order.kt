package com.techprimers.kotlin.kotlinlearning.model


import javax.persistence.*

@Entity
@Table(name="Taco_Order")
data class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @ManyToMany(targetEntity = Taco::class)
        var tacos: MutableList<Taco>
)