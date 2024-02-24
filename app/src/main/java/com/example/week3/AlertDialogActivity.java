package com.example.week3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {
    Button buttonBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        buttonBtn = findViewById(R.id.button);

        buttonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DiaLog1();
            }
        });
    }

    public void update(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // Setting Alert Dialog Title
        alertDialogBuilder.setTitle("Cập nhật thành công!!!");

        alertDialogBuilder.setMessage("Bạn có muốn thoát?");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //Đóng Activity hiện tại
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,"Bạn đã click vào nút không đồng ý",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Bạn đã click vào nút hủy",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    //tạo hàm Dialog
    private void DiaLog1(){
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        dialog.setCanceledOnTouchOutside(false);
        //ánh xạ
        EditText editText1 = (EditText)
                dialog.findViewById(R.id.editNumber1);

        //viết code sự kiện
        // Bắt sự kiện click vào nút "Cancel"
        TextView textCancel = (TextView) dialog.findViewById(R.id.cancel_text);
        textCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đóng Dialog
                Toast.makeText(AlertDialogActivity.this,"Bạn đang chọn Cancle",Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        TextView textOke = (TextView) dialog.findViewById(R.id.oke_text);
        textOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đóng Dialog
                Toast.makeText(AlertDialogActivity.this,"Bạn đang chọn OKE",Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        //bắt sự kiện Dialog
        dialog.show(); //hủy gọi dialog.dismiss();
    }
}