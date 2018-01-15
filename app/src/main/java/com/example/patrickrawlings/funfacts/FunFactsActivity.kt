package com.example.patrickrawlings.funfacts

import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class FunFactsActivity : AppCompatActivity() {

//    private val factBook = FactBook()
    // Declare our View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        factTextView  = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        showFactButton!!.setOnClickListener {
            val facts = arrayOf(
                    "Ants stretch when they wake up in the morning.",
                    "Ostriches can run faster than horses.",
                    "Olympic gold medals are actually made mostly of silver.",
                    "You are born with 300 bones; by the time you are an adult you will have 206.",
                    "It takes about 8 minutes for light from the Sun to reach Earth.",
                    "Some bamboo plants can grow almost a meter in just one day.",
                    "The state of Florida is bigger than England.",
                    "Some penguins can leap 2-3 meters out of the water.",
                    "On average, it takes 66 days to form a new habit.",
                    "Mammoths still walked the earth when the Great Pyramid was being built.")
            // The button was clicked, so update the fact TextView with a new fact
            // Randomly select a fact
            val randomGenerator = Random()
            val randomNumber = randomGenerator.nextInt(facts.size)
            val fact = facts[randomNumber]//            val fact = factBook.getFact()

            // Update the screen with our new fact
            factTextView!!.text = fact
        }

    }
}
