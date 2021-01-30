package com.demo.hellojitpack;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.demo.lib1.Lib1Util;
import com.demo.lib2.Lib2Util;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    System.out.println(Lib1Util.getVersion() + ":" + Lib2Util.getVersion());
  }
}