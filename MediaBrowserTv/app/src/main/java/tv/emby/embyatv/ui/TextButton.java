package tv.emby.embyatv.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import tv.emby.embyatv.R;
import tv.emby.embyatv.util.Utils;

/**
 * Created by Eric on 4/30/2015.
 */
public class TextButton extends Button {
    public TextButton(Context context) {
        super(context);
        setOnFocusChangeListener(focusChangeListener);
    }

    public TextButton(Context context, String text, int size, OnClickListener listener) {
        super(context);
        setOnFocusChangeListener(focusChangeListener);
        setOnClickListener(listener);
        setText(text);
        setTextSize(size);
        setBackgroundColor(0);
        int trueSize = Utils.convertDpToPixel(context, size);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(trueSize*2 +20, trueSize + 50);

        setLayoutParams(lp);
    }

    private OnFocusChangeListener focusChangeListener = new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                v.setBackgroundColor(getResources().getColor(R.color.lb_default_brand_color));
            } else {
                v.setBackgroundColor(0);
            }
        }
    };


}
