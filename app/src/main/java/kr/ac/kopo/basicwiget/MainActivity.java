package kr.ac.kopo.basicwiget;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textresult;
    Button btnreuslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);





        text1.setTextSize(20);
        text1.setTextColor(Color.CYAN);
        text1.setText("한국폴리텍대학");

        text2.setTextSize(30);
        text2.setTextColor(Color.MAGENTA);
        text2.setText("인공지능소프트웨어과");

        text3.setTextSize(10);
        text3.setText("SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성");
        text3.setSingleLine(false);

        edit1 = findViewById(R.id.edit1);
        textresult = findViewById(R.id.textresult);
        btnreuslt = findViewById(R.id.resultBtn);

        btnreuslt.setOnClickListener(btnListener);



    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String univName = edit1.getText().toString();
            textresult.setText((univName.isEmpty() ? "값이 입력되지 않았습니다. 다시 입력해주세요" : univName + "에 합격하셧습니다."));
            textresult.setTextColor(Color.rgb(11,23,44));


        }
    };
}