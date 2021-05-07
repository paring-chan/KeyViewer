const {app, BrowserWindow} = require('electron')
const config = require('./config.json')

app.allowRendererProcessReuse = false

let win

function createWindow() {
    win = new BrowserWindow({
        width: 50 * config.keys.length, height: (
            !config.kps && !config.total
        ) ? 50 : 110, frame: false,
        alwaysOnTop: Boolean(config.top),
        resizable: false,
        webPreferences: {
            preload: require('path').join(__dirname, 'preload.js'),
            nodeIntegration: true,
            enableRemoteModule: true,
            contextIsolation: false,
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
