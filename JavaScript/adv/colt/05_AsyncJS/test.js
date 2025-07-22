const BASE_URL = "https://pokeapi.co/api/v2/pokemon";

async function firstPokemon() {
  const res = await fetch(`${BASE_URL}/1`);

  console.log("Hello world! async");
}

firstPokemon();
console.log("Hello world! sync");