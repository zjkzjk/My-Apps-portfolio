package com.example.zzzzzzzjk.myappsportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button movie,stock,reader,news,project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findView
        textView = (TextView) findViewById(R.id.table_name);
        movie = (Button) findViewById(R.id.movie);
        stock = (Button) findViewById(R.id.stock);
        reader = (Button) findViewById(R.id.reader);
        news = (Button) findViewById(R.id.news);
        project = (Button) findViewById(R.id.project);


        //setOnclickListener
        movie.setOnClickListener(new ButtonListener());
        stock.setOnClickListener(new ButtonListener());
        reader.setOnClickListener(new ButtonListener());
        news.setOnClickListener(new ButtonListener());
        project.setOnClickListener(new ButtonListener());

    }
    private class ButtonListener implements View.OnClickListener {

        public void onClick(View v) {
            switch(v.getId()){
                case R.id.movie:
                    Toast.makeText(MainActivity.this,"启动应用：热门新闻",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.stock:
                    Toast.makeText(MainActivity.this,"启动应用：股票雄鹰",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.reader:
                    Toast.makeText(MainActivity.this,"启动应用：XYZ阅读器",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.news:
                    Toast.makeText(MainActivity.this,"启动应用：最新闻",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.project:
                    Toast.makeText(MainActivity.this,"启动应用：毕业设计",Toast.LENGTH_SHORT).show();
                    break;

            }
        }

    }
}
