package com.example.computer.uknowmusic;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class gameActivity extends AppCompatActivity {

    //Explicit
    Button btn1, btn2, btn3, btn4;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง
    int questionCount = 10; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปร qId เป็นตัวแปรชนิดอะเรย์แบบสุ่มคำถาม
    String answer;
    int score = 0;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view ผูกเอริเม้นบนตัวแปร
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        volumnImageButton = findViewById(R.id.imbVolumn);
    }
    {
        //แสดงค่าถ่ม
        for (int i=1; i<=questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้คำถามเป็นแบบสุ่ม
        setQuestion(qID.remove(0));
    }//end onCreate Method

    private void setQuestion(int qID ) { //ใน method ทำหน้าที่กำหนดข้อคำถามและเฉลยในแต่ละข้อ

        if (qID == 1) {
            answer = "as if your last";
            mediaPlayer = MediaPlayer.create(this, R.raw.asifityourlast);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("as if your last");
            choice.add("empty");
            choice.add("give love");
            choice.add("ko ko bop");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        if (qID ==2){
            answer = "beautiful";
            mediaPlayer = MediaPlayer.create(this, R.raw.beautiful);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("beautiful");
            choice.add("don't go");
            choice.add("monster");
            choice.add("two hundred");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }


        if (qID ==3){
            answer = "ko ko bop";
            mediaPlayer = MediaPlayer.create(this, R.raw.kokobop);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ko ko bop");
            choice.add("as if your last");
            choice.add("give love");
            choice.add("don't go");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==4){
            answer = "empty";
            mediaPlayer = MediaPlayer.create(this, R.raw.empty);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("empty");
            choice.add("monster");
            choice.add("beautiful");
            choice.add("different");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==5){
            answer = "monster";
            mediaPlayer = MediaPlayer.create(this, R.raw.monster);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("monster");
            choice.add("empty");
            choice.add("best luck");
            choice.add("ko ko bop");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==6){
            answer = "give love";
            mediaPlayer = MediaPlayer.create(this, R.raw.givelove);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("give love");
            choice.add("as if your last");
            choice.add("don't go");
            choice.add("two hundred");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==7){
            answer = "two hundred";
            mediaPlayer = MediaPlayer.create(this, R.raw.twohundred);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("two hundred");
            choice.add("give love");
            choice.add("ko ko bop");
            choice.add("beautiful");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==8){
            answer = "don't go";
            mediaPlayer = MediaPlayer.create(this, R.raw.dontgo);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("don't go");
            choice.add("ko ko bop");
            choice.add("give love");
            choice.add("empty");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==9){
            answer = "best luck";
            mediaPlayer = MediaPlayer.create(this, R.raw.bestluck);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("best luck");
            choice.add("as if your last");
            choice.add("best luck");
            choice.add("monster");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==10){
            answer = "different";
            mediaPlayer = MediaPlayer.create(this,R.raw.different);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("different");
            choice.add("beautiful");
            choice.add("two hundred");
            choice.add("ko ko bop");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }


    }// end setquestion Method

    public void choiceAns (View view) {

        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }

        if (qID.isEmpty()) { //ถ้าทำครบทุกข้อ นั่นคือ qID เป็นค่าว่าง
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString);// เรียก method dialogboxScore() สำหรับแสดงคะแนน
        }else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));// เรียก medthod setQuestion() สำหรับแสดงคำถามถัดไป
        }

    }// end choiceAns Method

    private void dialogboxScore(String name) {//method สำหรับแสดงคะแนน

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage(name +"ได้คะแนน " + score+ " คะแนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();//ปิดแอคติวิตี้เพื่ออกจากแอพ
                    }
                })
                .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }//end dialogboxScore Method


    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }//end playSound Method




}// end Class








