package app.piko.keyviewer

import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener

class KeyListener : NativeKeyListener {
    override fun nativeKeyPressed(e: NativeKeyEvent) {
        println("Key pressed: ${NativeKeyEvent.getKeyText(e.keyCode)}")
    }

    override fun nativeKeyReleased(e: NativeKeyEvent) {
        println("Key released: ${NativeKeyEvent.getKeyText(e.keyCode)}")
    }

    override fun nativeKeyTyped(e: NativeKeyEvent) {
    }
}