package view;

import presenter.MainPresenter;
import android.app.Activity;
import android.os.Bundle;
import br.voudeonibus.control.R;
import android.widget.ImageView;

public class MainView extends Activity {

	ImageView details;
	ImageView entrarMain;
	ImageView voltarDetalhes;
    MainPresenter presenter = new MainPresenter(this);
	
	
	
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);

		details = (ImageView) findViewById(R.id.details);
		entrarMain = (ImageView) findViewById(R.id.entre);

		details.setOnClickListener(presenter.seeDetailView());
		entrarMain.setOnClickListener(presenter.browseBusLineView());
	}

}
