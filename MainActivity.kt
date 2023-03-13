package com.example.bioactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var firstNameInput: EditText
    private lateinit var lastNameInput: EditText
    private lateinit var schoolInput: EditText
    private lateinit var graduationYearInput: EditText
    private lateinit var degreeInput: EditText
    private lateinit var majorInput: EditText
    private lateinit var favoriteActivitiesInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameInput = findViewById(R.id.first_name)
        lastNameInput = findViewById(R.id.last_name)
        schoolInput = findViewById(R.id.school)
        graduationYearInput = findViewById(R.id.year_of_graduation)
        degreeInput = findViewById(R.id.degree)
        majorInput = findViewById(R.id.major)
        favoriteActivitiesInput = findViewById(R.id.favorite_activities)
        submitButton = findViewById(R.id.submit_button)

        submitButton.setOnClickListener {
            val firstName = firstNameInput.text.toString()
            val lastName = lastNameInput.text.toString()
            val school = schoolInput.text.toString()
            val graduationYear = graduationYearInput.text.toString()
            val degree = degreeInput.text.toString()
            val major = majorInput.text.toString()
            val favoriteActivities = favoriteActivitiesInput.text.toString()

            val intent = Intent(this, BioActivity::class.java)
            intent.putExtra("first_name", firstName)
            intent.putExtra("last_name", lastName)
            intent.putExtra("school", school)
            intent.putExtra("graduation_year", graduationYear)
            intent.putExtra("degree", degree)
            intent.putExtra("major", major)
            intent.putExtra("favorite_activities", favoriteActivities)
            startActivity(intent)
        }
    }
}
