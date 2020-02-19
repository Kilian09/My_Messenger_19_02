package ulpgc.alu.garciakilian.my_messenger_19_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    private TextView receiveMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        initLayoutComponents();
        receiveMessage();
    }


    private void initLayoutComponents(){
        receiveMessageTextView  = findViewById(R.id.receiveMessageTextView);
    }

    private void receiveMessage(){
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        receiveMessageTextView.setText(messageText);
    }


}
