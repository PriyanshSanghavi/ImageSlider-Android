package com.example.imageslider1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.slice.SliceManager;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> sliders = new ArrayList<>();
        sliders.add(new SlideModel(R.drawable.img1, ScaleTypes.FIT));
        sliders.add(new SlideModel(R.drawable.img2, ScaleTypes.FIT));
        sliders.add(new SlideModel(R.drawable.img3, ScaleTypes.FIT));
        sliders.add(new SlideModel(R.drawable.img4, ScaleTypes.FIT));
        imageSlider.setImageList(sliders,ScaleTypes.FIT);
    }
}