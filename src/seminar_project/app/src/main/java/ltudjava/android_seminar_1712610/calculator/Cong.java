package ltudjava.android_seminar_1712610.calculator;

import java.math.BigDecimal;

public class Cong {

    public  String removePreZero(String a) {
        if (a.length() < 2 ) return a;
        while (a.charAt(0)=='0'&& a.length()>1)
        {
            a = a.substring(1,a.length());
        }
        return a;
    }

    public  String removePosZero(String a) {
        if (a.length() < 2) return a;
        while (a.charAt(a.length()-1)=='0' && a.length()>1)
        {
            a = a.substring(0,a.length()-1);
        }
        return a;
    }

    public int compareNumber( String a, String b){
        while(a.length()!= b.length())
        {
            if(a.length()<b.length())
                a="0"+a;
            else
                b="0"+b;
        }

        return a.compareTo(b);
    }

    public String Cong2SoNguyen(String a, String b){

        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();


        while(a.length()!=b.length())
        {
            if(a.length()<b.length())
                a+="0";
            else
                b+="0";
        }

        int mem = 0,a1=0,b1=0, tong=0;
        String result ="", temp="";
        for(int i =0 ;i<a.length();i++)
        {
              a1 =  a.charAt(i)-'0';
              b1 = b.charAt(i)-'0';
              tong = a1+b1+mem;
             if (tong>9)
             {
                 mem = 1;
                 temp= String.valueOf(Integer.toString(tong).charAt(1));
             }else{
                 mem=0;
                 temp = Integer.toString(tong);
             }
             result+=temp;


        }

        if(mem!=0)
        {
            result+="1";
        }

        return removePreZero(new StringBuffer(result).reverse().toString());
    }

    public  String Cong2SoThuc(String a, String b){

        String a_pre = a.substring(0,a.indexOf("."));
        String a_pos = a.substring(a.indexOf(".")+1,a.length());
        String b_pre = b.substring(0,b.indexOf("."));
        String b_pos = b.substring(b.indexOf(".")+1,b.length());

        while(a_pos.length()!=b_pos.length())
        {
            if(a_pos.length()<b_pos.length())
                a_pos+="0";
            else
                b_pos+="0";
        }


        String tongnguyen = Cong2SoNguyen(a_pre,b_pre);

        String tongthuc =  Cong2SoNguyen(a_pos,b_pos);
        int npos = a_pos.length();
        if(a_pos.length()< b_pos.length()) npos = b_pos.length();

        if(tongthuc.length()> npos)
        {
            tongthuc = tongthuc.substring(1,tongthuc.length());
             Cong2SoNguyen(tongnguyen,"1");

        }

        tongnguyen=removePreZero(tongnguyen);
        tongthuc=removePosZero(tongthuc);


        String result = tongnguyen;
        if(tongthuc.compareTo("0")!= 0) {
            result = tongnguyen+"."+tongthuc;
        }

        return result;
    }


    public String Cong2So(String a, String b){
        BigDecimal a1 = BigDecimal.valueOf(Double.valueOf(a));
        BigDecimal b1 = BigDecimal.valueOf(Double.valueOf(b));
        BigDecimal qoutient = a1.add(b1);
        String result =  String.valueOf(qoutient);
        return result;

    }

}
