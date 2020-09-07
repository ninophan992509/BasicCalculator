package ltudjava.android_seminar_1712610.calculator;

import java.math.BigDecimal;

public class Tru {

    public  String removePreZero(String a) {
        if (a.length() <2 ) return a;
        while (a.charAt(0)=='0'&& a.length()>1)
        {
            a = a.substring(1,a.length());
        }
        return a;
    }

    public  String removePosZero(String a) {
        if (a.length() < 2) return a;
        while (a.charAt(a.length()-1)=='0'&& a.length()>1 )
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

    public String Tru2SoNguyen(String a, String b){

        int mem = 0,a1=0,b1=0, hieu=0;
        String result ="", temp="";
        int neg = 0;
        if(compareNumber(a,b)<0)
        {
            temp = a;
            a = b;
            b = temp;
            neg = 1;

        }
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();


        while(a.length()!=b.length())
        {
            if(a.length()<b.length())
                a+="0";
            else
                b+="0";
        }




        for(int i =0 ;i<a.length();i++)
        {
            a1 =  a.charAt(i)-'0';
            b1 = b.charAt(i)-'0';

           if(a1<b1+mem){
               a1+=10;
               hieu = a1-(b1+mem);
               mem=1;
           }else{
               hieu = a1-(b1+mem);
               mem =0;
           }
           result+=hieu;



        }

        result= new StringBuffer(result).reverse().toString();
        if(neg==1){
            result='-'+result;
        }

        return removePreZero(result);
    }

    public  String Tru2SoThuc(String a, String b){

        String a_pre = a.substring(0,a.indexOf("."));
        String a_pos = a.substring(a.indexOf(".")+1,a.length());
        String b_pre = b.substring(0,b.indexOf("."));
        String b_pos = b.substring(b.indexOf(".")+1,b.length());


        int mem = 0,a1=0,b1=0, hieu=0;
        String hieuthuc ="", temp="";
        int neg = 0;



        if(compareNumber(a_pre,b_pre)<0)
        {
            temp = a_pre;
            a_pre = b_pre;
            b_pre = temp;
            temp = a_pos;
            a_pos = b_pos;
            b_pos = temp;
            neg = 1;

        }



        String hieunguyen = Tru2SoNguyen(a_pre,b_pre);


        while(a_pos.length()!=b_pos.length())
        {
            if(a_pos.length()<b_pos.length())
                a_pos+="0";
            else
                b_pos+="0";
        }
        a_pos = new StringBuffer(a_pos).reverse().toString();
        b_pos = new StringBuffer(b_pos).reverse().toString();
        for(int i =0 ;i<a_pos.length();i++)
        {
            a1 = a_pos.charAt(i)-'0';
            b1 = b_pos.charAt(i)-'0';

            if(a1<b1+mem){
                a1+=10;
                hieu = a1-(b1+mem);
                mem=1;
            }else{
                hieu = a1-(b1+mem);
                mem =0;
            }

            hieuthuc+=Integer.toString(hieu);


        }

        hieuthuc = new StringBuffer(hieuthuc).reverse().toString();

        if(mem==1){
            Tru2SoNguyen(hieunguyen,"1");
        }

        hieunguyen = removePreZero(hieunguyen);
        hieuthuc = removePosZero(hieuthuc);
        String result = hieunguyen;
        if(hieuthuc.compareTo("0")!=0)
            result=hieunguyen+"."+hieuthuc;
        if(neg == 1)
            result="-"+result;

       return result;

    }

    public String Tru2So(String a, String b){
        BigDecimal a1 = BigDecimal.valueOf(Double.valueOf(a));
        BigDecimal b1 = BigDecimal.valueOf(Double.valueOf(b));
        BigDecimal qoutient = a1.subtract(b1);
        String result =  String.valueOf(qoutient);
        return result;

    }
}
