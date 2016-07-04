package com.dutt.rishabh.calculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;






public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btndot,btnadd,btnsub,btnmul,btndiv,btnC,btneq,btnmod,btnpow,btnexp,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    public static TextView t,p;
    boolean add,sub,mul,div,mod,pow,sin,arcsin,arctan,tan,cos,arccos,fac,root,log,ln,exp;
    Double a,b,result;
    int x,r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);
        btnadd=(Button)findViewById(R.id.badd);
        btnsub=(Button)findViewById(R.id.bminus);
        btnmul=(Button)findViewById(R.id.bmul);
        btndiv=(Button)findViewById(R.id.bdiv);
        btnC=(Button)findViewById(R.id.btnclear);
        btndot=(Button)findViewById(R.id.bdot);
        btneq=(Button)findViewById(R.id.bequal);
        btnmod=(Button)findViewById(R.id.btnmod);
        btnpow=(Button)findViewById(R.id.btnpow);
        btnexp=(Button)findViewById(R.id.btnexp);
        t=(TextView)findViewById(R.id.t1);
        p=(TextView)findViewById(R.id.t2);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               t.setText(t.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(t.getText().equals("")){
                   Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
               }else {

                   a = Double.parseDouble(t.getText() + "");
                   add = true;
                   t.setText(null);
                   p.setText(btnadd.getText());
               }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    t.setText("-");
                }
                else{

                a=Double.parseDouble(t.getText() + "");
                sub=true;
                t.setText(null);
                p.setText(btnsub.getText());}
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }else{

                a=Double.parseDouble(t.getText() + "");
                mul=true;
                t.setText(null);
                p.setText(btnmul.getText());
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{

                a=Double.parseDouble(t.getText() + "");
                div=true;
                t.setText(null);
                p.setText(btndiv.getText());
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0.0;
                b=0.0;
                t.setText("");
                p.setText("");

            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{

                    a=Double.parseDouble(t.getText()+"");
                    mod=true;
                    t.setText(null);
                    p.setText(btnmod.getText());
                }
            }
        });
        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{

                    a=Double.parseDouble(t.getText() + "");
                    pow=true;
                    t.setText(null);
                    p.setText(btnpow.getText());
                }
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=Double.parseDouble(t.getText() + "");
                p.setText(btneq.getText());
                if(add){
                    result=a+b;
                    t.setText(result+"");
                    add=false;
                }if(sub){
                    result=a-b;
                    t.setText(result+"");
                    sub=false;
                }if(mul){
                    result=a*b;
                    t.setText(result+"");
                    mul=false;
                }if(div){
                    if(b==0){
                        t.setText("Invalid!");
                    }
                    result=a/b;
                    t.setText(result+"");
                    div=false;
                }if(mod){
                    result=a%b;
                    t.setText(result+"");
                    mod=false;
                }if(pow){
                    result=Math.pow(a,b);
                    t.setText(result+"");
                    pow=false;
                }if(fac){
                    r=(fac(x));
                    t.setText(null);
                    t.setText(r+"");
                    fac=false;
                }
                if (root) {

                    result=Math.sqrt(a);
                    t.setText(null);
                    t.setText(result+"");
                    root=false;
                }if(ln){
                    result=Math.log(a);
                    t.setText(null);
                    t.setText(result+"");
                    ln=false;
                }if(log){
                    result=Math.log10(a);
                    t.setText(null);
                    t.setText(result+"");
                    log=false;
                }if(arctan){
                    result=Math.atan(a);
                    t.setText(null);
                    t.setText(result+"");
                    arctan=false;
                }if(arccos){
                    result=Math.acos(a);
                    t.setText(null);
                    t.setText(result+"");
                    arccos=false;
                }if(arcsin){
                    result=Math.asin(a);
                    t.setText(null);
                    t.setText(result+"");
                    arcsin=false;
                }if(sin){
                    result=Math.sin(a);
                    t.setText(null);
                    t.setText(result+"");
                    sin=false;
                }
                if(cos){
                    result=Math.cos(a);
                    t.setText(null);
                    t.setText(result+"");
                    cos=false;
                }if(tan){
                    result=Math.tan(a);
                    t.setText(null);
                    t.setText(result+"");
                    tan=false;
                }
                if(exp){
                    result=Math.pow(Math.E,a);
                    t.setText(null);
                    t.setText(result+"");
                    exp=false;
                }
            }

        });
        btnexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"First Enter the Number!",Toast.LENGTH_SHORT).show();
                }else{
                    a=Double.parseDouble(t.getText()+"");
                    exp=true;
                    p.setText("e^x");
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setText(btn1.getText());
                t.setText(Math.E+"");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setText(btn2.getText());
                t.setText(Math.PI+"");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }else{

                    x=Integer.parseInt(t.getText() + "");
                    p.setText("!");
                    fac=true;
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }else{
                    a=Double.parseDouble(t.getText() + "");
                    p.setText(btn6.getText());
                    root=true;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn4.getText());
                    ln=true;
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn5.getText());
                    log=true;
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn9.getText());
                    arctan=true;
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn8.getText());
                    arccos=true;
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn7.getText());
                    arcsin=true;
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn10.getText());
                    sin=true;
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn11.getText());
                    cos=true;
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().equals("")){
                    Toast.makeText(MainActivity.this,"Please enter a number first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    a=Double.parseDouble(t.getText()+"");
                    p.setText(btn12.getText());
                    tan=true;
                }
            }
        });
    }
    public static int fac(int x){
        int fact=1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;

    }





}
