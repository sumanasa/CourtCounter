package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int A = 0;
    int B = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addthreeA(View v) {
        A=A+3;

        if(A>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamA(A);

   }
    public void addthreeB(View v) {
        B=B+3;
        if(B>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamB(B);
    } public void addtwoA(View v) {
        A=A+2;

        if(A>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamA(A);
    } public void addtwoB(View v) {

        B=B+2;
        if(B>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamB(B);
    } public void freethrowA(View v) {

        A=A+1;
        if(A>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamA(A);
    } public void freethrowB(View v) {

        B=B+1;
        if(B>=26)
        {
            A=0;B=0;
            displayForTeamA(A);
            displayForTeamB(B);
        }
        else
            displayForTeamB(B);
    }
    public void reset(View v) {
        A=0;B=0;
        displayForTeamA(A);
        displayForTeamB(B);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
