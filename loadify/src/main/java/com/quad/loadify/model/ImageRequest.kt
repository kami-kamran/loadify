package com.quad.loadify.model

import android.graphics.Bitmap

internal data class ImageRequest(
    val data: Any,
    val headers: Map<String, String> = emptyMap(),
    val key: String? = null,
    val transform: ((Bitmap) -> Bitmap)? = null,
    val isCacheEnabled: Boolean = true,
)