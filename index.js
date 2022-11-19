const { app, BrowserWindow } = require("electron");
const url = require("url");
const { spawn } = require("child_process");
const jimp = require("jimp");


function newApp() {
  win = new BrowserWindow();
  win.loadURL(
    url.format({
      pathname: "index.html",
      slashes: true
    })
  );
}

jimp.read('img.jpg', (err, img) => {
  if (err) throw err;
  img
    .resize(1920, 1080) 
    .quality(100) 
    .posterize(70)
    .write('img_edited.png'); 

});


app.on("ready", newApp);
/* 
app.on("ready", () => {
  const runshit = spawn("node", ["jimp_manipulate.js"]);
  runshit.stdout.on("data", data => {
    console.log("data: ", data.toString());
  });
});

app.on("quit", () => {
  app.quit();
});
 */

//shape
//size
//color
//clear
//save
