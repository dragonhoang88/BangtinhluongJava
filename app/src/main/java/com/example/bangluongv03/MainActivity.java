package com.example.bangluongv03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText tangcabanngay, tangcangaynghi, ngaynghikluong, congthang31, songaynghi80,
            luongocban, chuyencan, xangxe, nhao, thamnien, trachnhiem, trocapkhac, doanphi;
    TextView cangay100, luongngaycong, luongtangca150, luongtangcacn200, tongluong, tongphucapht, tongluongtinhtc,
            tongluongdongbhxh, tientru80, trichdongbhxh, txt_thuclinh;
    Button nut_Thuclinh;

    double tcabanngay, tcangaynghi, nnkluong, cthang31, sonnghi80,//EditText
            lcoban, ccan, xxe, nha, tnien, tnhiem, tckhac, dphi;

    double cngay, lngaycong, ltangca150, ltangcacn200, tluong, tphucapht, tluongtinhtc,//TextView
            tluongdongbhxh, ttru80, trichbhxh, tlinh;

    double tiennghikhongluong, tienluongngaycong31;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Anhxa();
        tinhthuclinh();

        trachnhiem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                trachnhiem.setText("0");
            }
        });


        nut_Thuclinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhthuclinh();
                NumberFormat formatter = new DecimalFormat("#,###");

                cangay100.setText(formatter.format(cngay));

                // luongngaycong.setText("");
                //luongngaycong.setText(String.format("%.0f", lngaycong));
                luongngaycong.setText(formatter.format(lngaycong));

                // luongtangca150.setText("");
                luongtangca150.setText(formatter.format(ltangca150));

                //luongtangcacn200.setText("");
                luongtangcacn200.setText(formatter.format(ltangcacn200));

                // tongluong.setText("");
                tongluong.setText(formatter.format(tluong));

                //tongphucapht.setText("");
                tongphucapht.setText(formatter.format(tphucapht));

                //tongluongtinhtc.setText("");
                tongluongtinhtc.setText(formatter.format(tluongtinhtc));

                //tongluongdongbhxh.setText("");
                tongluongdongbhxh.setText(formatter.format(tluongdongbhxh));

                //tientru80.setText("");
                tientru80.setText(formatter.format(ttru80));

                //trichdongbhxh.setText("");
                trichdongbhxh.setText(formatter.format(trichbhxh));

                // txt_thuclinh.setText("");
                txt_thuclinh.setText(formatter.format(tlinh));
            }
        });


    }

    private void Anhxa() {

        tangcabanngay =  findViewById(R.id.ed_tangcangay150);
        tangcangaynghi =  findViewById(R.id.ed_tangcaCN200);
        ngaynghikluong = findViewById(R.id.ed_ngaynghikluong);
        congthang31 =  findViewById(R.id.ed_cognthang);
        songaynghi80 =  findViewById(R.id.ed_songaynghi80);
        luongocban =  findViewById(R.id.ed_luongcoban);
        chuyencan =  findViewById(R.id.ed_chuyencan);
        xangxe = findViewById(R.id.ed_xangxe);
        nhao = findViewById(R.id.ed_nhao);
        trachnhiem =  findViewById(R.id.ed_trachnhiem);
        trocapkhac =  findViewById(R.id.edit_trocapkhac);
        doanphi =  findViewById(R.id.ed_doanphi);
        thamnien = findViewById(R.id.ed_thamnien);

        cangay100 = findViewById(R.id.tv_cangay100);
        luongngaycong = findViewById(R.id.tv_luongngaycong);
        luongtangca150 = findViewById(R.id.tv_luongtangcangay150);
        luongtangcacn200 = findViewById(R.id.tv_luongtangcaCN200);
        tongluong = findViewById(R.id.tv_tongluong);
        tongphucapht = findViewById(R.id.tv_tongphucap);
        tongluongtinhtc = findViewById(R.id.tv_tongluongtinhtc);
        tongluongdongbhxh = findViewById(R.id.tv_tongluongdongbhxh);
        tientru80 = findViewById(R.id.tv_tientru80);
        trichdongbhxh = findViewById(R.id.tv_trichdongbh);
        txt_thuclinh = findViewById(R.id.tv_thuclinh);


        nut_Thuclinh =  findViewById(R.id.bt_thuclinh);
    }

    private void tinhthuclinh() {
        try {


            tcabanngay = Double.parseDouble(tangcabanngay.getText().toString().trim());
            tcangaynghi = Double.parseDouble(tangcangaynghi.getText().toString().trim());
            nnkluong = Double.parseDouble(ngaynghikluong.getText().toString().trim());
            cthang31 = Double.parseDouble(congthang31.getText().toString().trim());
            sonnghi80 = Double.parseDouble(songaynghi80.getText().toString().trim());
            lcoban = Double.parseDouble(luongocban.getText().toString().replace(",","").trim());
            ccan = Double.parseDouble(chuyencan.getText().toString().replace(",","").trim());
            xxe = Double.parseDouble(xangxe.getText().toString().replace(",","").trim());
            nha = Double.parseDouble(nhao.getText().toString().replace(",","").trim());
            tnien = Double.parseDouble(thamnien.getText().toString().replace(",","").trim());
            tnhiem = Double.parseDouble(trachnhiem.getText().toString().replace(",","").trim());
            tckhac = Double.parseDouble(trocapkhac.getText().toString().replace(",","").trim());
            dphi = Double.parseDouble(doanphi.getText().toString().replace(",","").trim());


            cngay = cthang31 - sonnghi80 - nnkluong;
            lngaycong = lcoban - ttru80 - tiennghikhongluong + tienluongngaycong31;
            tiennghikhongluong = lcoban / 26 * nnkluong;
            tienluongngaycong31 = lcoban / 26 * ( cthang31 - 26 );
            ltangca150 = tluongtinhtc / 26 / 8 * 1.5 * tcabanngay;
            tluongtinhtc = lcoban + ccan + tnien + tnhiem;
            ltangcacn200 = tluongtinhtc / 26 / 8 * 1.5 * tcangaynghi;
            tluong = lngaycong + ltangca150 + ltangcacn200;
            tphucapht = ccan + xxe + nha + tnien + tnhiem;
            tluongdongbhxh = tnien + tnhiem + lcoban;
            ttru80 = lcoban / 26 * 0.2 * sonnghi80;
            trichbhxh = tluongdongbhxh * 0.105;

            tlinh = tluong + tphucapht - trichbhxh - dphi + tckhac;

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
