package com.example.my_dell.retrofit;



import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("view")
     Call<Data> getContacts();



}
