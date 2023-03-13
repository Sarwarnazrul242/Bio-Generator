package com.example.bioactivity


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BioActivity : AppCompatActivity() {

    private lateinit var bioText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        bioText = findViewById(R.id.bio_text)

        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val school = intent.getStringExtra("school")
        val graduationYear = intent.getStringExtra("graduation_year")
        val degree = intent.getStringExtra("degree")
        val major = intent.getStringExtra("major")
        val favoriteActivities = intent.getStringExtra("favorite_activities")

        val bio = "$firstName $lastName graduated in $graduationYear with a $degree in $major from $school. " +
                "Their favorite activities include $favoriteActivities."
        bioText.text = bio
    }
}
