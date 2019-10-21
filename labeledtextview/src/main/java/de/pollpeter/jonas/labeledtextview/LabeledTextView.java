package de.pollpeter.jonas.labeledtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.StyleRes;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LabeledTextView extends LinearLayout {
    private TextView mLabel;
    private TextView mContent;
    private String mLabelText;
    private boolean mLabelAllCaps;
    private boolean mLabelSingleLine;
    private boolean mLabelBold;
    private int  mContentPaddingLeft;
    private int mLabelColor;
    private String mContentText;
    private Context context;
    private static final boolean LABEL_ALL_CAPS_DEFAULT = true;
    private static final boolean LABEL_BOLD_DEFAULT = true;
    private static final boolean LABEL_SINGLE_LINE_DEFAULT = true;

    public LabeledTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initLayout();
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.LabeledTextView,
                0, 0);

        try {
            mLabelText = a.getString(R.styleable.LabeledTextView_label_text);
            mContentText = a.getString(R.styleable.LabeledTextView_content_text);
            mContentPaddingLeft = (int) a.getDimension(R.styleable.LabeledTextView_content_padding_left, -1F);
            mLabelColor = a.getColor(R.styleable.LabeledTextView_label_color, -1);
            mLabelAllCaps = a.getBoolean(R.styleable.LabeledTextView_label_all_caps, LABEL_ALL_CAPS_DEFAULT);
            mLabelBold = a.getBoolean(R.styleable.LabeledTextView_label_bold, LABEL_BOLD_DEFAULT);
            mLabelSingleLine = a.getBoolean(R.styleable.LabeledTextView_label_single_line, LABEL_SINGLE_LINE_DEFAULT);
        } finally {
            a.recycle();
        }
        if(mLabelColor!=-1) mLabel.setTextColor(mLabelColor);
        mLabel.setSingleLine(mLabelSingleLine);
        mLabel.setAllCaps(mLabelAllCaps);
        if(mLabelBold) mLabel.setTypeface(mLabel.getTypeface(), Typeface.BOLD);
        else mLabel.setTypeface(null, Typeface.NORMAL);
        if(mContentPaddingLeft!=-1) setPaddingLeft(mContent,mContentPaddingLeft);
        if(mLabelText!=null&&!mLabelText.isEmpty()) mLabel.setText(mLabelText);
        if(mContentText!=null&&!mContentText.isEmpty()) mContent.setText(mContentText);
    }

    private void initLayout() {
        View view = inflate(context,R.layout.labeled_text_view_layout, this);
        mLabel = view.findViewById(R.id.labelText);
        mContent = view.findViewById(R.id.contentText);
    }

    /**
    * changes label text
     * @param text new text of label
    * */
    public void setLabelText(String text){
        mLabelText = text;
        mLabel.setText(mLabelText);
    }

    /**
     * changes all caps of label text view (whether label text is all caps or not)
     * @param allCaps new all caps value of label text
     * */
    public void setLabelAllCaps(boolean allCaps){
        mLabelAllCaps = allCaps;
        mLabel.setAllCaps(mLabelAllCaps);
    }

    /**
     * changes text-color of label text view
     * @param color new text-color of label text
     * */
    public void setLabelColor(@ColorInt int color){
        mLabelColor = color;
        mLabel.setTextColor(color);
    }

    /**
     * changes single line value of label text (true: label max takes one line else multiple)
     * @param singleLine new all caps value of label text
     * */
    public void setLabelSingleLine(boolean singleLine){
        mLabelSingleLine = singleLine;
        mLabel.setSingleLine(mLabelSingleLine);
    }

    /**
     * changes bold style
     * @param bold if true text will be bold else not
     * */
    public void setLabelBold(boolean bold){
        mLabelBold = bold;
        if(mLabelBold) mLabel.setTypeface(mLabel.getTypeface(), Typeface.BOLD);
        else mLabel.setTypeface(null, Typeface.NORMAL);
    }

    /**
     * changes padding left of content text
     * @param paddingLeft new padding left from root view for contentTextView
     * */
    public void setContentPaddingLeft(int paddingLeft){
        mContentPaddingLeft = paddingLeft;
        setPaddingLeft(mContent,mContentPaddingLeft);
    }

    /**
     * changes content text
     * @param text new text of content
     * */
    public void setContentText(String text){
        mContentText = text;
        mContent.setText(mContentText);
    }

    /**
     * changes content text appereance style
     * @param style new text style
     * */
    public void setContentTextStyle(@StyleRes int style){
        TextViewCompat.setTextAppearance(mContent,style);
    }

    /**
    * changes only padding left@
     * @param paddingLeft new padding left of the view
     * @param v the affected view
    * */
    private void setPaddingLeft(View v, int paddingLeft){
        v.setPadding(paddingLeft,v.getPaddingTop(),v.getPaddingRight(),v.getPaddingBottom());
    }
}
