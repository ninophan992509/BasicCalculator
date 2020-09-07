package ltudjava.android_seminar_1712610.calculator;
import java.math.BigDecimal;
import java.math.RoundingMode;

import ltudjava.android_seminar_1712610.calculator.Cong;
public class Nhan {
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

    public String Nhan2SoNguyen(String a, String b)
    {
        String result="0",nResult="";
        int a1 =0,b1=0,mem=0,tich=0,n0=0;

        while(a.length()!= b.length()){
            if(a.length()<b.length()){
                a="0"+a;
            }else
                b="0"+b;
        }

        for(int i=a.length()-1;i>=0;i--)
        {
            for(int j=b.length()-1;j>=0;j--)
            {
                a1 = a.charAt(i)-'0';
                b1 = b.charAt(j)-'0';
                tich = a1*b1+mem;
                if(tich>9){
                    mem = (int)tich/10;
                    nResult += Integer.toString(tich%10);
                }else{
                    mem = 0;
                    nResult += Integer.toString(tich);
                }
            }
            if(mem>0)
            {
                nResult+=Integer.toString(mem);
            }
            nResult= new StringBuffer(nResult).reverse().toString();
            n0=a.length()-i-1;
            while(n0>0){
                nResult+="0";
                n0--;
            }

            Cong cong = new Cong();
            result= cong.Cong2SoNguyen(result,nResult);

            nResult="";
        }
        return removePreZero(result);
    }

    public  String Nhan2SoThuc(String a, String b)
    {
        String athuc,anguyen,bthuc,bnguyen;
        anguyen = a.substring(0,a.indexOf("."));
        athuc =a.substring(a.indexOf(".")+1,a.length());
        bnguyen = b.substring(0,b.indexOf("."));
        bthuc =b.substring(b.indexOf(".")+1,b.length());

        while(anguyen.length()!= bnguyen.length()){
            if(anguyen.length()< bnguyen.length())
                anguyen="0"+anguyen;
            else
                bnguyen="0"+bnguyen;
        }

        while(athuc.length()!=bthuc.length()){
            if(athuc.length()<bthuc.length())
                athuc+="0";
            else
                bthuc+="0";
        }
        a=anguyen+athuc;
        b=bnguyen+bthuc;

        String result= Nhan2SoNguyen(a,b);
        int npoint=  result.length()- athuc.length()*2;
        String tichnguyen = result.substring(0,npoint);
        String tichthuc = result.substring(npoint,result.length());
         tichnguyen = removePreZero(tichnguyen);
         tichthuc = removePosZero(tichthuc);

         result = tichnguyen;
         if(tichthuc.compareTo("0")!=0)
         {
             result=tichnguyen+"."+tichthuc;
         }

        return result;
    }


    public String Nhan2So(String a, String b){
        BigDecimal a1 = BigDecimal.valueOf(Double.valueOf(a));
        BigDecimal b1 = BigDecimal.valueOf(Double.valueOf(b));
        BigDecimal qoutient = a1.multiply(b1);
        String result =  String.valueOf(qoutient);
        return result;

    }
}
