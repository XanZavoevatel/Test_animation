package ru.lncloud.testanimation

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import ru.lncloud.testanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.imageView.setOnClickListener{

            //изменяем позицию по нажатию на картинку

            ObjectAnimator.ofFloat(it, View.Y, 10F).start()
            ObjectAnimator.ofFloat(it, View.X, 500F).start()

            //изменяем прозрачность
            ObjectAnimator.ofFloat(it, View.ALPHA, 0.5F).start()

            //ротация
            ObjectAnimator.ofFloat(it, View.ROTATION, 35F).start()

            //скалирование
            ObjectAnimator.ofFloat(it, View.SCALE_Y, 1F).start()
            ObjectAnimator.ofFloat(it, View.SCALE_X, 1F).start()
            
        }
    }
}