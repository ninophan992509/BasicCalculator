package ltudjava.android_seminar_1712610.calculator;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TinhToan {

    public int DoUuTien(char x)
    {
        if (x == '(')
            return 0;
        if (x == '+' || x == '-')
            return 1 ;
        if (x == '*' || x == '÷' )
            return 2;

        return 3;
    }

    public boolean isValidExp(String s)
    {
        if(s.length()==0)
            return false;

        char lastchar = s.charAt(s.length()-1);
        if(lastchar=='+'||lastchar=='-'||lastchar=='x'||lastchar=='÷'||lastchar=='.'||lastchar=='('||lastchar=='=')
            return false;
        return true;

    }
    public Vector<String>Standard(String s)
    {
        Vector<String> result=new Vector<String>();
        String number="";
        int i=0,n=s.length();
        if(s.charAt(0)=='-')
        {
            if(s.charAt(1)>='0'&& s.charAt(1)<='9')
            {
                int j=1;
                while(((s.charAt(j)>='0'&&s.charAt(j)<='9')||s.charAt(j)=='.') &&j<n){
                    number+=String.valueOf(s.charAt(j));
                    ++j;
                }
                result.add("-"+number);
                number="";
                i=j;

            }else if(s.charAt(1)=='(')
            {
                result.add("0");
                result.add("-");
                i=1;
            }
        }

        while(i<n) {


            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                int j=i;

                while(j<n){
                   if ((s.charAt(j)>='0'&&s.charAt(j)<='9')||s.charAt(j)=='.') {
                       number += String.valueOf(s.charAt(j));

                       ++j;
                   }else
                       break;
                }
                result.add(number);
                number="";
                i=j;
            }else{
                if(c=='-'){
                    if(s.charAt(i-1)=='(') {
                        //if (s.charAt(i + 1) == '(') {
                            result.add("-1");
                            result.add("x");
                            i += 1;
                      /*  } else {
                            i = i + 1;
                            int j = i;
                            while ( j < n) {
                                if((s.charAt(j) >= '0' && s.charAt(j) <= '9') || s.charAt(j) == '.') {
                                    number += String.valueOf(s.charAt(j));
                                    ++j;
                                }else
                                    break;
                            }
                            result.add("-" + number);
                            i = j;

                        }*/

                    }else{
                        result.add("-");
                        i+=1;
                    }
                }else{
                    result.add(String.valueOf(c));
                    i+=1;
                }
                }


            }
        return result;

    }

    public Vector<String> ConvertToPosfix(Vector<String> s){

        System.out.println(s);
        Vector<String> posfix=new Vector<String>();

        Stack<String> stack = new Stack<String>();
        String temp;


        for(String str:s){


            char c = str.charAt(0);
            if(c=='-')
            {
                if(str.compareTo("-")==0)
                {
                    if(!stack.empty()) {
                        while (DoUuTien(c) <= DoUuTien(stack.peek().charAt(0))) {
                            temp = stack.pop();
                            posfix.add(temp);
                            if(stack.empty())
                                break;
                        }
                    }
                    stack.push(String.valueOf(c));
                }else{
                    posfix.add(str);
                }
            }
            else if (c >= '0' && c <= '9') {
                posfix.add(str);
            }else {
                if(c=='(')
                    stack.push(String.valueOf(c));
                else if(c==')'){
                    temp=stack.pop();
                    while(temp.compareTo("(")!=0) {
                        posfix.add(temp);
                        temp=stack.pop();

                    }
                }else{
                    if(!stack.empty()) {
                        while (DoUuTien(c) <= DoUuTien(stack.peek().charAt(0))) {
                            temp = stack.pop();
                            posfix.add(temp);
                            if(stack.empty())
                                break;
                        }
                    }
                        stack.push(String.valueOf(c));

                }

            }
        }




        while(!stack.isEmpty())
        {
            temp= stack.pop();
            posfix.add(temp);
        }

        return posfix;
    }

    public String Calculate(String exp)
    {
        Vector<String> posfix = ConvertToPosfix(Standard(exp));
        System.out.println(posfix);
        Stack<String> stack = new Stack<String>();
        for(String temp:posfix) {
           if(temp.compareTo("+")== 0||temp.compareTo("-")==0||temp.compareTo("x")==0||temp.compareTo("÷")==0)
            {
                String a = stack.pop();
                String b = stack.pop();
                if(temp.compareTo("+")== 0)
                {
                    Cong cong = new Cong();
                    b = cong.Cong2So(b,a);
                }else if(temp.compareTo("-")==0)
                {
                    Tru tru = new Tru();
                    b = tru.Tru2So(b,a);
                }else if(temp.compareTo("x")==0)
                {
                    Nhan nhan = new Nhan();
                    b = nhan.Nhan2So(b,a);
                }else{
                    Chia chia = new Chia();
                    b = chia.Chia2So(b,a);
                }
                stack.push(b);
            }else{
               stack.push(temp);
            }
        }


        return  stack.pop();
    }


}
