package e.caominhvuong.baitap01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.Tong);
        btn1=(Button) findViewById(R.id.Hieu);
        btn2=(Button) findViewById(R.id.Tich);
        btn3=(Button) findViewById(R.id.Thuong);
        btn4=(Button) findViewById(R.id.Uoc);
        btn5=(Button) findViewById(R.id.Thoat);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapa);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapb);
                int b=Integer.parseInt(editb.getText().toString()+"");
                int uoc;
                if(a==0 || b==0)
                    uoc= a+b;
                while (a!=b)
                {

                    if(a>b)
                        a=a-b;
                    else
                        b=b-a;
                }
                uoc=a;

                TextView tv=(TextView) findViewById(R.id.Ketqua);

                tv.setText(uoc+"");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapa);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapb);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int Thuong=a/b;

                TextView tv=(TextView) findViewById(R.id.Ketqua);

                tv.setText(Thuong+"");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapa);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapb);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int Tich=a*b;

                TextView tv=(TextView) findViewById(R.id.Ketqua);

                tv.setText(Tich+"");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapa);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapb);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int Hieu=a-b;

                TextView tv=(TextView) findViewById(R.id.Ketqua);

                tv.setText(Hieu+"");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapa);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapb);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int tong=a+b;

                TextView tv=(TextView) findViewById(R.id.Ketqua);

                tv.setText(tong+"");
            }
        });
    }
}
