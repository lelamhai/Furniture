package com.example.furniture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.furniture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding?.getRoot());

        val flowerName = arrayOf("Rose", "Lotus", "Lily", "Jasmine",
            "Tulip", "Orchid", "Lavender", "Rosemary", "Sunflower", "Carnation")
        val flowerImages = arrayOf(R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing,
            R.drawable.pngwing, R.drawable.pngwing, R.drawable.pngwing)

        val gridAdapter = GridAdapter(this@MainActivity, flowerName, flowerImages)
        this.binding?.gridView?.setAdapter(gridAdapter);
    }
}