window._ = require('lodash')
window.config = require('./config.json')
window.keys = config.keys
window.remote = require('electron').remote
window.Menu = window.remote.Menu
window.MenuItem = window.remote.MenuItem
