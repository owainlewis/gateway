package io.forward.gateway.core.backend

import akka.http.scaladsl.model.{HttpRequest, HttpResponse}

import scala.concurrent.Future

trait Backend {
  def apply(request: HttpRequest): Future[HttpResponse]
}