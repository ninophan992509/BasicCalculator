package ltudjava.android_seminar_1712610.calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Chia {
    public  String removePreZero(String a) {
        if (a.length() < 2) return a;
        while (a.charAt(0)=='0' && a.length()>1)
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

    public int compareNumber(String a, String b){
        while(a.length()!= b.length())
        {
            if(a.length()<b.length())
                a="0"+a;
            else
                b="0"+b;
        }

        return a.compareTo(b);
    }
    public  String Chia2SoNguyen(String a, String b){
        int q=0;
        String r=a;

        Tru tru = new Tru();
        while(compareNumber(r,b)>=0){
            q+=1;

            r=tru.Tru2SoNguyen(r,b);

        }


        String thuongnguyen = Integer.toString(q), thuongthuc="";
        Nhan nhan = new Nhan();

        while (compareNumber(r,"0")>0)
        {
            q = 0;
            r = nhan.Nhan2SoNguyen(r,"10");

            while(compareNumber(r,b)>=0){
                q+=1;
                r=tru.Tru2SoNguyen(r,b);

            }
            thuongthuc+=Integer.toString(q);

        }
         System.out.println(thuongnguyen+" "+thuongthuc);
        thuongnguyen= removePreZero(thuongnguyen);
        thuongthuc= removePosZero(thuongthuc);
        System.out.println(thuongnguyen+" "+thuongthuc);

        String result = thuongnguyen;
        if(thuongthuc.compareTo("0")!= 0 || thuongthuc=="")
            result=thuongnguyen+"."+thuongthuc;
        return result;
    }



    public String Chia2So(String a, String b){
        BigDecimal a1 = BigDecimal.valueOf(Double.valueOf(a));
        BigDecimal b1 = BigDecimal.valueOf(Double.valueOf(b));
        BigDecimal qoutient = a1.divide(b1,7, RoundingMode.HALF_EVEN);
        String result =  String.valueOf(qoutient);
        return result;

    }





}
