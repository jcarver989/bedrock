package com.granite

import org.scalajs.dom.raw.Node
import scala.scalajs.js.JSApp

trait GraniteApp[T] {
  protected def view(): Component[T]
  protected def initialState(): T
  protected val events = new Events[AppEvent]()
  protected lazy val renderer = new Renderer(initialState, view, events)
}