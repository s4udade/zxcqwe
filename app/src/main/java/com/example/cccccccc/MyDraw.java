package com.example.cccccccc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        int r = 35;
        int m = 20;
        Random rand = new Random();
        int array[][] = new int[canvas.getHeight() / (r*2 + m)]
                [canvas.getWidth() / (r*2 + m)];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextInt(2);
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == 0){
                    paint.setStyle(Paint.Style.STROKE);
                }
                else{
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                }
                canvas.drawCircle(j * (r*2+m) + r + m, i * (r*2+m) + r + m, r, paint);
            }
        }
    }
}


