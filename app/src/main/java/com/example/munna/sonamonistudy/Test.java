package com.example.munna.sonamonistudy;

import android.content.Context;
import android.graphics.*;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Test extends AppCompatActivity {

    RelativeLayout relativeLayout;
    Paint paint;
    View view;
    Path path2;
    Bitmap bitmap;
    Canvas canvas;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        button = (Button)findViewById(R.id.button);

        view = new SketchSheetView(Test.this);

        paint = new Paint();

        path2 = new Path();

        relativeLayout.addView(view, new Toolbar.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT));

        paint.setDither(true);

        paint.setColor(android.graphics.Color.parseColor("#ffffff"));

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeJoin(Paint.Join.ROUND);

        paint.setStrokeCap(Paint.Cap.ROUND);

        paint.setStrokeWidth(5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                path2.reset();

            }
        });
    }


    class SketchSheetView extends View {

        public SketchSheetView(Context context) {

            super(context);

            bitmap = Bitmap.createBitmap(820, 480, Bitmap.Config.ARGB_4444);

            canvas = new Canvas(bitmap);

            this.setBackgroundColor(Color.RED);
        }

        private ArrayList<DrawingClass> DrawingClassArrayList = new ArrayList<DrawingClass>();

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            DrawingClass pathWithPaint = new DrawingClass();

            canvas.drawPath(path2, paint);

            if (event.getAction() == MotionEvent.ACTION_DOWN) {

                path2.moveTo(event.getX(), event.getY());

                path2.lineTo(event.getX(), event.getY());
            }
            else if (event.getAction() == MotionEvent.ACTION_MOVE) {

                path2.lineTo(event.getX(), event.getY());

                pathWithPaint.setPath(path2);

                pathWithPaint.setPaint(paint);

                DrawingClassArrayList.add(pathWithPaint);
            }

            invalidate();
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (DrawingClassArrayList.size() > 0) {

                canvas.drawPath(
                        DrawingClassArrayList.get(DrawingClassArrayList.size() - 1).getPath(),

                        DrawingClassArrayList.get(DrawingClassArrayList.size() - 1).getPaint());
            }
        }
    }

    public class DrawingClass {

        Path DrawingClassPath;
        Paint DrawingClassPaint;

        public Path getPath() {
            return DrawingClassPath;
        }

        public void setPath(Path path) {
            this.DrawingClassPath = path;
        }


        public Paint getPaint() {
            return DrawingClassPaint;
        }

        public void setPaint(Paint paint) {
            this.DrawingClassPaint = paint;
        }
    }

}