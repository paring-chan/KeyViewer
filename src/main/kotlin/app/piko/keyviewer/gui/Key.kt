package app.piko.keyviewer.gui

import java.awt.Color
import javax.swing.JButton
import javax.swing.plaf.metal.MetalButtonUI

class Key(label: String) : JButton(label) {
    init {
        isBorderPainted = false
        isFocusPainted = false
        isEnabled = false
        background = Color.BLACK
        setUI(object : MetalButtonUI() {
            override fun getDisabledTextColor(): Color = Color.WHITE
        })
    }
}