package app.piko.keyviewer

import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener

class KeyListener : NativeKeyListener {
    val pressedKeys: HashSet<Int> = HashSet()

    override fun nativeKeyPressed(e: NativeKeyEvent) {
        if (pressedKeys.add(e.keyCode)) {
            println("Key pressed: ${NativeKeyEvent.getKeyText(e.keyCode)}")
        }
    }

    override fun nativeKeyReleased(e: NativeKeyEvent) {
        if (pressedKeys.remove(e.keyCode)) {
            println("Key released: ${NativeKeyEvent.getKeyText(e.keyCode)}")
        }
    }

    override fun nativeKeyTyped(e: NativeKeyEvent) {
    }
}