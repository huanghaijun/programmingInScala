package com.neusoft.hudson

class Test {
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  def max2(x: Int, y: Int) = if (x > y) x else y
}