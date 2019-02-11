package com.example.gpa_sultanaa1_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    TextView result,course1,course2,course3,course4,course5,grade,credits;
    EditText grade1;
    EditText grade2;
    EditText grade3;
    EditText grade4;
    EditText grade5;
    EditText credit_hours1;
    EditText credit_hours2;
    EditText credit_hours3;
    EditText credit_hours4;
    EditText credit_hours5;
    Button compute_gpa;

    double gpa_result;
    int hour1, hour2, hour3, hour4, hour5;
    double g1,g2,g3,g4,g5,gc1,gc2,gc3,gc4,gc5,mul,sum_of_credit_hours;
    double g1f,g2f,g3f,g4f,g5f;
    String grade1_text, grade2_text, grade3_text, grade4_text, grade5_text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //background color
        final View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.white);



        result = (TextView)findViewById(R.id.result);
        grade = (TextView)findViewById(R.id.grade);
        credits = (TextView)findViewById(R.id.credits);
        course1 = (TextView)findViewById(R.id.course1);
        course2 = (TextView)findViewById(R.id.course2);
        course3 = (TextView)findViewById(R.id.course3);
        course4 = (TextView)findViewById(R.id.course4);
        course5 = (TextView)findViewById(R.id.course5);


//        grade2 = (EditText)findViewById(R.id.grade2);
//        grade3 = (EditText)findViewById(R.id.grade3);
//        grade4 = (EditText)findViewById(R.id.grade4);
//        grade5 = (EditText)findViewById(R.id.grade5);

        credit_hours1 = (EditText) findViewById(R.id.credit_hours1);
        credit_hours2 = (EditText)findViewById(R.id.credit_hours2);
        credit_hours3 = (EditText)findViewById(R.id.credit_hours3);
        credit_hours4 = (EditText)findViewById(R.id.credit_hours4);
        credit_hours5 = (EditText)findViewById(R.id.credit_hours5);

