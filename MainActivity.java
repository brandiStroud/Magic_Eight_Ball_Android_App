package com.brandistroud.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView answerTextView;
    private Button enterButton;
    private EditText usersQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTextView = findViewById(R.id.answerTextView);
        enterButton = findViewById(R.id.enterButton);
        usersQuestion = findViewById(R.id.questionInput);
    }

    public void clickedEnterButton(View view) {
        String question = String.valueOf(usersQuestion.getText());
        if(question.length() > 0) {
            String response = getAnswer(answers());
            answerTextView.setText(response + " Ask another question!");
            Toast.makeText(this, response, Toast.LENGTH_LONG).show();
        } else {
            answerTextView.setText("Make sure you ask a question before you enter!");
        }
    }

    private String getAnswer(String[] answers){
        int index = (int) (Math.random() * answers.length);
        return answers[index];
    }

    private String[] answers(){
        String[] answers = {
                "Yes.",
                "Definitely!",
                "No.",
                "Maybe..., if you're lucky.",
                "Not even close!",
                "You wish!",
                "Not in your wildest dreams.",
                "Why are you even asking?",
                "More than likely.",
                "I'm not sure, so be careful.",
                "Hmm... I don't know.",
                "The future is unclear.",
                "I will have to say absolutely."
                };
        return answers;
    }
}
