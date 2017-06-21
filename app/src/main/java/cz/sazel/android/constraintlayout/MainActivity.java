package cz.sazel.android.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHello = (TextView) findViewById(R.id.tvHello);
        findViewById(R.id.btJ8Click).setOnClickListener(v -> tvHello.setText(getText(R.string.j8text)));
    }
}
