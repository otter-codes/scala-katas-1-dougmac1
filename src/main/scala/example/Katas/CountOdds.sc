def odd(int: Int): List[Int] = {
  val list = List.range(1, int)
  list.filter(x => x % 2 != 0)

}
odd(19)



def even(int: Int): List[Int] = {
  val list = List.range(1, int)
  list.filter(x => x % 2 == 0)

}
even(20)
