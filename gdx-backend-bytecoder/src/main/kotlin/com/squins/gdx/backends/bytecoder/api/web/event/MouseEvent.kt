package com.squins.gdx.backends.bytecoder.api.web.event

import de.mirkosertic.bytecoder.api.OpaqueProperty

/**
 * Waiting for Bytecoder release
 */
interface MouseEvent : NativeEvent {

    @OpaqueProperty
    fun button(): Int

    @OpaqueProperty
    fun clientX(): Float

    @OpaqueProperty
    fun clientY(): Float
}