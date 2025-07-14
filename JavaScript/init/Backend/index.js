require('dotenv').config()
const express = require('express')
const app = express()
const port = process.env.port

app.get('/', (req, res) => {
    res.send('Hello World!')
})

app.get('/twitter', (req, res) => {
    res.send('archit123')
})

const githubData = {
    "login": "ar-chit",
    "id": 72187362,
    "node_id": "MDQ6VXNlcjcyMTg3MzYy",
    "avatar_url": "https://avatars.githubusercontent.com/u/72187362?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/ar-chit",
    "html_url": "https://github.com/ar-chit",
    "followers_url": "https://api.github.com/users/ar-chit/followers",
    "following_url": "https://api.github.com/users/ar-chit/following{/other_user}",
    "gists_url": "https://api.github.com/users/ar-chit/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/ar-chit/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/ar-chit/subscriptions",
    "organizations_url": "https://api.github.com/users/ar-chit/orgs",
    "repos_url": "https://api.github.com/users/ar-chit/repos",
    "events_url": "https://api.github.com/users/ar-chit/events{/privacy}",
    "received_events_url": "https://api.github.com/users/ar-chit/received_events",
    "type": "User",
    "site_admin": false,
    "name": null,
    "company": null,
    "blog": "",
    "location": null,
    "email": null,
    "hireable": null,
    "bio": null,
    "twitter_username": null,
    "public_repos": 13,
    "public_gists": 0,
    "followers": 0,
    "following": 0,
    "created_at": "2020-10-01T06:32:36Z",
    "updated_at": "2023-12-25T09:37:23Z"
}

app.get('/github', (req, res) => {
    res.json(githubData);
})

app.get('/login', (req, res) => {
    res.send('<h1>please login here');
})

app.get('/reddit', (req, res) => {
    res.send('<h2>Legends wander here');
})

app.listen(process.env.port, () => {
    console.log(`Example app listening on port ${port}`)
})