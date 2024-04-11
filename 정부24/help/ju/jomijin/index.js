const express = require('express');
const mysql = require('mysql');
const dbconfig = require('./db');
const connection = mysql.createConnection(dbconfig);
const path = require('path');
const bp = require('body-parser');
var session = require('express-session');
const app = express();
app.use(express.static('public'));

app.use(session({
  secret: 'jomijin',
  resave: false,
  saveUninitialized:true
}))

app.use(bp());
connection.connect(error => {
  if (error) throw error;
});

// configuration =========================
app.set('port', process.env.PORT || 3600);
app.get("/", function (req, res) {
  // console.log('~~~~~~~~~~~~~~~~~~~~~~~~~');
  //    console.log(req.session.userid);
  // console.log('~~~~~~~~~~~~~~~~~~~~~~~~~');
  res.sendfile("public/test.html");
});

app.post('/save', (req, res) => {
  var pk = 0;
  var title = req.body.title;
  var content = req.body.content;
  var name = req.body.name;
  var artist = req.body.artist;
  var id = req.body.id; // session data 받아오기
  connection.query('SELECT count(post_id) AS A from posts', (error, rows) => {
    if (error) throw error;
    // console.log(typeof rows[0].A+'~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
    pk = rows[0].A;
    // console.log(id+'aaaaaaaaaaaa');
    //user_id session 아이디 못 불러옴
    connection.query(`INSERT INTO posts(post_id, songTitle, singer, title, content, member_userid, view) VALUES(${pk},'${name}','${artist}','${title}','${content}', '${id}', 0)`, (error, rows) => {
      if (error) throw error;
      res.send("ok");
    });
  });
});
app.listen(app.get('port'), () => {
  console.log('Express server listening on port ' + app.get('port'));
});