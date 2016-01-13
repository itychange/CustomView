package view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by Windows on 1/13/2016.
 */
public class CustomView extends TextView {
    private TextView mTextView;
    private Context mContext;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
        init();
    }


    private void init(){
        mTextView=new TextView(mContext);
        mTextView.setGravity(100);
        mTextView.setTextSize(100);
        mTextView.setText("Text Android");
        invalidate();
        requestLayout();



    }
}
