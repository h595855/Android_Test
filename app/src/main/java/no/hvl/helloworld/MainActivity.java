package no.hvl.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (Button) findViewById(R.id.Hello);

        hello.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String text = "Test";
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

}