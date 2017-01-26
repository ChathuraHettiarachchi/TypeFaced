package com.chootdev.typefaced;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.chootdev.typefaced.exception.TypeFacedException;

/**
 * Created by Choota on 1/26/17.
 */

public class TypeFacedButton extends Button {
    Context context;

    public TypeFacedButton(Context _context, AttributeSet attrs, int defStyle) {
        super(_context, attrs, defStyle);

        context = _context;
        try {
            init(attrs);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }
    }

    public TypeFacedButton(Context _context, AttributeSet attrs) {
        super(_context, attrs);
        context = _context;
        try {
            init(attrs);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }

    }

    public TypeFacedButton(Context _context) {
        super(_context);
        context = _context;
        try {
            init(null);
        } catch (TypeFacedException e) {
            e.printStackTrace();
        }
    }

    private void init(AttributeSet attrs) throws TypeFacedException{
        if (attrs!=null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TypeFacedButton);
            String fontName = a.getString(R.styleable.TypeFacedButton_button_font);
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
