package com.hisu.tv.showcasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import com.hisu.tv.showcasedemo.tutoshowcase.TutoShowcase;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
		findViewById(R.id.display).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				displayTuto();
			}
		});
	}

	protected void displayTuto() {
		TutoShowcase.from(this)
		            .setListener(new TutoShowcase.Listener() {
			            @Override
			            public void onDismissed() {
				            Toast.makeText(MainActivity.this, "Tutorial dismissed", Toast.LENGTH_SHORT).show();
			            }
		            })
		            .setContentView(R.layout.tuto_showcase_tuto_sample)
		            .setFitsSystemWindows(true)
		            .on(R.id.about)
		            .addCircle()
		            .withBorder()
		            .onClick(new View.OnClickListener() {
			            @Override
			            public void onClick(View v) {

			            }
		            })

		            .on(R.id.swipable)
		            .displaySwipableLeft()
		            .delayed(399)
		            .animated(true)

		            .show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.tutoshowcase_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}
