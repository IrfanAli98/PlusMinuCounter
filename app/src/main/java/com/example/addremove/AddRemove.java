package com.example.addremove;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class AddRemove extends LinearLayout {

    private ImageView ivPlus;
    private ImageView ivMinus;
    private TextView etCount;
    private LinearLayout llBg;


    public AddRemove(Context context) {
        super(context);
        init(context);
    }

    public AddRemove(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public AddRemove(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public AddRemove(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context){
        View v = LayoutInflater.from(context).inflate(R.layout.layout_add_remove, this, true);
        ivPlus = (ImageView) v.findViewById(R.id.ivIcon2);
        ivMinus = (ImageView) v.findViewById(R.id.ivIcon1);
        etCount = (EditText) v.findViewById(R.id.etCount);
        llBg = (LinearLayout) v.findViewById(R.id.llBg);

        ivPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   int count  = Integer.parseInt(etCount.getText().toString());
                   if(TextUtils.isEmpty(etCount.getText().toString())){

                   }else if(count>=0){
                       int newCount = count+1;
                       etCount.setText(String.valueOf(newCount));
                   }
               }catch (Exception e){
                   e.printStackTrace();
               }
            }
        });
        ivMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int count  = Integer.parseInt(etCount.getText().toString());
                if(count>0){
                    int newCount = count-1;
                    etCount.setText(String.valueOf(newCount));
                }
            }
        });
    }
    public void setCountColor(int color){
        etCount.setTextColor(getResources().getColor(color));
    }
    public void setCountSize(float size){
        etCount.setTextSize(size);
    }
    public void setCountWidth(int width){
        etCount.setWidth(width);
    }
    public void setCountHeight(int height){
        etCount.setHeight(height);
    }
    public void setFont(float size){
        etCount.setTextSize(size);
    }
    public void setPlusSize(int height, int width){
        ivPlus.setMaxHeight(height);
        ivPlus.setMaxWidth(width);
    } public void setMinusSize(int height, int width){
        ivMinus.setMaxHeight(height);
        ivMinus.setMaxWidth(width);
    }
    public void setBackground(int color){
        llBg.setBackgroundColor(getResources().getColor(color));
    }
}
