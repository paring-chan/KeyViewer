package app.piko.keyviewer.gui

import javax.swing.JFrame

class Frame : JFrame() {
    init {
        isUndecorated = true
        setBounds(100,100,200,50)
        isAlwaysOnTop = true
    }
}
