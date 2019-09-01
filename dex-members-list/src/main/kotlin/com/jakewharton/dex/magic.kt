package com.jakewharton.dex

internal val CLASS_MAGIC = byteArrayOf(0xCA.toByte(), 0xFE.toByte(), 0xBA.toByte(), 0xBE.toByte())
internal val DEX_MAGIC = byteArrayOf(0x64, 0x65, 0x78, 0x0a, 0x30, 0x33, 0x35, 0x00)
internal val ZIP_MAGIC = byteArrayOf(0x04, 0x03, 0x4b, 0x50)