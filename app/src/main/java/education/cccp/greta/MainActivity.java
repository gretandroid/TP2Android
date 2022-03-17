package education.cccp.greta;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;
import static education.cccp.greta.R.layout.activity_main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText lastNameEditText;
    EditText firstNameEditText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        firstNameEditText = findViewById(R.id.firstNameEditText);
    }

    public void sendButtonOnClick(View view) {
        makeText(this,
                lastNameEditText.getText().toString(),
                LENGTH_LONG)
                .show();
    }
}