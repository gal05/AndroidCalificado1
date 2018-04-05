package pe.edu.guerra.calificado1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vista2 extends AppCompatActivity {
Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
    Button boton=(Button)findViewById(R.id.boto2);
    boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Vista2.this, Vista3.class));
        }
    });

    }
}
