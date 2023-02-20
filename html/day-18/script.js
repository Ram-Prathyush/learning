const API_URl = 'https://api.themoviedb.org/3/discover/movie?with_genres=10751&api_key=20c582b8cb68408c8313f9c8d4e47e73&page=1'
const IMG_PATH = 'https://image.tmdb.org/t/p/w1280'
const SEARCH_URL = 'https://api.themoviedb.org/3/search/movie?with_genres=10751&sort_by=popularity.desc&api_key=20c582b8cb68408c8313f9c8d4e47e73&query='

const main = document.getElementById('main')
const form = document.getElementById('form');
const search = document.getElementById('search');

getMovies(API_URl)

async function getMovies(url) {
    const res = await fetch(url);
    const data = await res.json();

    showMovie(data.results)
}

function showMovie(movies) {
    main.innerHTML = '';

    movies.forEach((movie) => {
        const { title, poster_path, vote_average, overview, release_date } = movie;
        const year = new Date(release_date).getUTCFullYear();
        if (year > 1998) {
            const movieEl = document.createElement('div')

            movieEl.classList.add('movie');

            movieEl.innerHTML = `
        <img src="${IMG_PATH + poster_path}" alt="${title}">
        <div class="movie-info">
            <h3>${title}</h3>
            <span class="${getClassByRate(vote_average)}">${vote_average}</span>
        </div>
        <div class="overview">
            <h3>Overview</h3>
            ${overview}
        </div>
    
   `
            main.appendChild(movieEl)
        }
    });
}

form.addEventListener('submit', (e) => {
    e.preventDefault();

    const term = search.value

    if (term && term != '') {
        getMovies(SEARCH_URL + term);

        search.value = '';
    } else {
        window.location.reload();
    }
})

function getClassByRate(vote) {
    if (vote >= 8) {
        return 'green';
    } else if (vote >= 6) {
        return 'orange';
    } else {
        return 'red';
    }

}