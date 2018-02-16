package presenter;

import view.BrowseBusLineView;
import view.DetailsView;
import view.MainView;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainPresenter {

	private MainView mainView;
	
	public MainPresenter(MainView view){
		this.mainView = view;	
	}
	
	public OnClickListener seeDetailView() {
		return new View.OnClickListener() {

			public void onClick(View v) {
				mainView.startActivity(new Intent(mainView.getBaseContext(),DetailsView.class));
			}
		};
	}
	
	public OnClickListener browseBusLineView() {
		return new View.OnClickListener() {

			public void onClick(View v) {
				mainView.startActivity(new Intent(mainView.getBaseContext(),BrowseBusLineView.class));
			}
		};
	}

	
}
