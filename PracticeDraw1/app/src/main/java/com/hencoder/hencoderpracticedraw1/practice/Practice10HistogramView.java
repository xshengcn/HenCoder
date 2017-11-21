package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        float density = getResources().getDisplayMetrics().density;
        float padding = 16 * density;

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(density);

        // x轴
        canvas.drawLine(padding, canvas.getHeight() - padding, canvas.getWidth() - padding,
                canvas.getHeight() - padding, paint);
        // y轴
        canvas.drawLine(padding, padding, padding, canvas.getHeight() - padding, paint);
    }
}
