package com.view.test.libary_view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
/* @author Adrián García Lomas
        * 这是自定义 刻度盘 ，用法：
        *
        *  <com.source.widget.velocimeterlibrary.VelocimeterView
        android:layout_gravity="center"
        android:id="@+id/velocimeter2"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        app:inside_progress_color="@color/inside_progress"
        app:external_progress_color="@color/external_progress"
        app:progress_blur_color="@color/external_progress"
        app:bottom_velocimeter_color="@color/bottom_velocimeter"
        app:internal_velocimeter_color="@color/internal_velocimeter"
        app:needle_color="@color/needle"
        app:needle_blur_color="@color/needle"
        app:digital_number_color="@color/digital_number"
        app:digital_number_blur_color="@color/digital_number"
        app:show_bottom_bar="false"
        app:max="100"
        app:units="mph"
        />*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMaterial(View view){
        Intent intent=new Intent(this,MaterialViewTestActivity.class);
        startActivity(intent);
    }
}
