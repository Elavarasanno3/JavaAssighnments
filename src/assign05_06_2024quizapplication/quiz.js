const quizData = [
                   {
                     "question": "Which city is known as the Silicon Valley of India?",
                     "options": [
                       "Mumbai",
                       "Bengaluru",
                       "Chennai",
                       "Hyderabad"
                     ],
                     "answer": "Bengaluru"
                   },
                   {
                     "question": "Who is known as the Father of the Indian Constitution?",
                     "options": [
                       "Mahatma Gandhi",
                       "B.R. Ambedkar",
                       "Jawaharlal Nehru",
                       "Sardar Vallabhbhai Patel"
                     ],
                     "answer": "B.R. Ambedkar"
                   },
                   {
                     "question": "Which river is known as the Ganga of the South?",
                     "options": [
                       "Yamuna",
                       "Godavari",
                       "Krishna",
                       "Kaveri"
                     ],
                     "answer": "Godavari"
                   },
                   {
                     "question": "Which Indian state is known as the Land of Five Rivers?",
                     "options": [
                       "Punjab",
                       "Haryana",
                       "Uttar Pradesh",
                       "Rajasthan"
                     ],
                     "answer": "Punjab"
                   },
                   {
                     "question": "What is the national flower of India?",
                     "options": [
                       "Rose",
                       "Lotus",
                       "Jasmine",
                       "Marigold"
                     ],
                     "answer": "Lotus"
                   },
                   {
                     "question": "Which Indian city is famous for its Mysore Palace?",
                     "options": [
                       "Mysore",
                       "Jaipur",
                       "Kolkata",
                       "Ahmedabad"
                     ],
                     "answer": "Mysore"
                   },
                   {
                     "question": "Who was the first female Prime Minister of India?",
                     "options": [
                       "Indira Gandhi",
                       "Sonia Gandhi",
                       "Pratibha Patil",
                       "Sushma Swaraj"
                     ],
                     "answer": "Indira Gandhi"
                   },
                   {
                     "question": "Which Indian state is known as the Land of White Elephants?",
                     "options": [
                       "Kerala",
                       "Assam",
                       "West Bengal",
                       "Gujarat"
                     ],
                     "answer": "Kerala"
                   },
                   {
                     "question": "Who is known as the Missile Man of India?",
                     "options": [
                       "A.P.J. Abdul Kalam",
                       "Narendra Modi",
                       "Manmohan Singh",
                       "Atal Bihari Vajpayee"
                     ],
                     "answer": "A.P.J. Abdul Kalam"
                   },
                   {
                     "question": "What is the national tree of India?",
                     "options": [
                       "Banyan",
                       "Neem",
                       "Peepal",
                       "Bamboo"
                     ],
                     "answer": "Banyan"
                   }
                 ]


let currentQuestion = 0;
let score = 0;

const questionElement = document.getElementById("question");
const optionsElement = document.getElementById("options");
const nextButton = document.getElementById("next-btn");
const resultContainer = document.getElementById("result-container");
const scoreElement = document.getElementById("score");

function loadQuestion() {
    const currentQuizData = quizData[currentQuestion];
    questionElement.innerText = currentQuizData.question;
    optionsElement.innerHTML = "";
    currentQuizData.options.forEach((option, index) => {
        const button = document.createElement("button");
        button.innerText = option;
        button.classList.add("option-btn");
        button.addEventListener("click", () => {
            selectAnswer(button, option);
        });
        optionsElement.appendChild(button);
    });
}

function selectAnswer(selectedButton, selectedOption) {
    const currentQuizData = quizData[currentQuestion];
    if (selectedOption === currentQuizData.answer) {
        score += 10;
        selectedButton.classList.add("clicked", "correct");
        alert("Correct!");
    } else {
        selectedButton.classList.add("clicked", "wrong");
        alert("Wrong! The correct answer is: " + currentQuizData.answer);
    }
    optionsElement.querySelectorAll(".option-btn").forEach(button => {
        button.disabled = true;
    });
    scoreElement.innerText = `Score: ${score}`;
    currentQuestion++;
    if (currentQuestion < quizData.length) {
        nextButton.disabled = false;
    } else {
        nextButton.disabled = true;
        showResult();
    }
}

function showResult() {
    quizContainer.style.display = "none";
    resultContainer.style.display = "block";
    scoreElement.innerText = `Your score: ${score} out of ${quizData.length * 10}`;
}

nextButton.addEventListener("click", loadQuestion);

loadQuestion();
