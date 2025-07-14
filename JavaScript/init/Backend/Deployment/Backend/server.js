import express from 'express';

const app = express();

const port = process.env.port || 3000;

const jokes = [
    {
        "id": 1,
        "question": "Why don't scientists trust atoms?",
        "answer": "Because they make up everything!"
    },
    {
        "id": 2,
        "question": "What did one ocean say to the other ocean?",
        "answer": "Nothing, they just waved."
    },
    {
        "id": 3,
        "question": "Why did the scarecrow win an award?",
        "answer": "Because he was outstanding in his field!"
    },
    {
        "id": 4,
        "question": "How do you organize a space party?",
        "answer": "You planet!"
    },
    {
        "id": 5,
        "question": "Why did the bicycle fall over?",
        "answer": "Because it was two-tired!"
    }
];


app.get('/', (req, res) => {
    res.send('Server is ready');
})

app.get('/jokes', (req, res) => {
    res.send(jokes);
})

app.listen(port, () => {
    console.log(`Server at ${port}`); 
})
