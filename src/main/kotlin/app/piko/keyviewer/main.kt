package app.piko.keyviewer

import app.piko.keyviewer.gui.Frame
import org.jnativehook.GlobalScreen
import org.jnativehook.NativeHookException
import java.util.logging.LogManager
import kotlin.system.exitProcess

fun main() {
    LogManager.getLogManager().reset()
    try {
        GlobalScreen.registerNativeHook()
    } catch (e: NativeHookException) {
        exitProcess(1)
    }
    val listener = KeyListener()
    GlobalScreen.addNativeKeyListener(listener)
    val frame = Frame()
    frame.isVisible = true
}