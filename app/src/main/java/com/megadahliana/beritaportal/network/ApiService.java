package com.megadahliana.beritaportal.network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface ApiService {

    @GET("tampil_berita.php")
    Call<Response> getAllBerita();
}
