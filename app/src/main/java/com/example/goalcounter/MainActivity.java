package com.example.goalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score,scoreb;
    public void Reseting(View view){
        score = 0;
        displayForTeamA(score);

        scoreb = 0;
        displayForTeamB(scoreb);

    }
    public void scoreThree(View view){

        score = score+3;

        displayForTeamA(score);
    }
    public void scoreTwo(View view){
        score = score +2;
        displayForTeamA(score);
    }
    public void scoreOne(View view){
        score = score +1;
        displayForTeamA(score);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void scoreThreeB(View view){

        scoreb = scoreb+3;

        displayForTeamB(scoreb);
    }
    public void scoreTwoB(View view){
        scoreb = scoreb +2;
        displayForTeamB(scoreb);
    }
    public void scoreOneB(View view){
        scoreb = scoreb +1;
        displayForTeamB(scoreb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int scoreb) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreb));
    }
}