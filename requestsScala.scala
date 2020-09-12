object httpScala {
  def main(args: Array[String]): Unit = {
    val t0 = System.nanoTime()
    val s = requests.Session()
    1 to 50 foreach { _ => make_call(s) }
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0))
  }

  def make_call(s: requests.Session) {
    val r = s.get("http://www.confessionsofadataguy.com")
    println("Finished call.")
  }
}
