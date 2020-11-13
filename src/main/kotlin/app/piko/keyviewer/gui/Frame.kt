package app.piko.keyviewer.gui

import java.awt.GridLayout
import javax.swing.JFrame
import javax.swing.JPanel

class Frame : JFrame() {
    private val panel = JPanel()
    private val layout = GridLayout(1,4)

    init {
        panel.layout = layout
        contentPane = panel
        isUndecorated = true
        setSize(200,50)
        isAlwaysOnTop = true
        val buttons = Array(4) {
            val btn = Key("$it")
            btn
        }
        buttons.forEach { panel.add(it) }
    }
}
