import scalaj.http._


object httpScala {
  def main(args: Array[String]): Unit = {
    val request: HttpRequest = Http("http://www.confessionsofadataguy.com/")
    1 to 50 foreach { _ => make_call(request) }
  }

  def make_call(request: HttpRequest) {
    val response = request.asString
    println("finished call.")
  }
}
