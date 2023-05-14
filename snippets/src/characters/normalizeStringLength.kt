package characters

fun normalizeStringLength(str: String, nrchars: Int = 20): String {
    return if (str.length < nrchars)
        str.padEnd(nrchars, ' ')
    else if (str.length > nrchars)
        str.substring(0, nrchars)
    else
        str
}