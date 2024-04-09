

const express    = require('express');
const mysql      = require('mysql');
const dbconfig   = require('./db');
const connection = mysql.createConnection(dbconfig);
const path = require('path');
const bp = require('body-parser');
const app = express();
var session = require('express-session');

app.use(express.static('public'));
app.use(bp());
app.use(session({
    secret: 'jomijin',
    resave: true,
    saveUninitialized: true
}))

connection.connect(error=>{
  if(error) throw error;
});
// configuration =========================
app.set('port', process.env.PORT || 3600);



app.get("/", function(req, res){
  res.sendfile(__dirname+'/test.html');
});


app.post('/save', (req, res) => {

    console.log(sessionStorage.getItem('userid'));

  var pk = 0;
  var title = req.body.title;
  var content = req.body.content;
  var name = req.body.name;
  var artist = req.body.artist;
  var id=req.session.user_id;
  connection.query('SELECT count(post_id) AS A from posts', (error, rows) => {
      if (error) throw error;
      console.log(typeof rows[0].A);
      pk = rows[0].A;
      console.log(id+'aaaaaaaaaaaa');
//user_id session 아이디 못 불러옴
      connection.query(`INSERT INTO posts(post_id, songTitle, singer, title, 
        content, member_userid, view) VALUES(${pk},'${name}','${artist}',
        '${title}','${content}', '${id}', 0)`, (error, rows)=>{
        if (error) throw error;
        res.send("ok");
      });
  });
});
app.listen(app.get('port'), () => {
  console.log('Express server listening on port ' + app.get('port'));
});