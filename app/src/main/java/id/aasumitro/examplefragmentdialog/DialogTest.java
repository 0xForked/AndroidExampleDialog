package id.aasumitro.examplefragmentdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Agus Adhi Sumitro on 08/02/2018.
 * https://asmith.my.id
 * aasumitro@gmail.com
 */

public class DialogTest extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_test);

        Button mOne = findViewById(R.id.btn_onePleaseClick);
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DialogTest.this,
                                "Button one is clicked",
                                Toast.LENGTH_LONG).show();
            }
        });

        Button mTwo = findViewById(R.id.btn_twoClickMe);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DialogTest.this,
                                "Button two is clicked",
                                Toast.LENGTH_LONG).show();
            }
        });

    }
}
