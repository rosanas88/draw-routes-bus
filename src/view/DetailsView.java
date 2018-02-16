package view;

import presenter.DetailsPresenter;
import android.app.Activity;
import android.os.Bundle;
import br.voudeonibus.control.R;
import android.widget.ImageView;

public class DetailsView extends Activity {
	
	ImageView voltarDetalhes;
	DetailsPresenter presenter = new DetailsPresenter(this);
	

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_app);
		voltarDetalhes = (ImageView) findViewById(R.id.back_main);
		voltarDetalhes.setOnClickListener(presenter.backToMainView());
	}
	
}
