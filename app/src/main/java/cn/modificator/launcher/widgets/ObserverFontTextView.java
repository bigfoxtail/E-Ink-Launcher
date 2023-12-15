package cn.modificator.launcher.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;


/**
 * Created by Modificator
 * time: 16/12/3.上午2:03
 * des:create file and achieve model
 */

@SuppressWarnings("deprecation")
public class ObserverFontTextView extends AppCompatTextView implements java.util.Observer {
    public ObserverFontTextView(Context context) {
        super(context);
    }

    public ObserverFontTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ObserverFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void update(java.util.Observable o, Object arg) {
        setTextSize(TypedValue.COMPLEX_UNIT_SP, (Float) arg);
//    requestLayout();
    }
}
