package fauzi.hilmy.biggerorsmaller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnSubmit;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText)findViewById(R.id.editText);
        btnSubmit = (Button)findViewById(R.id.button);
        lblHasil = (TextView)findViewById(R.id.textView);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aNomor = etNumber.getText().toString();
                int nNomor = Integer.parseInt(aNomor);

                if (aNomor.isEmpty()) {
                    etNumber.setError("Column can't be Empty");
                }else if (nNomor <= 10){
                    lblHasil.setText( aNomor + " is Less Than 10");
                }else{
                    lblHasil.setText(aNomor + " Is Bigger Than 10");
                }
            }
        });
    }
}
