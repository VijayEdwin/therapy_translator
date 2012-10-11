package come.vijayedwin.therapy_translator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.media.*;
import android.content.*;
import java.lang.Object;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
	}	
			public void sendMessage_1(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.first);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}
			
			public void sendMessage_2(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.two);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_3(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.three);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}

			public void sendMessage_4(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.four);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_5(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.five);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_6(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.six);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_7(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.seven);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}

			public void sendMessage_8(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eight);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_9(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nine);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_10(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ten);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}


			public void sendMessage_11(View view) {
				MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eleven);
				mediaPlayer.start(); // no need to call prepare(); create() does that for you
		
	}



}
