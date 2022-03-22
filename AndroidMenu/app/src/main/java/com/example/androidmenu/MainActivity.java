package com.example.androidmenu;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public class MainActivity extends Activity {
    //用来标示菜单项被单击的次数
    static int MenuUploadCounter = 0;
    static int MenuDownlaodCounter = 0;
    static final int MENU_01 = Menu.FIRST;
    static final int MENU_02 = Menu.FIRST + 1;
    //用来标示 MENU_UPLOAD 的两个子菜单项 ID
    static final int SUB_MENU_UPLOAD_A = Menu.FIRST+2;
    static final int SUB_MENU_UPLOAD_B = Menu.FIRST+3;
    static final int SUB_MENU_UPLOAD_C = Menu.FIRST+4;
    static final int SUB_MENU_UPLOAD_D = Menu.FIRST+5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //使用选项菜单时，必须重载的方法
    //初始化选项菜单时，会调用 onCreateOptionsMenu()方法
    //一般用来初始化菜单子项的相关内容，设置菜单子项自身的子项 ID 和组 ID
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //第 1 个参数 groupId 是组 ID
        //第 2 个参数 itemid 是子项 ID,是每一个菜单子项的唯一标示
        //第 3 个参数 order 是定义菜单子项在选项菜单中的排列先后顺序
        //第 4 个参数是菜单子项所显示的标题
        //为菜单添加子菜单，此时 uploadMenu 相当于父菜单
        SubMenu uploadMenu = menu.addSubMenu(0, MENU_01, 1,"城市空气");
        uploadMenu.setHeaderTitle("空气系统设置");
        uploadMenu.add(0, SUB_MENU_UPLOAD_A, 0, "设置参数 A");
        uploadMenu.add(0, SUB_MENU_UPLOAD_B, 0, "设置参数 B");
        SubMenu menu2 = menu.addSubMenu(0, MENU_02, 1,"城市温度");
        menu2.setHeaderTitle("温度系统设置");
        menu2.add(0, SUB_MENU_UPLOAD_C, 0, "设置参数 C");
        menu2.add(0, SUB_MENU_UPLOAD_D, 0, "设置参数 D");
        return true;
    }
    //onPrepareOptionsMenu()方法在每次显示 Menu 之前都会调用，一般用来执行更新操作
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }
    //当被菜单项被点击之后执行 onOptionsItemSelected()方法
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {//通过该方法获取菜单子项的 id
            case SUB_MENU_UPLOAD_A:
                MenuDownlaodCounter++;
                return true;
            case SUB_MENU_UPLOAD_B:
                MenuUploadCounter++;
                return true;
        }
        return false;
    }
}