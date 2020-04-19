
//this is not a safe way to implement a method, eventhough it technically is possible to do it this way
// the problem is, the compiler cannot help you detect errors, like using the wrong input for an incorrect paramater
// as in, putting a string for style where it was meant for an anchor. Resulting in an unexpected run-time "occurance"
def title(text: String, anchor: String, style: String): String =
  s"<a id='$anchor'><h1 class='$style'>$text</h1></a>"

//instead, try an use "tiny types", thereby making it possivle for the compiler to help you, like so:
class HtmlTextString(val value: String) extends AnyVal

class HtmlAnchorString(val value: String) extends AnyVal

class HtmlStyleString(val value: String) extends AnyVal

class HtmlString(val value: String) extends AnyVal

def title(text: HtmlTextString, anchor: HtmlAnchorString, style: HtmlStyleString): HtmlString =
  new HtmlString(s"<a id='$anchor'><h1 class='$style'>$text</h1></a>")

