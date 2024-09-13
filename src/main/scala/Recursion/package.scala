package object Recursion {
  /**
   * Ejercicio 1.1.1
   * máximo común divisor a partir del teorema fundamental de la aritmética.
   */
  type Chip = List[Int] => List[Int];

  def createUnaryChip(function: Int => Int): Chip = {
    (entry: List[Int]) => {
      List(function(entry.head))
    }
  }

  def createBinaryChip(function: (Int, Int) => Int): Chip = {
    (entry: List[Int]) => {
      List(function(entry.head, entry.tail.head))
    }
  }

  def halfAdder: Chip = {
    val not = createUnaryChip((x: Int) => (1-x));
    val and = createBinaryChip((x: Int, y: Int) => (x*y));
    val or = createBinaryChip((x: Int, y: Int) => (x+y-x*y));
    (entry: List[Int]) =>{
      val carry = and(entry);
      val sum = and(List(or(entry).head, not(carry).head));
      List(carry.head, sum.head);
    }
  }

  def fullAdder: Chip = {
    val not = createUnaryChip((x: Int) => (1 - x));
    val and = createBinaryChip((x: Int, y: Int) => (x * y));
    val or = createBinaryChip((x: Int, y: Int) => (x + y - x * y));
    val ha = halfAdder;
    (entry: List[Int]) => {
      val a = entry.head;
      val b = entry.tail.head;
      val cin = entry.tail.tail.head;

      val ha1 = ha(List(b, cin));
      val carry1 = ha1.head;
      val sum1 = ha1.tail.head;

      val ha2 = ha(List(a, sum1));
      val carry2 = ha2.head;
      val sum2 = ha2.tail.head;

      val cout = or(List(carry2, carry1));

      List(cout.head, sum2);
    }
  }

}
