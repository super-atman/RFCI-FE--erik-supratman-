package com.example.tes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText tulisan;
    HashMap<Character,Integer> dibalik;
    TextView textView;

    private static long LAST_CLICK_TIME = 0;
    private final int mDoubleClickInterval = 400; // Milliseconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tulisan= findViewById(R.id.editText);
        textView= findViewById(R.id.textview1);

        final TextViewUndoRedo undoredo = new TextViewUndoRedo(tulisan);

        dibalik=new HashMap<>();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer c = new StringBuffer(tulisan.getText().toString());
                textView.setText(c.reverse());

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                undoredo.undo();
            }
        });



    }
}
