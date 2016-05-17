package co.infinum.pokemon.mvp.interfaces;

import java.util.List;

import co.infinum.pokemon.models.Pokedex;
import co.infinum.pokemon.models.Pokemon;

/**
 * Created by Ivan on 16/05/16.
 */
public interface MvpPokedex {

    interface Interactor extends MvpBase.Interactor {

        void loadKnownPokemonList(MvpListener<Pokedex> pokemonListListener);

        boolean addPokemon(Pokemon pokemon);
    }

    interface Presenter extends MvpBase.Presenter {

        void loadPokedex();

        void onPokemonSelected(Pokemon pokemon);

        void addPokemon(String contents);
    }

    interface View extends MvpBase.View {

        void showPokemons(List<Pokemon> pokemons);

        void showPokemonDetails(Pokemon pokemon);

        void newPokemon(Pokemon pokemon);
    }
}
