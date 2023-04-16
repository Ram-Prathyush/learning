const ratings = document.querySelectorAll('.rating')
const ratingsContainer = document.querySelector('.ratings-container')
const sendBtn = document.querySelector('#send')
const panel = document.querySelector('#panel')
let selectedRating = 'Happy'

console.log(selectedRating)

ratingsContainer.addEventListener('click', (e) => {
    if(e.target.parentNode.classList.contains('rating')){
        removeActive()
        e.target.parentNode.classList.add('active')
        selectedRating = e.target.nextElementSibling.innerHTML
    }
})

sendBtn.addEventListener('click', (e) => {
    panel.innerHTML = `
    <i class = "fas fa-heart"></i>
    <strong>Thank You!</strong>
    <br>
    <strong>Feedback: ${selectedRating}</strong>
    <br>
    <strong>We'll use your feedback to improve our <br>
    costumer support</strong>
    `
})

function removeActive() {
    for(let i = 0; i < ratings.length; i++){
    ratings[i].classList.remove('active')
    }
}