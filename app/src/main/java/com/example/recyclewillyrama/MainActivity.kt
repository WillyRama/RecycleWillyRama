package com.example.recyclewillyrama


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.captain,
                "Captain",
                "Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
            Superhero(
                R.drawable.black,
                "Black widow",
                " Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
            Superhero(
                R.drawable.captain,
                "Captain",
                "Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
            Superhero(
                R.drawable.captain,
                "Captain",
                "Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
            Superhero(
                R.drawable.captain,
                "Captain",
                "Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
            Superhero(
                R.drawable.captain,
                "Captain",
                "Salah satu superhero di Comic terbitan Marvel Cinematic Universe"
            ),
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}