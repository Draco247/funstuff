// import logo from './logo.svg';
import './App.css';
import React, { useEffect, useState} from 'react';
import PokemonCard from './Components/PokemonCard';
import Search from './Components/Search';

function App() {
  const [allPokemon, setPokemon] = useState([]);
  const [loadPokemon, setLoadPokemon] = useState('https://pokeapi.co/api/v2/pokemon');

  const { search } = window.location;
  const query = new URLSearchParams(search).get('s');
  const [searchQuery, setSearchQuery] = useState(query || '');


  const filterPokemon = (allPokemon, query) => {
    if (!query){
      return allPokemon;
    }
    return allPokemon.filter((pokemon) => {
      const Name = pokemon.name.toLowerCase();
      return Name.includes(query);
    })
  }
  const filtered = filterPokemon(allPokemon, searchQuery);

  // const toggleBtnHandler = () => {
  //       return this.set({
  //           clicked: !this.state.clicked,
  //           searchedValue: this.state.value === "" ? "TSLA" : this.state.value,  //<------- here
  //       });
  //   };

  const getAll = async () => {
    const res = await fetch(loadPokemon);
    const data = await res.json();
    setLoadPokemon(data.next);
    await console.log(loadPokemon)

  function singlePokemon(result) {
    result.forEach(async (pokemon) => {
      const res = await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemon.name}`)
      const data = await res.json();
      setPokemon(currentList => [...currentList, data]);
    });
  }
  singlePokemon(data.results)
  await console.log(allPokemon)
}
useEffect(()=>{
  // getAll()
},[])

  return (
      <div className="app-container">
        <h1>Pokemon Kingdom .</h1>
        <Search
            searchQuery={searchQuery}
            setSearchQuery={setSearchQuery}
        />

        <div className="pokemon-container">
        <div className="all-container">
            {allPokemon.map((pokemon,index)=>
                <PokemonCard
                    id = {pokemon.id}
                    name = {pokemon.name}
                    image = {pokemon.sprites.other.dream_world.front_default}
                    type={pokemon.types[0].type.name}
                    key={index}
                    height = {pokemon.height}
                    weight = {pokemon.weight}
                />
            )}
          {/*{filtered.map((pokemon,index)=>*/}
          {/*    <PokemonCard*/}
          {/*        id = {pokemon.id}*/}
          {/*        name = {pokemon.name}*/}
          {/*        image = {pokemon.sprites.other.dream_world.front_default}*/}
          {/*        type={pokemon.types[0].type.name}*/}
          {/*        key={index}*/}
          {/*        height = {pokemon.height}*/}
          {/*        weight = {pokemon.weight}*/}
          {/*    />*/}
          {/*)}*/}
        </div>
        <button className="load-more" onClick={()=>getAll()}>More Pokemons</button>
      </div>
      </div>
  );
}

export default App;
