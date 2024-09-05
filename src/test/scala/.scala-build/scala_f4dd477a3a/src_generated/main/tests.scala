

final class tests$_ {
def args = tests_sc.args$
def scriptPath = """tests.sc"""
/*<script>*/
import Recursion._

mcdTFA(List(3, 1, 1), List(2, 0, 3), List(2, 3, 5))

mcdEBez(963, 657)
/*</script>*/ /*<generated>*//*</generated>*/
}

object tests_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new tests$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export tests_sc.script as `tests`

