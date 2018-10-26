package com.danielmirrha.mycookrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;



public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;
    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, fabtnsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);
        fabtnsair = (FloatingActionButton) findViewById(R.id.fab_sair);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, newrecipe.class);
            startActivity (i);
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Receitas.class);
                startActivity (i);
            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
            }
            });
        fabtnsair.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    new Handler().postDelayed(new Runnable() {
                        /*
                         * Exibindo splash com um timer.
                         */
                        @Override
                        public void run() {
                            finish();
                            System.exit(0);
                        }
                    }, SPLASH_TIME_OUT);

                }
        });
    }

}
