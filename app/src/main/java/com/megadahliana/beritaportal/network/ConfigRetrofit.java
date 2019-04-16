package com.megadahliana.beritaportal.network;

import android.support.v7.app.AppCompatActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit extends AppCompatActivity {

    //tambahan
    public static final String API_URL =
    "http://192.168.43.169/portal_berita_imanews/portal_berita-master/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public ApiService service = retrofit.create(ApiService.class);
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_config_retrofit);
//  }
}
