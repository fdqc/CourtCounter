package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_a_score)
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }

    /**
     * Add +3 to score of Team B
     */
    fun addThreeForTeamB(view : View){
        this.scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }

    /**
     * Add +2 to score of Team B
     */
    fun addTwoForTeamB(view : View){
        this.scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    /**
     * Add +1 to score of Team B
     */
    fun addOneForTeamB(view : View){
        this.scoreTeamB += 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Add +3 to score of Team A
     */
    fun addThreeForTeamA(view : View){
        this.scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }

    /**
     * Add +2 to score of Team A
     */
    fun addTwoForTeamA(view : View){
        this.scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }

    /**
     * Add +1 to score of Team A
     */
    fun addOneForTeamA(view : View){
        this.scoreTeamA += 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Reset All Scores
     */
    fun resetScores(view : View){
        this.scoreTeamA = 0
        this.scoreTeamB = 0

        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }
}
