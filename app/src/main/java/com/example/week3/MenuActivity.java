package com.example.week3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupMenu;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting,menu);
        return super.onCreateOptionsMenu(menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.menuSetting:
//            //Lệnh
//                break;
//            case R.id.menuShare:
//                break;
//            case R.id.menuLogout:
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }

//    private void ShowPopupMenu(){
//        PopupMenu popupMenu = new PopupMenu(this,
//                );
//        popupMenu.getMenuInflater().inflate(R.menu.menu_setting,popupMenu.getMenu());
//        popupMenu.show();
//    }
}