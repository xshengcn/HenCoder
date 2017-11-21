package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形

        int rectWidth = 400;
        int rectHeight = 200;

        RectF rectF = new RectF();
        rectF.left = (canvas.getWidth() - rectWidth) / 2;
        rectF.top = (canvas.getHeight() - rectHeight) / 2;
        rectF.right = rectF.left + rectWidth;
        rectF.bottom = rectF.top + rectHeight;

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        int xRadius = 32;
        int yRadius = 32;

        canvas.drawRoundRect(rectF, xRadius, yRadius, paint);
    }
}
