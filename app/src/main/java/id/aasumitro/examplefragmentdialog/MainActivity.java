package id.aasumitro.examplefragmentdialog;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mPress = findViewById(R.id.btn_pressMe);
        mPress.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    startActivity(new Intent(MainActivity.this, DialogTest.class));

                }else {
                    final AlertDialog.Builder alertDialogBuilder =
                            new AlertDialog.Builder(MainActivity.this);
                    alertDialogBuilder.setTitle("Just Test!");
                    alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
                    alertDialogBuilder.setCancelable(false);
                    LinearLayout layout = new LinearLayout(MainActivity.this);
                    layout.setOrientation(LinearLayout.VERTICAL);

                    final EditText testEd = new EditText(MainActivity.this);

                    testEd.setImeOptions(EditorInfo.IME_ACTION_NEXT);
                    testEd.setHint("Just text add here");
                    testEd.setSingleLine(true);

                    layout.addView(testEd);
                    alertDialogBuilder.setView(layout, 40, 0, 40, 0);

                    alertDialogBuilder.setPositiveButton("Button One", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,
                                    "Button one is clicked",
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                    alertDialogBuilder.setNegativeButton("Button Two", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,
                                    "Button two is clicked",
                                    Toast.LENGTH_LONG).show();
                        }
                    });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            }
        });


        Button mPressAlert = findViewById(R.id.just_alertDialog);
        mPressAlert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertDialogBuilder =
                        new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setTitle("Alert Alone!");
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
                alertDialogBuilder.setCancelable(false);
                LinearLayout layout = new LinearLayout(MainActivity.this);
                layout.setOrientation(LinearLayout.VERTICAL);

                final EditText testEd = new EditText(MainActivity.this);

                testEd.setImeOptions(EditorInfo.IME_ACTION_NEXT);
                testEd.setHint("Just text add here");
                testEd.setSingleLine(true);

                layout.addView(testEd);
                alertDialogBuilder.setView(layout, 40, 0, 40, 0);

                alertDialogBuilder.setPositiveButton("Button One", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,
                                "Button one is clicked",
                                Toast.LENGTH_LONG).show();
                    }
                });

                alertDialogBuilder.setNegativeButton("Button Two", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,
                                "Button two is clicked",
                                Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        Button mPressFragment = findViewById(R.id.just_fragmentDialog);
        mPressFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogTest.class));
            }
        });

    }
}
