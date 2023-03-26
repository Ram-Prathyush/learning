const imgs = document.getElementById('imgs');
const leftBtn = document.getElementById('left');
const rightBtn = document.getElementById('right');

const img = document.querySelectorAll('#imgs img');

let idx = 0;

let interval = setInterval(run, 2000)

function run(){
    idx++

    changeImg()
}

function changeImg(){
    if(idx > img.length - 1){
    idx = 0;

} else if(idx < 0){
    idx = img.length - 1;
}

    imgs.style.transform = `translate(${-idx * 500}px)`
}

function restetInterval(){
    clearInterval(interval)

    interval = setInterval(run, 2000)
}

rightBtn.addEventListener('click', () => {
    idx++

    changeImg()
    restetInterval()
})


leftBtn.addEventListener('click', () => {
    idx--

    changeImg()
    restetInterval()
})
