const { app, BrowserWindow } = require('electron')
const config = require('./config.json')

// Keep a global reference of the window object, if you don't, the window will
// be closed automatically when the JavaScript object is garbage collected.
let win

function createWindow () {
    win = new BrowserWindow({ width: 800, height: 600, frame: false,
    alwaysOnTop: Boolean(config.top), webPreferences: {
        nodeIntegration: true
        }
         })

    win.loadFile('src/index.html')

    win.on('closed', () => {
        win = null
    })
}

app.on('ready', createWindow)

app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
        app.quit()
    }
})

app.on('activate', () => {
    if (win === null) {
        createWindow()
    }
})
