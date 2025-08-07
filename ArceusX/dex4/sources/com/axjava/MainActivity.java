package com.axjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    public String GameActivity = "com.roblox.client.startup.ActivitySplash";
    public boolean hasLaunched = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!this.hasLaunched) {
            try {
                this.hasLaunched = true;
                startActivity(new Intent(this, Class.forName(this.GameActivity)));
                Main.Start(this);
            } catch (ClassNotFoundException e) {
                Toast.makeText(this, "Failed to find Roblox's MainActivity.", 1).show();
            }
        }
    }
}
