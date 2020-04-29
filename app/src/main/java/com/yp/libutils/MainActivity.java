package com.yp.libutils;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.yp.yplib.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        HexUtils.str2Double("1233");
        Utils.getStr();
//        理解分为四步
//        第一步：生成moudle 添加到项目
//        第二部：修改manifests 文件，
//        第三步：修改gradle文件，并添加要打印的包名等内容
//        第四幅：录入下面命令，gradlew makeJar 导出jar 包；jar 包位置在moudel build 文件 intermediates 下，aar_main_jar目录下
//gradlew makeJar
    }

}
