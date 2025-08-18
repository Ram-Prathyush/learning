const container = document.getElementById('container')

const colors = [ '#d0d0ff', '#a36dc1', '#39e195', '#924efe', '#21c0dc', '#56aeef']
const SQUARES = 512

for(let i = 0; i < SQUARES; i++){
const square = document.createElement('div')
square.classList.add('square')

square.addEventListener('mouseover', () => setColour(square))

square.addEventListener('mouseout', () => removeColour(square))

container.appendChild(square)
}

function setColour(element) {
    const color = getRandomColour()
    element.style.background = color;
    element.style.boxShadow = `0 0 2px ${color}, 0 0 10px ${color}`;
}

function removeColour(element){
    element.style.background = '#1d1d1d'
    element.style.boxShadow = '0 0 2px #000'
}

function getRandomColour(){
    return colors[Math.floor(Math.random() * colors.length)]
}