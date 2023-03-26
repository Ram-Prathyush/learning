const resultEl = document.getElementById('result')
const lengthEl = document.getElementById('length')
const uppercaseEl = document.getElementById('uppercase')
const lowercaseEl = document.getElementById('lowercase')
const symbolsEl = document.getElementById('symbols')
const numbersEl = document.getElementById('numbers')
const generateEl = document.getElementById('generate')
const clipboardEl = document.getElementById('clipboard')

randomFunc = {
    lower:getRandomLower,
    upper:getRandomUpper,
    symbol:getRandomSymbols,
    number:getRandomNo
}

clipboardEl.addEventListener('click', () => {
    const textarea = document.createElement('textarea')
    const password = resultEl.innerText

    if(!password){ return }

    textarea.value = password
    document.body.appendChild(textarea)
    textarea.select()
    document.execCommand('copy')
    textarea.remove()
    alert('Copied to clipboard succsfully!')

})

generateEl.addEventListener('click', () => {
    const length = + lengthEl.value
    const hasLower  = lowercaseEl.checked
    const hasUpper  = uppercaseEl.checked
    const hasSymbol  = symbolsEl.checked
    const hasNumbers  = numbersEl.checked

    resultEl.innerText = generatePassword(hasLower, hasUpper, hasNumbers, hasSymbol, length)
})

function generatePassword(lower, upper, number, symbol, length){
    let generatedPassword = ''
    const typesCount = lower + upper + number + symbol
    const typesArr = [{upper}, {lower}, {number}, {symbol}].filter(item => Object.values(item)[0])
    
    if(typesCount === 0){
        return''
    }
    for(let i = 0; i < length; i+=typesCount){
        typesArr.forEach(type => {
            const funcName = Object.keys(type)[0]
            generatedPassword += randomFunc[funcName]()
        })
    }
    const finalPassowrd = generatedPassword.slice(0, length)

    return finalPassowrd
}
function getRandomLower(){
    return String.fromCharCode(Math.floor(Math.random()*26) + 97)
}

function getRandomUpper(){
    return String.fromCharCode(Math.floor(Math.random()*26) + 65)
}

function getRandomNo(){
    return String.fromCharCode(Math.floor(Math.random()*10) + 48)
}
function getRandomSymbols(){
    const symbols = '!@#$%^&*)(":;.><,/?{[}]_-+=`~'
    return symbols[Math.floor(Math.random()*symbols.length)]
}

getRandomSymbols()