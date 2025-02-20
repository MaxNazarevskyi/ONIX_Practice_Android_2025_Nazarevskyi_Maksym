class HTML {
    private val elements = mutableListOf<Body>()

    fun body(init: Body.() -> Unit) {
        val body = Body().apply(init)
        elements.add(body)
    }

    override fun toString(): String {
        return "<html>\n${elements.joinToString("\n")}\n</html>"
    }
}

class Body {
    private val elements = mutableListOf<Paragraph>()

    fun p(text: String) {
        elements.add(Paragraph(text))
    }

    override fun toString(): String {
        return "  <body>\n${elements.joinToString("\n")}\n  </body>"
    }
}

class Paragraph(private val text: String) {
    override fun toString(): String {
        return "    <p>$text</p>"
    }
}

fun html(init: HTML.() -> Unit): HTML {
    return HTML().apply(init)
}

fun main() {
    val page = html {
        body {
            p("Hello, Kotlin DSL!")
            p("This is a custom HTML generator.")
        }
    }

    println(page)
}
