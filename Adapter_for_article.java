
package com.example.elcot.aanmeegam;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.ActionBar;


import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public  class Adapter_for_article extends ArrayAdapter<Product3> {

    ArrayList<Product3> arrayvalue;
    Context context;
    int resource;
    WebView webView;
    protected  Typeface tamil = null;


    public Adapter_for_article(@NonNull Context context, int resource, @NonNull ArrayList<Product3> arrayvalue) {
        super(context, resource, arrayvalue);
        this.context = context;
        this.resource = resource;
        this.arrayvalue = arrayvalue;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_view_content, null, true);
        }

        Product3 rowvalue = getItem(position);

        ImageView imageview = (ImageView) convertView.findViewById(R.id.rowimage);
        Picasso.get().load(rowvalue.getImage()).into(imageview);
        TextView textView = (TextView) convertView.findViewById(R.id.rowtext1);
        textView.setText("helo");


//        TextView textView1 = convertView.findViewById(R.id.rowtext2);
//        textView1.setText(rowvalue.getArt());

        TextView webView = (TextView) convertView.findViewById((R.id.rowtext2));

        webView.setText("helo");

//            imagebutton3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getContext(), "helo", Toast.LENGTH_SHORT).show();
//                    //   WebView webView = view.findViewById((R.id.rowtext2));
////                    WebSettings settings = webView.getSettings();
////                    settings.setDefaultFontSize(25);
//                }
//            });
//        tamil = Typeface.createFromAsset(getContext().getAssets(), "font/BalooThambi-Regular.ttf");
//        textView.setTypeface(tamil);

//        WebSettings settings = webView.getSettings();
//        settings.setDefaultTextEncodingName("utf-8");
//
//      //  settings.setDefaultFontSize(25);
//
//        String newsBody = (rowvalue.getArt()).replace("\r\n", "<br/>");
//
//        webView.loadData(newsBody, "text/html; charset=utf-8", null);
        return convertView;
    }

}






