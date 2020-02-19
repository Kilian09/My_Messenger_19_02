package ulpgc.alu.garciakilian.my_messenger_19_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.net.Proxy.Type.HTTP;

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


    private void initLayoutComponents() {
        sendButton = findViewById(R.id.sendButton);
        mesageEditText = findViewById(R.id.mesageEditText);
    }

    private void initLayoutContent() {
        sendButton.setText(R.string.send_button_text);
        mesageEditText.setHint(R.string.message_text);
    }

    public void onClickSendMessage(View view) {
      sendMessage();
    }

    public void goAnotherActivity() {
        String messageText = mesageEditText.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);

    }


    public void goAnotherAPP() {
        Intent intent = new Intent(Intent.ACTION_SEND);

        // Always use string resources for UI text.
        // This says something like "Share this photo with"
        String title = getResources().getString(R.string.chooser_title);
        // Create intent to show chooser
        Intent chooser = Intent.createChooser(intent, title);

            startActivity(chooser);

    }


    public void sendMessage() {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        startActivity(emailIntent);

    }

}
