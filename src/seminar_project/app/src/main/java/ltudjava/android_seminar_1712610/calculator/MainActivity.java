package ltudjava.android_seminar_1712610.calculator;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import ltudjava.android_seminar_1712610.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    private Button btnAC,btnC, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnTimes,btnDevide,
                   btnPoint,btnEqual,btnOpen,btnClose;



    private boolean isTap=true;
    private int nOpen =0;
    private int nClose =0;

    private String ans="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Result result = new Result();
        result.setExpression( new String(""));
        result.setResult( new String(""));
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setResult(result);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC = findViewById(R.id.btnAC);
        btnC = findViewById(R.id.btnClear);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnTimes = findViewById(R.id.btnPlus);
        btnDevide = findViewById(R.id.btnDevide);
        btnPoint = findViewById(R.id.btnPoint);
        btnEqual = findViewById(R.id.btnEqual);
        btnOpen= findViewById(R.id.btnOpen);
        btnClose= findViewById(R.id.btnClose);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();

                    if(expression.compareTo("")==0) {
                        result.setExpression("0");
                        isTap=true;
                    }else {
                        char c = expression.charAt(expression.length() - 1);
                        if(c=='=') {
                            result.setExpression("0");
                            isTap = true;
                        }else {
                            if (expression.charAt(expression.length() - 1) != ')') {
                                result.setExpression(result.getExpression() + "0");
                            } else {
                                result.setExpression(result.getExpression() + "x0");
                            }
                        }
                    }


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("1");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("1");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "1");
                        } else {
                            result.setExpression(result.getExpression() + "x1");
                        }
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("2");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("2");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "2");
                        } else {
                            result.setExpression(result.getExpression() + "x2");
                        }
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("3");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("3");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "3");
                        } else {
                            result.setExpression(result.getExpression() + "x3");
                        }
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("4");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("4");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "4");
                        } else {
                            result.setExpression(result.getExpression() + "x4");
                        }
                    }
            }}
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("5");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("5");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "5");
                        } else {
                            result.setExpression(result.getExpression() + "x5");
                        }
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("6");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("6");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "6");
                        } else {
                            result.setExpression(result.getExpression() + "x6");
                        }
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("7");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("7");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "7");
                        } else {
                            result.setExpression(result.getExpression() + "x7");
                        }
                    }
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("8");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("8");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "8");
                        } else {
                            result.setExpression(result.getExpression() + "x8");
                        }
                    }
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("9");
                    isTap=true;
                } else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression("9");
                        isTap = true;
                    }else {
                        if (expression.charAt(expression.length() - 1) != ')') {
                            result.setExpression(result.getExpression() + "9");
                        } else {
                            result.setExpression(result.getExpression() + "x9");
                        }
                    }
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String expression= result.getExpression();
                if(expression.compareTo("")==0){
                    result.setExpression("0+");
                    isTap=true;
                }else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=')
                    {
                        result.setExpression(ans+"+");
                        isTap=true;
                    }else {
                        if (c == '-' || c == '÷' || c == 'x') {
                            result.setExpression(expression.substring(0, expression.length() - 1) + '+');
                        } else {
                            if (c != '(' && c != '+' && c != '.')
                                result.setExpression(expression + '+');
                        }
                    }
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression= result.getExpression();
                if(expression.compareTo("")!=0) {

                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression(ans + "-");
                        isTap = true;
                    }else {
                        if (c == '+' || c == 'x' || c == '÷') {
                            result.setExpression(expression.substring(0, expression.length() - 1) + "-");
                        } else {
                            if (c != '-' && c != '.')
                                result.setExpression(expression + "-");
                        }
                    }
                }else{
                    result.setExpression("-");
                    isTap=true;
                }

            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String expression= result.getExpression();
                if(expression.compareTo("")==0){
                    result.setExpression("0x");
                    isTap=true;
                }else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=') {
                        result.setExpression(ans + "x");
                        isTap = true;
                    }else {
                        if (c == '+' || c == '÷' || c == '-') {
                            result.setExpression(expression.substring(0, expression.length() - 1) + 'x');
                        } else {
                            if (c != '(' && c != 'x' && c != '.')
                                result.setExpression(expression + 'x');
                        }
                    }
                }
            }
        });

        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression= result.getExpression();
                if(expression.compareTo("")==0){
                    result.setExpression("0÷");
                    isTap=true;
                }else {
                    char c = expression.charAt(expression.length() - 1);
                    if(c=='=')
                    {
                        result.setExpression(ans+"÷");
                        isTap=true;
                    }else {
                        if (c == '+' || c == 'x' || c == '-') {
                            result.setExpression(expression.substring(0, expression.length() - 1) + '÷');
                        } else {
                            if (c != '(' && c != '÷' && c != '.')
                                result.setExpression(expression + '÷');
                        }
                    }
                }
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("0.");
                    isTap = true;
                } else {

                    char lastChar = expression.charAt(expression.length() - 1);
                    if(lastChar=='='){
                        result.setExpression("0.");
                        isTap = true;
                    }else {
                        if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '÷' || lastChar == '(') {
                            result.setExpression(expression + "0.");
                        } else if (lastChar == ')') {
                            result.setExpression(expression + "x0.");
                        } else {
                            if (!containPoint(expression)) {
                                result.setExpression(expression + ".");
                            }
                        }
                    }
                }
            }
        });

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") == 0) {
                    result.setExpression("(");
                    nOpen+=1;
                    isTap=true;
                } else {
                    char lastChar = expression.charAt(expression.length() - 1);
                    if(lastChar=='=')
                    {
                        result.setExpression("(");
                        nOpen+=1;
                        isTap=true;
                    }else {
                        if (lastChar >= '0' && lastChar <= '9' || lastChar == ')') {
                            result.setExpression(expression + "x(");
                            nOpen+=1;
                        } else {
                            if (lastChar != '.') {
                                result.setExpression(expression + "(");
                                nOpen+=1;
                            }
                        }
                    }
                }
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = result.getExpression();
                if (expression.compareTo("") != 0) {
                    char lastChar = expression.charAt(expression.length() - 1);
                    if ((lastChar >= '0' && lastChar <= '9')|| lastChar==')') {
                        if (nClose < nOpen) {
                            result.setExpression(expression + ")");
                            nClose+=1;
                        }
                    }
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhToan tinhToan = new TinhToan();
                if(tinhToan.isValidExp(result.getExpression())&&(nOpen==nClose)) {
                    result.setResult(removeZero(tinhToan.Calculate(result.getExpression())));
                    ans = result.getResult();
                    result.setExpression(result.getExpression()+"=");
                    nOpen=0;nClose=0;
                    isTap = false;
                }
                }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setExpression(new String(""));
                result.setResult(new String(""));
                isTap=false;
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isTap)
                {
                    String expression=result.getExpression();
                    if(expression.length()<2) {
                        if(expression=="(")
                            nOpen=0;
                        result.setExpression("");
                        isTap=false;
                    }
                    else {
                        if(expression.charAt(expression.length()-1)=='(')
                        {
                            nOpen-=1;
                        }else if(expression.charAt(expression.length()-1)==')') {
                            nClose -= 1;
                        }
                        result.setExpression(expression.substring(0, expression.length() - 1));
                    }
                }
            }
        });


    }

    public boolean containPoint(String s){

        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='x'||s.charAt(i)=='÷'){
                break;
            }

            if(s.charAt(i)=='.')
            {
                return true;
            }
        }
        return false;
    }

     public String removeZero(String s)
     {

         if(s.contains("."))
         {
             int indexpoint = s.indexOf(".");
             int i= s.length()-1;
             while(i>indexpoint)
             {
                 if(s.charAt(i)=='0')
                 {
                     s=s.substring(0,i);
                     i = s.length()-1;
                 }else
                     break;

             }
             if(s.charAt(i)=='.')
             {
                 s=s.substring(0,i);
             }

             return s;
         }else {
             return s;
         }
     }


}