//        compute_gpa = (Button)findViewById(R.id.compute_gpa);
        compute_gpa = findViewById(R.id.compute_gpa);






        compute_gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (credit_hours1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                }else
                if (credit_hours2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                }else
                if (credit_hours3.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                }else
                if (credit_hours4.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                }else
                if (credit_hours5.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                    return;
                }
                       else
                           {

                    hour1 = Integer.parseInt(credit_hours1.getText().toString());
                    hour2 = Integer.parseInt(credit_hours2.getText().toString());
                    hour3 = Integer.parseInt(credit_hours3.getText().toString());
                    hour4 = Integer.parseInt(credit_hours4.getText().toString());
                    hour5 = Integer.parseInt(credit_hours5.getText().toString());

                    sum_of_credit_hours = hour1 + hour2 + hour3 + hour4 + hour5;

                    // grade1 = (EditText)findViewById(R.id.grade1);
                    grade1_text = ((EditText) findViewById(R.id.grade1)).getText().toString();
                    grade2_text = ((EditText) findViewById(R.id.grade2)).getText().toString();
                    grade3_text = ((EditText) findViewById(R.id.grade3)).getText().toString();
                    grade4_text = ((EditText) findViewById(R.id.grade4)).getText().toString();
                    grade5_text = ((EditText) findViewById(R.id.grade5)).getText().toString();
//

                               if (grade1_text.equals("")) {
                                   Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                               }else
                               if (grade2_text.equals("")) {
                                   Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                               }else
                               if (grade3_text.equals("")) {
                                   Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                               }else
                               if (grade4_text.equals("")) {
                                   Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                               }else
                               if (grade5_text.equals("")) {
                                   Toast.makeText(getApplicationContext(), "PLEASE DONOT LEAVE EMPTY FIELDS", Toast.LENGTH_SHORT).show();
                                   return;
                               }
                               else
                               {

//
                    double subject_grade1 = 0;

                    switch (grade1_text) {
                        case "A+":
                            subject_grade1 = 4.0;
                            break;
                        case "A-":
                            subject_grade1 = 3.75;
                            break;
                        case "A":
                            subject_grade1 = 4.00;
                            break;
                        case "B+":
                            subject_grade1 = 3.25;
                            break;
                        case "B":
                            subject_grade1 = 3.00;
                            break;
                        case "B-":
                            subject_grade1 = 2.75;
                            break;
                        case "C+":
                            subject_grade1 = 2.00;
                            break;
                        case "C":
                            subject_grade1 = 2.00;
                            break;
                        case "C-":
                            subject_grade1 = 1.75;
                            break;
                        case "D":
                            subject_grade1 = 1.00;
                            break;
                        case "F":
                            subject_grade1 = 0.00;
                            break;

                    }


                    double subject_grade2 = 0;

                    switch (grade2_text) {
                        case "A+":
                            subject_grade2 = 4.0;
                            break;
                        case "A-":
                            subject_grade2 = 3.75;
                            break;
                        case "A":
                            subject_grade2 = 4.00;
                            break;
                        case "B+":
                            subject_grade2 = 3.25;
                            break;
                        case "B":
                            subject_grade2 = 3.00;
                            break;
                        case "B-":
                            subject_grade2 = 2.75;
                            break;
                        case "C+":
                            subject_grade2 = 2.00;
                            break;
                        case "C":
                            subject_grade2 = 2.00;
                            break;
                        case "C-":
                            subject_grade2 = 1.75;
                            break;
                        case "D":
                            subject_grade2 = 1.00;
                            break;
                        case "F":
                            subject_grade2 = 0.00;
                            break;

                    }

                    double subject_grade3 = 0;

                    switch (grade3_text) {
                        case "A+":
                            subject_grade3 = 4.0;
                            break;
                        case "A-":
                            subject_grade3 = 3.75;
                            break;
                        case "A":
                            subject_grade3 = 4.00;
                            break;
                        case "B+":
                            subject_grade3 = 3.25;
                            break;
                        case "B":
                            subject_grade3 = 3.00;
                            break;
                        case "B-":
                            subject_grade3 = 2.75;
                            break;
                        case "C+":
                            subject_grade3 = 2.00;
                            break;
                        case "C":
                            subject_grade3 = 2.00;
                            break;
                        case "C-":
                            subject_grade3 = 1.75;
                            break;
                        case "D":
                            subject_grade3 = 1.00;
                            break;
                        case "F":
                            subject_grade3 = 0.00;
                            break;

                    }
                    double subject_grade4 = 0;

                    switch (grade4_text) {
                        case "A+":
                            subject_grade4 = 4.0;

                            break;
                        case "A-":
                            subject_grade4 = 3.75;
                            break;
                        case "A":
                            subject_grade4 = 4.00;
                            break;
                        case "B+":
                            subject_grade4 = 3.25;
                            break;
                        case "B":
                            subject_grade4 = 3.00;
                            break;
                        case "B-":
                            subject_grade4 = 2.75;
                            break;
                        case "C+":
                            subject_grade4 = 2.00;
                            break;
                        case "C":
                            subject_grade4 = 2.00;
                            break;
                        case "C-":
                            subject_grade4 = 1.75;
                            break;
                        case "D":
                            subject_grade4 = 1.00;
                            break;
                        case "F":
                            subject_grade4 = 0.00;
                            break;

                    }
                    double subject_grade5 = 0;

                    switch (grade5_text) {
                        case "A+":
                            subject_grade5 = 4.0;
                            break;
                        case "A-":
                            subject_grade5 = 3.75;
                            break;
                        case "A":
                            subject_grade5 = 4.00;
                            break;
                        case "B+":
                            subject_grade5 = 3.25;
                            break;
                        case "B":
                            subject_grade5 = 3.00;
                            break;
                        case "B-":
                            subject_grade5 = 2.75;
                            break;
                        case "C+":
                            subject_grade5 = 2.00;
                            break;
                        case "C":
                            subject_grade5 = 2.00;
                            break;
                        case "C-":
                            subject_grade5 = 1.75;
                            break;
                        case "D":
                            subject_grade5 = 1.00;
                            break;
                        case "F":
                            subject_grade5 = 0.00;
                            break;

                    }
                    //

                    // g1f= Double.parseDouble(String.valueOf(g1f));
                    //g2f= Double.parseDouble(String.valueOf(g2f));
                    //g3f= Double.parseDouble(String.valueOf(g3f));
                    // g4f= Double.parseDouble(String.valueOf(g4f));
                    // g5f= Double.parseDouble(String.valueOf(g5f));


                    // g1 = Integer.parseInt(g1f.getText().toString());
                    // g2 = Integer.parseInt(grade2.getText().toString());
                    //  g3 = Integer.parseInt(grade3.getText().toString());
                    // g4 = Integer.parseInt(grade4.getText().toString());
                    //  g5 = Integer.parseInt(grade5.getText().toString());

                    gc1 = subject_grade1 * hour1;
                    gc2 = subject_grade2 * hour1;
                    gc3 = subject_grade3 * hour1;
                    gc4 = subject_grade4 * hour1;
                    gc5 = subject_grade5 * hour1;
//                gc2 = g2f * hour2;
//                gc3 = g3f* hour3;
//                gc4 = g4f * hour4;
//                gc5 = g5f * hour5;


                    mul = gc1 + gc2 + gc3 + gc4 + gc5;

                    gpa_result = mul / sum_of_credit_hours;

                    result.setText(String.valueOf(gpa_result));


                    if (gpa_result <= 2.4) {

                        view.setBackgroundResource(R.color.red);

                    } else if (gpa_result <= 3.2) {

                        view.setBackgroundResource(R.color.yellow);

                    } else if (gpa_result > 3.2) {

                        view.setBackgroundResource(R.color.green);

                    }

                }}
            }
        });





    }
}
