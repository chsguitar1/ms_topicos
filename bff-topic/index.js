const express = require('express');
const axios = require('axios');

const app = express();
const port = 3000;

app.get('/api/user', async(req, res) => {
    try {
        const response = await axios.get('http://localhost:8080/users');
        res.json(response.data);
    } catch (error) {
        console.error(error);
        res.status(500).send('Erro ao obter os dados do usuário do serviço');
    }
});

app.get('/api/health', async(req, res) => {
    try {
        const response = await axios.get('http://localhost:8080/health');
        res.json(response.data);
    } catch (error) {
        console.error(error);
        res.status(500).send('Erro no serviço');
    }
});

app.post('/api/login', async(req, res) => {
    try {
        const request = req.body
        const response = await axios.post('http://localhost:8080/login', request);
        res.json(response.data);
    } catch (error) {
        console.error(error);
        res.status(500).send('Erro no serviço');
    }

});

app.listen(port, () => {
    console.log(`Servidor BFF rodando em http://localhost:${port}`);
});