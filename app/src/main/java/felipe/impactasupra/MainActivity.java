package felipe.impactasupra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btlogin = (Button) findViewById(R.id.btlogin);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tlogin = (TextView) findViewById(R.id.tlogin);
                TextView tsenha = (TextView) findViewById(R.id.tSenha);
                String login = tlogin.getText().toString();
                String senha = tsenha.getText().toString();
                if(login.equals("supra")&&senha.equals("teste123")) {
                    alert("Login realizado com sucesso");
                }else{
                    alert("login ou senha incorreto");
                }

         Button btlogin = (Button) findViewById(R.id.btlogin);
                btlogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setContentView(R.layout.segundatela);
                    }
                });

            }
        });

    }
    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

}