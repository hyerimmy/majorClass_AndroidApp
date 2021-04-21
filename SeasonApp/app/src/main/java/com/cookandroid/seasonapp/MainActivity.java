package com.cookandroid.seasonapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 변수 선언
    TextView text1, text2, text3;
    EditText edit;
    RadioGroup rGroup1;
    RadioButton radioArray[] = new RadioButton[4];
    Button btnSelect;
    ImageView imgSeason;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("(5주차 과제) 사계절 사진 보기");

        // 위젯을 변수에 대입
        text1 = (TextView) findViewById(R.id.Text1);
        edit = (EditText) findViewById(R.id.ID);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        radioArray[0] = (RadioButton) findViewById(R.id.Rspring);
        radioArray[1] = (RadioButton) findViewById(R.id.Rsummer);
        radioArray[2] = (RadioButton) findViewById(R.id.Rfall);
        radioArray[3] = (RadioButton) findViewById(R.id.Rwinter);

        btnSelect = (Button) findViewById(R.id.BtnSelect);

        imgSeason = (ImageView) findViewById(R.id.ImgSeason);
        text3 = (TextView) findViewById(R.id.Text3);


        // 선택 버튼 클릭하면 이미지와 글씨 보이기
        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.Rspring:
                        imgSeason.setImageResource(R.drawable.spring);
                        text3.setText(edit.getText()+ "님은 " + "봄계절을 선택하셨습니다.");
                        imgSeason.setVisibility(android.view.View.VISIBLE);
                        text3.setVisibility(android.view.View.VISIBLE);
                        break;
                    case R.id.Rsummer:
                        imgSeason.setImageResource(R.drawable.summer);
                        text3.setText(edit.getText()+ "님은 " + "여름계절을 선택하셨습니다.");
                        imgSeason.setVisibility(android.view.View.VISIBLE);
                        text3.setVisibility(android.view.View.VISIBLE);
                        break;
                    case R.id.Rfall:
                        imgSeason.setImageResource(R.drawable.fall);
                        text3.setText(edit.getText()+ "님은 " + "가을계절을 선택하셨습니다.");
                        imgSeason.setVisibility(android.view.View.VISIBLE);
                        text3.setVisibility(android.view.View.VISIBLE);
                        break;
                    case R.id.Rwinter:
                        imgSeason.setImageResource(R.drawable.winter);
                        text3.setText(edit.getText()+ "님은 " + "겨울계절을 선택하셨습니다.");
                        imgSeason.setVisibility(android.view.View.VISIBLE);
                        text3.setVisibility(android.view.View.VISIBLE);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "선택된 것이 없습니다.",
                                Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}