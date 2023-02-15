const jokeEl = document.getElementById('joke')
const jokeBtn = document.getElementById('jokeBtn')

generatJokes();

jokeBtn.addEventListener('click', generatJokes)

function generatJokes() {

    const config = {
        headers: {
            Accept: 'application/json'
        },
    }
    fetch('https://icanhazdadjoke.com', config).then((res) => res.json()).then((data) => {
        jokeEl.innerHTML = data.joke;
    })


}
