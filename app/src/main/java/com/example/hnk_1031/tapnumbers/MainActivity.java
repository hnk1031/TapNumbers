package com.example.hnk_1031.tapnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //問題となる数字が入る配列
    int[] hairetu;

    //実際に表示させる問題の文字列
    String mondai;

    //4桁のうち今何桁目を解答しているのかを覚えておく変数
    int seikai;

    //問題を表示させるTextView
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //関連付け
        textView=(TextView)findViewById(R.id.textView);

        start();
    }

    public void start(){

        //ランダムな4つの数字をhairetuに入れる
        hairetu=new int[4];
        Random random=new Random();
        hairetu[0]= random.nextInt(4) + 1;
        hairetu[1]= random.nextInt(4) + 1;
        hairetu[2]= random.nextInt(4) + 1;
        hairetu[3]= random.nextInt(4) + 1;

        //数字の表示
        mondai=
                Integer.toString(hairetu[0])
                + Integer.toString(hairetu[1])
                + Integer.toString(hairetu[2])
                + Integer.toString(hairetu[3]);
        textView.setText(mondai);
        seikai=0;
    }

    //1を押した時の処理
    public void number1(View v){
        if (hairetu[seikai]==1){
            mondai=mondai.substring(1);
            textView.setText(mondai);
            seikai=seikai+1;

            if (seikai == 4){
                start();
            }
        } else {
            Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show();
        }
    }

    //2を押した時の処理
    public void number2(View v){
        if (hairetu[seikai]==2){
            mondai=mondai.substring(1);
            textView.setText(mondai);
            seikai=seikai+1;

            if (seikai == 4){
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！", Toast.LENGTH_SHORT).show();
        }

    }

    //3を押した時の処理
    public void number3(View v){
        if (hairetu[seikai]==3){
            mondai=mondai.substring(1);
            textView.setText(mondai);
            seikai=seikai+1;

            if (seikai == 4){
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！", Toast.LENGTH_SHORT).show();
        }

    }

    //4を押した時の処理
    public void number4(View v){
        if (hairetu[seikai]==4){
            mondai=mondai.substring(1);
            textView.setText(mondai);
            seikai=seikai+1;

            if (seikai == 4){
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！", Toast.LENGTH_SHORT).show();
        }
    }
}
