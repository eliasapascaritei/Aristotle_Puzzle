package controllers

import algorithm.Solver
import play.api._
import play.api.mvc._

import scala.util.Random

class Application extends Controller {

  def index = Action {
    Ok(views.html.index(None))
  }

  def getSolution = Action {
    val solution = List(Random.shuffle(Solver.solvePuzzle()).head)
    Ok(views.html.index(toDiamondString(solution), Some(solution)))
  }

  def toDiamondString(sol: List[List[Any]]) = {
    val all = sol.map{a =>
      s"<br>"
      s"<br>    ${a(0)},${a(1)},${a(2)}"+
      s"<br>  ${a(3)},${a(4)},${a(5)},${a(6)}"+
      s"<br> ${a(7)},${a(8)},${a(9)},${a(10)},${a(11)}"+
      s"<br>  ${a(12)},${a(13)},${a(14)},${a(15)}"+
      s"<br>   ${a(16)},${a(17)},${a(18)}"+
      s"<br>"
    }.mkString("<br>")
  Some(all)
  }

}