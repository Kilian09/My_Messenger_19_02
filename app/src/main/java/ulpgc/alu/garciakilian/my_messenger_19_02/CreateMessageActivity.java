package ulpgc.alu.garciakilian.my_messenger_19_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    private Button sendButton;
    private EditText mesageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        initLayoutComponents();
        initLayoutContent();
    }


    private void initLayoutComponents(){
        sendButton  = findViewById(R.id.sendButton);
        mesageEditText = findViewById(R.id.mesageEditText);
    }

    private void initLayoutContent(){
        sendButton.setText(R.string.send_button_text);
        mesageEditText.setHint(R.string.message_text);
    }

    public void onClickSendMessage(View view) {
        //String messageText = mesageEditText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        //Intent intent = new Intent(this,ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }
}
