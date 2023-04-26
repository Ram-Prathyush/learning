const screens = document.querySelectorAll('.screen')
const choose_insect_btns = document.querySelectorAll('.choose-insects-btn')
const start_btn = document.getElementById('start-btn')
const game_container = document.querySelector('.game-container')
const timeEl = document.getElementById('time')
const scoreEl = document.getElementById('score')
const message = document.querySelector('.message')
let seconds = 0;
let score = 0;
let selectedInsects = {}

start_btn.addEventListener('click', () => {
    screens[0].classList.add('up')
})

choose_insect_btns.forEach(btn => {
    btn.addEventListener('click', () => {
        const img = btn.querySelector('img')
        const src = img.getAttribute('src')
        const alt = img.getAttribute('alt')
        selectedInsects = {src, alt}
        screens[1].classList.add('up')
        setTimeout(createInsect, 1000);
        startGame()
    })
})

function startGame(){
    setInterval(increaseTime, 1000)
}

function increaseTime(){
    let m = Math.floor(seconds / 60)
    let s = seconds % 60
    m = m < 10 ? `0${m}`:m
    s = s < 10 ? `0${s}`:s
    timeEl.innerHTML = `
    Time: ${m}:${s}
    `
    seconds++
}

function createInsect(){
    const insect = document.createElement('div')
    insect.classList.add('insect')
    const {x, y} = randomLocation()
    insect.style.top = `${y}px`
    insect.style.left = `${x}px`
    insect.innerHTML = `
    <img src = "${selectedInsects.src}" alt="${selectedInsects.alt}" style="transform: rotate(${Math.random() * 360}deg)" />
    `

    insect.addEventListener('click', catchInsect)
    console.log('abc', game_container)
    game_container.appendChild(insect)
}

function randomLocation() {
    const width = window.innerWidth
    const height = window.innerHeight
    const x = Math.random() * (width - 200) + 100
    const y = Math.random() * (height - 200) + 100
    return {x, y}
}

function catchInsect() {
    increaseScore()
    console.log('ttt', this)
    this.classList.add('caught')
    setTimeout(() => this.remove(), 2000)
    addInsects()
}

function addInsects(){
    setTimeout(createInsect, 1000)
    setTimeout(createInsect, 1500)
}

function increaseScore() {
    score++
    if(score > 19) {
        message.classList.add('visible')
    }
    scoreEl.innerHTML = `
    Score: ${score}
    `
}