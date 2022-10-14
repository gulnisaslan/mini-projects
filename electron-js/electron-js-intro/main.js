// Electron uygulaması için gerekli olan üç 
// variable-Kısacası import

const electron = require("electron");
const url = require("url")
const path = require("path");
const { BrowserWindow } = require("electron/main");
const { protocol } = require("electron");

// electron.js kullanmak için obje tanımladık.
const {app}=electron;

//
let mainWindow;

app.on('ready',()=>{
    mainWindow = new BrowserWindow({})
    mainWindow.loadURL(
        url.format({
            pathname:path.join(__dirname,"main.html"),
            protocol:"file:",
            slashes:true
        })
    )
})

