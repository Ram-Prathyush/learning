const button = document.getElementById('button')
const toasts = document.getElementById('toasts')

const messages = [
    'Message 1',
    'Message 2',
    'Message 3',
    'Message 4'
]

const types = ['info', 'sucess', 'error', 'nice']

button.addEventListener('click', () => creatNo())

function creatNo(message = null, type = null){
    const notif = document.createElement('div')
    notif.classList.add('toast')
    console.log(getRandomTypes());
    notif.classList.add(type ? type : getRandomTypes())

    notif.innerText = message ? message : getRandomMessage()

    toasts.appendChild(notif)


    setTimeout(() => {
        notif.remove()
    }, 4000)
}

function getRandomMessage(){
    return messages[Math.floor(Math.random()*messages.length)]
}

function getRandomTypes(){
    return types[Math.floor(Math.random()*types.length)]
}
