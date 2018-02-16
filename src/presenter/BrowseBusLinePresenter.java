package presenter;

import view.BrowseBusLineView;
import view.MainView;
import model.LinhaModel;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class BrowseBusLinePresenter {

	public BrowseBusLineView busLineView;
	public static String linha;
	public static String orientacao;
	public LinhaModel linhaModel = new LinhaModel();

	
	public BrowseBusLinePresenter(BrowseBusLineView view) {
		this.busLineView = view;
	}

	public OnClickListener backToMainView() {
		return eventBack;
	}

	OnClickListener eventBack = new View.OnClickListener() {

		public void onClick(View v) {
			busLineView.startActivity(new Intent(busLineView
					.getApplicationContext(), MainView.class));
		}
	};

	public OnClickListener getRadioButton() {
		return eventRadioButton;
	}

	OnClickListener eventRadioButton = new View.OnClickListener() {

		public void onClick(View v) {
			if (busLineView.getRadioIda().isChecked()) {
				busLineView.setDirecao("Ida");
			} else if (busLineView.getRadioVolta().isChecked()) {
				busLineView.setDirecao("Volta");
			}

		}
	};

	public OnClickListener showDetailsBusLine() {
		return eventDetailsBusLine;
	}

	OnClickListener eventDetailsBusLine = new View.OnClickListener() {

		public void onClick(View v) {
			linhaModel.setNumero(busLineView.getEdit_linha().getText()
					.toString());
			linha = linhaModel.getNumero();

			if (busLineView.getDirecao().equals("Ida")) {
				orientacao = busLineView.getDirecao().toLowerCase();

				busLineView.startActivity(new Intent(busLineView
						.getBaseContext(), TraceRoute.class));


			} else if (busLineView.getDirecao().equals("Volta")) {

				orientacao = busLineView.getDirecao().toLowerCase();
								
				busLineView.startActivity(new Intent(busLineView
						.getBaseContext(), TraceRoute.class));
			} else {
				
				Toast.makeText( busLineView.getBaseContext(),"Selecione um destino de Ida ou Volta",
						Toast.LENGTH_LONG).show();
			}


		}

	};

}
