package ltudjava.android_seminar_1712610.calculator;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Result extends BaseObservable {
    @Bindable
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.expression);
    }




    private String expression;
    private String result;


    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }



}
