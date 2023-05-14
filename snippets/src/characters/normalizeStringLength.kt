package characters

fun normalizeStringLength(str: String, length: Int): String {
    return if (str.length < length)
        str.padEnd(length, ' ')
    else if (str.length > length)
        str.substring(0, length)
    else
        str
}