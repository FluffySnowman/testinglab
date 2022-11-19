const express = require("express");
const { spawn } = require("child_process");
const path = require('path');
const app = express();
const router = express.Router();

app.get('/', function(req, res) {
  res.sendFile(path.join(__dirname, 'mainsomething.html'));
});

app.get('/', function(req, res) {
  res.sendFile(path.join(__dirname, 'mapkitshit.js'));
});

app.use('/', router);
app.listen(process.env.port || 12345);

console.log("Running at Port 12345");

console.log("Fastmap running on 127.0.0.1:12345");