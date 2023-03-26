const loveMe = document.querySelector('.loveMe')
const form = document.querySelector('#form')

let clickTime = 0;
let timesClicked = 0;

loveMe.addEventListener('click', (e) => {
    if(clickTime === 0){
        clickTime = new Date().getTime()
    }else{
        if((new Date().getTime() - clickTime)< 800){
            creatHeart(e)
            clickTime = 0;
        }else{
            clickTime = new Date().getTime()
        }
    }
})

const creatHeart = (e) => {
    const heart = document.createElement('i')
    heart.classList.add('fas')
    heart.classList.add('fa-heart')

    const x = e.clientX
    const y = e.clientY

    const leftOffset = e.target.offsetLeft
    const topOffset = e.target.offsetTop

    const xInside = x - leftOffset
    const yInside = y - topOffset

    heart.style.top = `${yInside}px`
    heart.style.left = `${xInside}px`

    loveMe.appendChild(heart)

    times.innerHTML = ++timesClicked

    setTimeout(() =>  heart.remove(), 1000)
}