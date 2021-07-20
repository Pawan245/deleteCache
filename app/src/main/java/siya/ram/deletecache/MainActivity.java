package siya.ram.deletecache;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.ram.hanumanjetpacklibrery.deletecache.deleteCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deleteCache(MainActivity.this);
    }
}