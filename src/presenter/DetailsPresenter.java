package presenter;

import view.DetailsView;
import view.MainView;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class DetailsPresenter {
	
	private DetailsView detailsView;

	public DetailsPresenter(DetailsView view){
		this.detailsView = view;	
	}

	public OnClickListener backToMainView() {
		return eventBack;
	}

	OnClickListener eventBack = new View.OnClickListener() {

		public void onClick(View v) {
			detailsView.startActivity(new Intent(detailsView.getApplicationContext(),MainView.class));
		}
	};

}
