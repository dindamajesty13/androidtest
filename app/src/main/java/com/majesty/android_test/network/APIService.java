package com.majesty.android_test.network;

import com.majesty.android_test.model.pokemoninfo.PokemonInfoAPI;
import com.majesty.android_test.model.pokemonlist.PokemonListAPI;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {

    @GET("pokemon?limit=20")
    Observable<PokemonListAPI> fetchPokemonList(@Query("offset") int offset);

    @GET("pokemon/{name}")
    Observable<PokemonInfoAPI> fetchPokemonInfo(@Path("name") String name);
}
