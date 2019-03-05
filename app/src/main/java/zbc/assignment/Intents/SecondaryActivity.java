package zbc.assignment.Intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void onChangeActivityClick(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
