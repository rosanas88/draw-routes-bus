package presenter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import br.voudeonibus.control.R;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;

public class TraceRoute extends MapActivity {

	public static String _SERVER_HTTP_ = "http://sites.google.com/";
	public static String _DIR_KML_ = "site/voudeonibusrj/arquivos/";

	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapa);

		/*
		 * renderizando mapa
		 */
		MapView mapView = (MapView) findViewById(R.id.mapView );
		mapView.setClickable(true);
		mapView.setBuiltInZoomControls(true);
		
		/*
		 * Habilitando bussola para minha localizacao
		 */
		MyLocationOverlay mlo = new MyLocationOverlay(this, mapView);
		mlo.enableCompass();
		mlo.enableMyLocation();
		mapView.getOverlays().add(mlo);
		
		String kml = "onibus_"+BrowseBusLinePresenter.linha +"_"+ BrowseBusLinePresenter.orientacao+".kml";

		Uri uri = Uri.parse("geo:0,0?q=" + _SERVER_HTTP_ + _DIR_KML_
				+ kml.trim());
		
		Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
		mapIntent.setData(uri);
		startActivity(Intent.createChooser(mapIntent, "Sample Map"));

		Toast.makeText( this,"Rota de "+ BrowseBusLinePresenter.orientacao +" "+ BrowseBusLinePresenter.linha,
				Toast.LENGTH_LONG).show();
		

	}
	
	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	
}