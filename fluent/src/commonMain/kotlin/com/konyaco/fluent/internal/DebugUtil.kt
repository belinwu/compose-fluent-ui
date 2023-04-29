package com.konyaco.fluent.internal

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout


internal fun Modifier.debugConstraints(id: String = "unknown") =
    layout { measurable, constraints ->
        println("[$id] $constraints")
        val p = measurable.measure(constraints)
        layout(p.width, p.height) {
            p.place(0, 0)
        }
    }