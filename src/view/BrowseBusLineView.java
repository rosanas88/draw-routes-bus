package view;

import presenter.BrowseBusLinePresenter;
import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import br.voudeonibus.control.R;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class BrowseBusLineView extends Activity {

	ImageView voltarPrincipal;
	EditText edit_linha;
	ImageView buscarLinha;
	TextView vista;
	Cursor linha;
    String valueEdit;
	BrowseBusLinePresenter presenter = new BrowseBusLinePresenter(this);
	ImageView entrarBuscarLinha;
	AlertDialog.Builder caixaDialogo;
	RadioButton radioIda;
	RadioButton radioVolta;
	String direcao = "";
	

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buscarlinha);
		caixaDialogo = new AlertDialog.Builder(BrowseBusLineView.this);

		entrarBuscarLinha = (ImageView) findViewById(R.id.entrar);
		edit_linha = (EditText) findViewById(R.id.edit_linha);

		radioIda = (RadioButton) findViewById(R.id.ida);
		radioVolta = (RadioButton) findViewById(R.id.volta);
		
		radioIda.setOnClickListener(presenter.getRadioButton());
		radioVolta.setOnClickListener(presenter.getRadioButton());
		
		voltarPrincipal = (ImageView) findViewById(R.id.back_main);
		voltarPrincipal.setOnClickListener(presenter.backToMainView());
		entrarBuscarLinha.setOnClickListener(presenter.showDetailsBusLine());
		
	}


	@Override
	public void onDestroy() {
		super.onDestroy();
	}


	public EditText getEdit_linha() {
		return edit_linha;

	}


	public void setEdit_linha(EditText edit_linha) {
		this.edit_linha = edit_linha;
	}


	public TextView getVista() {
		return vista;
	}


	public void setVista(TextView vista) {
		this.vista = vista;
	}


	public Cursor getLinha() {
		return linha;
	}


	public void setLinha(Cursor linha) {
		this.linha = linha;
	}


	public String getValueEdit() {
		return valueEdit;
	}


	public void setValueEdit(String valueEdit) {
		this.valueEdit = valueEdit;
	}


	public BrowseBusLinePresenter getPresenter() {
		return presenter;
	}


	public void setPresenter(BrowseBusLinePresenter presenter) {
		this.presenter = presenter;
	}


	public AlertDialog.Builder getCaixaDialogo() {
		return caixaDialogo;
	}


	public void setCaixaDialogo(AlertDialog.Builder caixaDialogo) {
		this.caixaDialogo = caixaDialogo;
	}


	public String getDirecao() {
		return direcao;
	}


	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}


	public RadioButton getRadioIda() {
		return radioIda;
	}


	public void setRadioIda(RadioButton radioIda) {
		this.radioIda = radioIda;
	}


	public RadioButton getRadioVolta() {
		return radioVolta;
	}


	public void setRadioVolta(RadioButton radioVolta) {
		this.radioVolta = radioVolta;
	}
    
	

}
