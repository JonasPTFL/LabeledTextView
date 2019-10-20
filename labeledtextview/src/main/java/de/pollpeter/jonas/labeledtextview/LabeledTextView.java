package de.pollpeter.jonas.labeledtextview;

import android.content.Context;
import android.content.res.TypedArray;
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
    private String mContentText;
    private Context context;
    private static final boolean LABEL_ALL_CAPS_DEFAULT = true;
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
            mLabelAllCaps = a.getBoolean(R.styleable.LabeledTextView_label_all_caps, LABEL_ALL_CAPS_DEFAULT);
            mLabelSingleLine = a.getBoolean(R.styleable.LabeledTextView_label_single_line, LABEL_SINGLE_LINE_DEFAULT);
        } finally {
            a.recycle();
        }
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
     * changes single line value of label text (true: label max takes one line else multiple)
     * @param singleLine new all caps value of label text
     * */
    public void setLabelSingleLine(boolean singleLine){
        mLabelSingleLine = singleLine;
        mLabel.setSingleLine(mLabelSingleLine);
    }

    /**
     * changes content text
     * @param text new text of content
     * */
    public void setContentText(String text){
        mContentText = text;
        mContent.setText(mContentText);
    }
}
