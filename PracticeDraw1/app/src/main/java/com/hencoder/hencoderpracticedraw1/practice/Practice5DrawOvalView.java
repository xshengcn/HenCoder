package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆

        int ovalWidth = 300;
        int ovalHeight = 150;

        RectF rectF = new RectF();
        rectF.left = (canvas.getWidth() - ovalWidth) / 2;
        rectF.top = (canvas.getHeight() - ovalHeight) / 2;
        rectF.right = rectF.left + ovalWidth;
        rectF.bottom = rectF.top + ovalHeight;
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawOval(rectF, paint);
    }
}
