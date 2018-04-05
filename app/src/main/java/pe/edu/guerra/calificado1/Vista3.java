package pe.edu.guerra.calificado1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Vista3 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView displayText;
    String  radioboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista3);

        radioGroup =  (RadioGroup) findViewById(R.id.radioGroup);


        }



    public void showDialog(View view){


        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Alert Dialog Title");
        alertDialog.setMessage("Su pedido ya esta "+radioboton);
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        dialog.dismiss();//
                    }
                });
        alertDialog.show();

    }

public void radioButtonClicked(View view){
    boolean checked = ((RadioButton) view).isChecked();
    // This check which radio button was clicked
    switch (view.getId()) {
        case R.id.radioButton1:
            if (checked)
              radioboton="masa gruesa";
            break;

        case R.id.radioButton2:
            radioboton="masa delgada";
            break;

        case R.id.radioButton3:
            radioboton="masa artesanal";
            break;

    }

}



}
