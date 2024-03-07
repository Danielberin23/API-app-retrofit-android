package com.example.jokes;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//@RestController
//@RequestMapping("/api")
public class ChuckNorrisController implements Callback<List<Joke>> {
    static final String BASE_URL = "127.0.0.1:8088/";

    private CallBack_Joke callBackJoke;


    public JokesController(CallBack_Joke callBackJokes) {
        this.callBackJoke = callBackJokes;
    }

    public void fetchAllMovies() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ChuckNorrisApiClient JokesAPI = retrofit.create(ChuckNorrisApiClient.class);

        Call<List<Joke>> call = JokesAPI.loadMovies();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Joke>> call, Response<List<Joke>> response) {
        if (response.isSuccessful()) {
            List<Joke> movies = response.body();
            callBackJoke.success(movies);
            int x = 0;
        } else {
            callBackJoke.error("" + response.errorBody());
            Log.d("pttt", "" + response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<Joke>> call, Throwable t) {
        callBackJoke.error(t.getMessage());
        t.printStackTrace();
    }

    @Override
    public void onResponse(Call<List<Joke>> call, Response<List<Joke>> response) {

    }

    @Override
    public void onFailure(Call<List<Joke>> call, Throwable t) {

    }


    public interface CallBack_Joke {
        void success(List<Joke> movies);
        void error(String error);
    }
}
