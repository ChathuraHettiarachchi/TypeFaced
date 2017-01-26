package com.chootdev.typefaced;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.chootdev.typefaced.exception.TypeFacedException;

/**
 * Created by Choota on 1/26/17.
 */

public class TypeFacedRadioButton extends RadioButton {
    Context context;

    public TypeFacedRadioButton(Context context) {
        super(context);
        this.context = context;
        try {
            init(null);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }
    }

    public TypeFacedRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        try {
            init(attrs);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }
    }

    public TypeFacedRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        try {
            init(attrs);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }
    }

    private void init(AttributeSet attrs) throws TypeFacedException {
        if (attrs!=null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TypeFacedRadioButton);
            String fontName = a.getString(R.styleable.TypeFacedRadioButton_radiobutton_font);
            if (fontName!=null) {
                try {
                    Typeface myTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
                    setTypeface(myTypeface);
                } catch (Exception e){
                    throw new TypeFacedException("Font not found exceptiom");
                }
            }
            a.recycle();
        }
    }
}
