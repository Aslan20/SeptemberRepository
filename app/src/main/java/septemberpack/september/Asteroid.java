package septemberpack.september;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Random;

/**
 * Created by Vlady on 22.10.2015.
 */

// Данный класс реализует отрисовку астероидов

public class Asteroid {

    Bitmap bitmap; // Картинка астероида
    private int x; // Координата по x
    private int y; // Координата по y
    private Random random;

    public Asteroid(Bitmap bmp){
        this.bitmap = bmp;
        random = new Random();
    }

    public void draw(Canvas canvas){

        canvas.drawBitmap(bitmap, 500, y, null);
    }

    public void update(){
        if(y > 1400)
            y = -80;
        y += GamePanel.speed;
    }

}
