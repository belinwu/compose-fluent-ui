

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarAssistant: ImageVector
    get() {
        if (_calendarAssistant != null) {
            return _calendarAssistant!!
        }
        _calendarAssistant = fluentIcon(name = "Filled.CalendarAssistant") {
            fluentPath {
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(3.52f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.02f, 21.0f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(18.0f)
                close()
            }
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.75f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
            }
            fluentPath {
                moveTo(17.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(17.1f, 14.0f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.35f, 0.0f, 0.59f, 0.35f, 0.47f, 0.68f)
                lineTo(18.5f, 16.0f)
                horizontalLineToRelative(0.63f)
                curveToRelative(0.38f, 0.0f, 0.6f, 0.41f, 0.4f, 0.73f)
                lineToRelative(-2.63f, 4.03f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.92f, -0.44f)
                lineToRelative(0.77f, -2.32f)
                horizontalLineToRelative(-0.78f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.47f, -0.68f)
                lineToRelative(1.13f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, -0.32f)
                close()
            }
        }
        return _calendarAssistant!!
    }

private var _calendarAssistant: ImageVector? = null
