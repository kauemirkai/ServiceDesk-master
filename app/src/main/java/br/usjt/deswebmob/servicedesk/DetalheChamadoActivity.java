package br.usjt.deswebmob.servicedesk;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class DetalheChamadoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        TextView nome = (TextView)findViewById(R.id.chamado_selecionado);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(ListarChamadosActivity.NOME));
    }
}