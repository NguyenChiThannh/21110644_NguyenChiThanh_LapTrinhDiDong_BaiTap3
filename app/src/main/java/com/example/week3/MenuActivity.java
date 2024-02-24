package com.example.week3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    TextView textView;
    Button btnButtonPopmenu;
    Button btnButtonContextmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //PopUp menu
        btnButtonPopmenu = (Button) findViewById(R.id.btnButtonPopMenu);
        btnButtonPopmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopupMenu();
            }
        });


        //Context Menu
        btnButtonContextmenu = (Button) findViewById(R.id.btnButtonContextMenu);
        registerForContextMenu(btnButtonContextmenu);

    }


    // Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuSetting:
            //Lệnh
                break;
            case R.id.menuShare:
                break;
            case R.id.menuLogout:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    //popupMenu
    public void ShowPopupMenu(){
        // Initializing the popup menu and giving the reference as current context
        PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btnButtonPopmenu);

        // Inflating popup menu from popup_menu.xml file
        popupMenu.getMenuInflater().inflate(R.menu.menu_setting, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                // Toast message on menu item clicked
                Toast.makeText(MenuActivity.this, "You Clicked " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        // Showing the popup menu
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        // Inflate the menu resource to add menu items
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        menu.setHeaderTitle("Context Menu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuSetting:
            //lệnh
                Toast.makeText(MenuActivity.this,"Bạn đang chọn Setting",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuShare:
                textView.setText("Chia sẻ");
                break;
            case R.id.menuLogout:
                break;
        }
        return super.onContextItemSelected(item);
    }
}