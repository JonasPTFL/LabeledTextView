package de.pollpeter.jonas.labeledtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LabeledTextView codeLabeledTextView = findViewById(R.id.codeLabeledTextView);
        LabeledTextView textStyleDemo = findViewById(R.id.textStyleDemo);

        //  1
        codeLabeledTextView.setLabelText("code-LabeledTextView");
        codeLabeledTextView.setContentText("This was added by code!");

        // change 2
        textStyleDemo.setContentTextStyle(R.style.CustomTextAppearance);
    }
}
