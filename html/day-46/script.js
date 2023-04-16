const quizData = [
    {
        question: "Strongest Pokemon of all time?",
        a: "Mew",
        b: "Mewtow",
        c: "Genestic",
        d: "Arcuese",
        correct: "d",
    },
    {
        question: "Slowest Pokemon of all time?",
        a: "Slowbro",
        b: "Slowpok",
        c: "Slowking",
        d: "Persoma",
        correct: "b",
    },
    {
        question: "Best pokemon trainer",
        a: "Leon",
        b: "Diantha",
        c: "Chintia",
        d: "Ash Ketchum",
        correct: "d",
    },
    {
        question: "Fastest Pokemon of all time",
        a: "Deoxys",
        b: "Silvion",
        c: "Omastar",
        d: "Darkri",
        correct: "a",
    },
    {
        question: "Ash ketchums strongest pokemon",
        a: "pikachu",
        b: "greninga",
        c: "Goodra",
        d: "Muk",    
        correct: "c",
    }, 
];

const quiz = document.getElementById('quiz')
const answerEls = document.querySelectorAll('.answer')
const questionEl = document.getElementById('question')
const a_text = document.getElementById('a_text')
const b_text = document.getElementById('b_text')
const c_text = document.getElementById('c_text')
const d_text = document.getElementById('d_text')
const submitBtn = document.getElementById('submit')

let currentQuiz = 0;
let score = 0;

loadQuiz()

function loadQuiz () {

    deselectAnswers()

    const currentQuizData = quizData[currentQuiz]
    questionEl.innerText = currentQuizData.question

    a_text.innerText = currentQuizData.a
    b_text.innerText = currentQuizData.b
    c_text.innerText = currentQuizData.c
    d_text.innerText = currentQuizData.d
}

function deselectAnswers () {
    answerEls.forEach(answer => answer.checked = false)
}

function getSelected () {
    let answer

    answerEls.forEach(answerEl => {
        if(answerEl.checked){
            answer = answerEl.id
        }
    })

    return answer
}

submitBtn.addEventListener('click', () => {
    const answer = getSelected()
    
    if(answer) {
        if(answer === quizData[currentQuiz].correct){
            score++
        }

        currentQuiz++

        if(currentQuiz < quizData.length){
            loadQuiz()
        }else {
            quiz.innerHTML = `
            <h2>You answerd ${score}/${quizData.length} correctly</h2>
            <button onclick = "location.reload()">Reload</button>
            `
        }
    }
})