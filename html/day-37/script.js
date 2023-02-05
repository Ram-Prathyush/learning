const poke_container = document.getElementById('poke_container')
const pokemon_count = 251;
const colors ={
    normal: '#F5F5F5', 
	fire: '#EE8130',
	water: '#6390F0',
	electric: '#F7D02C',
	grass: '#7AC74C',
	ice: '#96D9D6',
	fighting: '#E6E0D4',
	poison: '#A33EA1',
	ground: '#E2BF65',
	flying: '#A98FF3',
	psychic: '#eaeda1',
	bug: '#f8d5a3', 
	rock: '#B6A136',
	ghost: '#735797',
	dragon: '#97b3e6', 
	dark: '#705746',
	steel: '#B7B7CE',
	fairy: '#D685AD',
}

const main_types = Object.keys(colors)

const fetchPokemons = async () => {
    for(let i = 1; i <= pokemon_count; i++)
    await getPokemon(i)
}

const getPokemon = async (id) => {
	
    const url ='https://pokeapi.co/api/v2/pokemon/'+id
    const res = await fetch(url);
    const data= await res.json();
	console.log(data);
	console.log(id);
    createPokemonCard(data);
}

 const createPokemonCard = (pokemon) => {
	const pokemonEl = document.createElement('div')
	pokemonEl.classList.add('pokemon')

	const name = pokemon.name[0].toUpperCase() +pokemon.name.slice(1)
	const id =pokemon.id.toString().padStart(3, '0')
	const poke_types = pokemon.types.map(type => type.type.name)
	const type = main_types.find(type => poke_types.indexOf(type) > -1 )
	const color = colors[type];
	pokemonEl.style.backgroundColor = color;

	const pokemonInnerHTML = '<div class="img-container">	<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/crystal/'+pokemon.id+'.png" alt=""></div><div class="info"><span class="number">'+id+'</span><h3 class="name">'+name+'</h3><small class="type">Type: <span> '+type+' </span></small></div>';	
	
	pokemonEl.innerHTML = pokemonInnerHTML;
	// console.log('poke_container',poke_container)
	poke_container.appendChild(pokemonEl);
 }

 fetchPokemons()