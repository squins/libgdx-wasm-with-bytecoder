package com.squins.gdx.backends.bytecoder.api.web.event

import de.mirkosertic.bytecoder.api.web.Event

/**
 * Waiting for Bytecoder release
 */
interface NativeEvent : Event {

    fun type(): String

}